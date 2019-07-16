package com.weichuang.service;

import com.weichuang.pojo.BaseDict;
import com.weichuang.pojo.Customer;
import com.weichuang.utils.Page;
import com.weichuang.vo.QueryVo;

import java.util.List;

public interface BaseDictService {

    List<BaseDict> getBaseDictByTypeCode(String typeCode);

}
