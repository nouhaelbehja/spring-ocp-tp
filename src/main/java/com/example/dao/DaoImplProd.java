
package com.example.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoProd")
@Profile("prod")
public class DaoImplProd implements IDao {

    @Override
    public double getValue() {
        System.out.println("[DAO PROD] Base de données production");
        return 100.0;
    }
}
