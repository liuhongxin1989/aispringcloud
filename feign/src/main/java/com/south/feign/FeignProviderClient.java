package com.south.feign;

import com.south.entity.Student;
import com.south.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author liuhongxin
 * @Type FeignProviderClient
 * @Desc
 * @date 2020年01月13日
 * @Version V1.0
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}