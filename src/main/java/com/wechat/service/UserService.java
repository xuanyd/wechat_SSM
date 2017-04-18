package com.wechat.service;  
  
import org.springframework.stereotype.Service;  
  
import com.wechat.domain.User;  
  
/** 
 * 功能概要：UserService接口类 
 *  
 */  
public interface UserService {  
    User selectUserById(Integer userId);  
  
}  