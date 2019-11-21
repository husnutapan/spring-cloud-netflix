package com.java.userservice;

import com.data.provider.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name = "nodejs-service")
public interface NodejsClient {
    @GetMapping("/ping")
    String ping();
}
