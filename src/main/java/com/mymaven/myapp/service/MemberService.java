package com.mymaven.myapp.service;

import java.util.List;
import java.util.Map;

public interface MemberService {
	List<Map> selectList(Map map);
	MemberDTO selectOne(Map map);
	void insert(Map map);
	void delete(Map map);
	void update(Map map);
	boolean login(Map map);
}
