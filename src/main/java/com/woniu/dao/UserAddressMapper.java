package com.woniu.dao;

import com.woniu.domain.UserAddress;
import com.woniu.domain.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {
    long countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    int deleteByPrimaryKey(Integer uaid);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    List<UserAddress> selectByExample(UserAddressExample example);

    UserAddress selectByPrimaryKey(Integer uaid);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}