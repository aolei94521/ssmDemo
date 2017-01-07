package com.aolei.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aolei.ssm.dao.TagDao;
import com.aolei.ssm.entity.Tag;
import com.aolei.ssm.service.TagDaoService;

@Service("tagService")
public class TagDaoServiceImpl implements TagDaoService{
	@Resource
	private TagDao tagDao;

	public Tag getTagById(int id) {
		// TODO Auto-generated method stub
		return tagDao.selectById(id);
	}
	

}
