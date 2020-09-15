package com.clinica.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

	@Autowired
	@Qualifier("horario")
	private HandlerInterceptor horario;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// La intercepción sin excludepath se hace a todas las direcciones, por lo tanto se crea un bucle infinito si no excluimos el path a redirigir
		registry.addInterceptor(horario).excludePathPatterns("/");
	}

}
