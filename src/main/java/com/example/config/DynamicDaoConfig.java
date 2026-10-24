
package com.example.config;

import com.example.dao.IDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DynamicDaoConfig {

    @Value("${DAO_TARGET:${dao.target:dao}}")
    private String daoTarget;

    @Bean
    @Primary
    public IDao dynamicDao(ApplicationContext context) {

        System.out.println("[CONFIG] DAO sélectionné : " + daoTarget);

        switch (daoTarget) {
            case "dao":
            case "dao2":
            case "daoFile":
            case "daoApi":
                return context.getBean(daoTarget, IDao.class);

            default:
                throw new IllegalArgumentException(
                        "DAO inconnu : " + daoTarget);
        }
    }
}
