package com.dworld.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dworld.demo.entity.Testd;
import org.springframework.stereotype.Repository;

@Repository
@DS("db02")//数据源的名字，如果没填就是默认的
public interface TestdMapper extends BaseMapper<Testd> {
}
