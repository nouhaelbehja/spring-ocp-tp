
package com.example.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoDev")
@Profile("dev")
public class DaoImplDev implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO DEV] Base de données développement");
        return 150.0;
    }
}
