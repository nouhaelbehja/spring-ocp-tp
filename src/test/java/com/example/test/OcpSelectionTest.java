
package com.example.test;

import com.example.config.AppConfig;
import com.example.config.DynamicDaoConfig;
import com.example.metier.IMetier;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class OcpSelectionTest {

    @Test
    public void testDaoImplParDefaut() {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(
                             AppConfig.class,
                             DynamicDaoConfig.class)) {

            IMetier metier = context.getBean(IMetier.class);

            // Si dao.target=dao, résultat attendu : 200.0
            assertEquals(200.0, metier.calcul(), 0.001);
        }
    }
}
