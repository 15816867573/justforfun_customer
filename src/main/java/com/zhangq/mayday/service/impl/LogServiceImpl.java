package com.zhangq.mayday.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangq.mayday.mapper.custom.LogMapperCustom;
import com.zhangq.mayday.mapper.generator.LogMapper;
import com.zhangq.mayday.model.domain.Log;
import com.zhangq.mayday.model.domain.LogExample;
import com.zhangq.mayday.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class LogServiceImpl implements LogService {

	private static final String LOGS_CACHE_NAME = "logs";

	@Autowired
	private LogMapper logMapper;

	@Autowired
	private LogMapperCustom logMapperCustom;

	@Override
	@CacheEvict(value = LOGS_CACHE_NAME, allEntries = true, beforeInvocation = true)
	public void save(Log log) {
		logMapper.insert(log);
	}

	@Override
	@Cacheable(value = LOGS_CACHE_NAME, key = "'findLogs'+#page+#limit")
	public PageInfo<Log> findLogs(int page, int limit) {
		PageHelper.startPage(page, limit);
		LogExample example = new LogExample();
		example.setOrderByClause("log_id DESC ");
		List<Log> logs = logMapper.selectByExample(example);
		return new PageInfo<>(logs);
	}

	@Override
	@CacheEvict(value = LOGS_CACHE_NAME, allEntries = true, beforeInvocation = true)
	public void clear() {
		logMapperCustom.clear();
	}

}
