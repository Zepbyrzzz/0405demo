package com.hhh.gmall.user.mapper;

import com.hhh.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
