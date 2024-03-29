package com.sy.ms.mapper;

import com.sy.ms.dto.KillSuccessUserInfo;
import com.sy.ms.entity.ItemKillSuccess;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ItemKillSuccessMapper {
    int deleteByPrimaryKey(String code);

    int insert(ItemKillSuccess record);

    int insertSelective(ItemKillSuccess record);

    ItemKillSuccess selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(ItemKillSuccess record);

    int updateByPrimaryKey(ItemKillSuccess record);

    int countByKillUserId(@Param("killId") Integer killId, @Param("userId") Integer userId);

    KillSuccessUserInfo selectByCode(@Param("code") String code);

    int expireOrder(@Param("code") String code);

    List<ItemKillSuccess> selectExpireOrders();

    KillSuccessUserInfo selectByKillIdUserId(@Param("killId") Integer killId, @Param("userId") Integer userId);

}