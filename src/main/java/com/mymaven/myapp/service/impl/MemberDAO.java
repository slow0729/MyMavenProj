package com.mymaven.myapp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mymaven.myapp.service.MemberDTO;
import com.mymaven.myapp.service.MemberService;

@Service("memberDao")
public class MemberDAO implements MemberService {

	@Override
	public List<Map> selectList(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectOne(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(Map map) {
		// TODO Auto-generated method stub
		return false;
	}

}
