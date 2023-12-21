package abdelmalek.enset.aopapp1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"abdelmalek.enset.aopapp1.metier", "abdelmalek.enset.aopapp1.aspects"})
public class AppConfig {
}
