package com.aolei.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aolei.ssm.entity.Tag;
import com.aolei.ssm.service.TagDaoService;

@Controller
@RequestMapping("/tag")
public class TagController {
	@Resource
	private TagDaoService tagDaoService;
	
	@RequestMapping("showTag")
	public String toIndex(HttpServletRequest request,Model model){
		int tagId = Integer.parseInt(request.getParameter("tagId"));
		Tag tag = tagDaoService.getTagById(tagId);
		model.addAttribute("tag",tag);
		return "showTag";
	}
	
}
