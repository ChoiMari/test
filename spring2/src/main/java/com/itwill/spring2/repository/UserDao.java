package com.itwill.spring2.repository;

public interface UserDao {
    
    User selectByUserid(String userid);
    int insert(User user);
    User selectByUseridAndPassword(User user);
    
    //TODO userid로 id(pk) 뽑아내는 메서드
    User selectId(String userid);
}
