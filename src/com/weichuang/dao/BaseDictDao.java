package com.weichuang.dao;

import com.weichuang.pojo.BaseDict;

import java.util.List;

public interface BaseDictDao {
    List<BaseDict> getBaseDictByTypeCode(String typeCode);
}
