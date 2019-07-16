package com.weichuang.dao;

import com.weichuang.pojo.Customer;
import com.weichuang.vo.QueryVo;

import java.util.List;

public interface CustomerDao {
    int getCustomerTotal(QueryVo vo);

    List<Customer> getCustomerList(QueryVo vo);
}
