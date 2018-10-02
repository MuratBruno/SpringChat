import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chat.beans.HelloBean;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {
  "org.baeldung.controller.controller",
  "org.baeldung.controller.config" }) 
 public class AppConfig implements WebMvcConfigurer  {

	  
    @Override
    public void configureDefaultServletHandling(
      DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
  
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = 
          new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/");
        bean.setSuffix(".jsp");
        return bean;
    }
 }