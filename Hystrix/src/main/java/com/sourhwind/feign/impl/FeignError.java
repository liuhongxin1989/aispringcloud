package com.sourhwind.feign.impl;

import com.sourhwind.entity.Student;
import com.sourhwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author liuhongxin
 * @Type FeignError
 * @Desc
 * @date 2020年01月13日
 * @Version V1.0
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
