package com.java.providerservice;


import com.data.provider.DataCreator;
import com.data.provider.Provider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController {

    @GetMapping
    public List<Provider> providers() {
        return DataCreator.providers();
    }

}
