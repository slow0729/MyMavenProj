package com.mymaven.myapp.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
 * .jsp로 이동:.tiles로
 * .bbs는 :forward:사용, tiles미적용
 *  타일이 필요없는 .jsp(Message.jsp)는 
 *  prefix/suffix그대로 적용(InternalResourceViewResolver)
 */
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.mymaven.myapp.service.impl.MemberServiceImpl;

@SessionAttributes("id")
@Controller
@RequestMapping("/MyPet/Auth")
public class AuthController {

	//서비스 주입]
	@Resource(name="memberService")
	private MemberServiceImpl service;
	
	//로그인 폼으로 이동]
	@RequestMapping("/Login.bbs")
	public String login() {
		return "member/Login.tiles";
	}//////////login
	//로그인 처리]
	@RequestMapping("/LoginProcess.bbs")
	public String process(
			@RequestParam Map map,
			Model model,
			SessionStatus status) {
		//서비스 호출]
		boolean isLogin=service.login(map);
		if(isLogin) {//회원인 경우
			//로그인 처리-세션영역에도(리퀘스트 영역과 함께) 저장
			model.addAllAttributes(map);
		}
		else {//비회원
			model.addAttribute("NotMember", "아이디와 비번 불일치");
			status.setComplete();//세션영역에 저장된 NotMember속성 삭제
		}
		//뷰(JSP)정보 반환]- 다시 로그인으로 이동
		return "login/Login.tiles";
	}////////////////////
	//로그아웃 처리]
	@RequestMapping("/Logout.bbs")
	public String logout(SessionStatus status) {
		//로그 아웃처리-세션영역에 속성 삭제]
		status.setComplete();
		//뷰(JSP)정보 반환]- 메인으로 이동
		return "forward:/";
	}
	
}
