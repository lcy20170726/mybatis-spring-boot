package tk.mybatis.springboot.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import tk.mybatis.springboot.interceptor.MyInterceptor;

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter  {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*/**");
		super.addInterceptors(registry);
	}
}
