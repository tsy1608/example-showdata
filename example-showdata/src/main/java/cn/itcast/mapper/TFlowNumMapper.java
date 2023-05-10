package cn.itcast.mapper;

import cn.itcast.pojo.TFlowNum;
import cn.itcast.pojo.TFlowNumExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TFlowNumMapper {
    int countByExample(TFlowNumExample example);

    int deleteByExample(TFlowNumExample example);

    int insert(TFlowNum record);

    int insertSelective(TFlowNum record);

    List<TFlowNum> selectByExample(TFlowNumExample example);
    List<TFlowNum> selectAll();

    int updateByExampleSelective(@Param("record") TFlowNum record, @Param("example") TFlowNumExample example);

    int updateByExample(@Param("record") TFlowNum record, @Param("example") TFlowNumExample example);
}