
package com.example;

import com.example.config.AppConfig;
import com.example.config.DynamicDaoConfig;
import com.example.metier.MetierImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(
                             AppConfig.class,
                             DynamicDaoConfig.class)) {

            MetierImpl metier = context.getBean(MetierImpl.class);

            System.out.println("Résultat final : " + metier.calcul());
        }
    }
}
