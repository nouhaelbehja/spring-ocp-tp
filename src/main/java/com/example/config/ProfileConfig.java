
package com.example.config;

import com.example.dao.DaoImplDev;
import com.example.dao.DaoImplProd;
import com.example.metier.MetierImpl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        DaoImplProd.class,
        DaoImplDev.class,
        MetierImpl.class
})
public class ProfileConfig {
}
