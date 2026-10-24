
package com.example.config;

import com.example.dao.DaoApi;
import com.example.dao.IDao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DaoAliasConfig {

    @Bean
    @Primary
    public IDao daoAlias() {
        return new DaoApi();
    }
}
