package com.zemal.dao;


import com.zemal.model.po.GroupInfo;

public interface GroupInfoDao {

    void loadGroupInfo();
    
    GroupInfo getByGroupId(String groupId);
}
