package com.weichuang.controller;

import com.weichuang.pojo.BaseDict;
import com.weichuang.pojo.Customer;
import com.weichuang.service.BaseDictService;
import com.weichuang.service.CustomerService;
import com.weichuang.service.CustomerServiceImpl;
import com.weichuang.utils.Page;
import com.weichuang.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customerList.do")
    public String getCustomerList(QueryVo vo , Model model){
        List<BaseDict> industryType = baseDictService.getBaseDictByTypeCode("001");
        List<BaseDict> fromType = baseDictService.getBaseDictByTypeCode("002");
        List<BaseDict> levelType = baseDictService.getBaseDictByTypeCode("006");
        model.addAttribute("industryType" , industryType);
        model.addAttribute("fromType" , fromType);
        model.addAttribute("levelType" , levelType);


        Page<Customer> page = customerService.getPageByQueryVo(vo);
        model.addAttribute("page",page);
        model.addAttribute("custName",vo.getCustName());
        model.addAttribute("custSource",vo.getCustSource());
        model.addAttribute("custIndustry",vo.getCustIndustry());
        model.addAttribute("custLevel",vo.getCustLevel());
        return "customer";
    }
}
