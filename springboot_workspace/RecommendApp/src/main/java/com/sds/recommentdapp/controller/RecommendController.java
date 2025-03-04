package com.sds.recommentdapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sds.recommendapp.domain.Member;
import com.sds.recommendapp.model.recommend.RecommendService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;


//영화 추천 요청을 처리하는 하위 컨트롤러
@Slf4j
@Controller
public class RecommendController {
	
	@Autowired
	private RecommendService recommendService;
	
	@GetMapping("/list/view")
	public String getList() {
		
		log.debug("getList 호출");
		
		/*
		Member member =(Member)session.getAttribute("member");
		
		//3단계 : 추천영화 목록 가져오기 
		List recommendList = recommendService.getList(member.getMember_idx());
		model.addAttribute("recommendList", recommendList);//저장 
		*/
		return "recommend/list";
	}
}
