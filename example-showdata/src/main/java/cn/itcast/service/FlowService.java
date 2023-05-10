package cn.itcast.service;

import cn.itcast.pojo.TFlowNum;

import java.util.List;

public interface FlowService {
    
    String  getFlowByDates(String startDate, String endDate);
    List<TFlowNum> selectAll();
}
