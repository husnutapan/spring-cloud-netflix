package com.java.userservice;

import com.data.provider.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "provider-service")
public interface ProviderClient {
    @GetMapping("/providers")
    List<Provider> providers();
}
