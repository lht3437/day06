package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.ContentMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Content;
import com.xiaoshu.entity.ContentVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class ContentService {

	@Autowired
	ContentMapper contentMapper;

	




	public void deleteContent(Integer contentid) {
		// TODO Auto-generated method stub
		contentMapper.deleteByPrimaryKey(contentid);
	}






	public PageInfo<ContentVo> findList(ContentVo contentVo, Integer pageNum, Integer pageSize, String ordername,
			String order) {
		PageHelper.startPage(pageNum, pageSize);
		List<ContentVo> list= contentMapper.findList(contentVo);
		return new PageInfo<>(list);
	}








	
}
