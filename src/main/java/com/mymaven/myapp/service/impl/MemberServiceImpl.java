package com.mymaven.myapp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mymaven.myapp.service.MemberDTO;
import com.mymaven.myapp.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Resource(name="memberDao")
	private MemberDAO dao;
	@Override
	public List<Map> selectList(Map map) {
		return dao.selectList(map);
	}

	@Override
	public MemberDTO selectOne(Map map) {
		return dao.selectOne(map);
	}

	@Override
	public void insert(Map map) {
		dao.insert(map);
	}

	@Override
	public void delete(Map map) {
		dao.delete(map);
	}

	@Override
	public void update(Map map) {
		dao.update(map);
	}

	@Override
	public boolean login(Map map) {
		return dao.login(map);
	}

}
