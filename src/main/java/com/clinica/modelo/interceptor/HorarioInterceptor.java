package com.clinica.modelo.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component("horario")
public class HorarioInterceptor implements HandlerInterceptor {

	@Value("${config.horario.open}")
	private Integer opening;
	
	@Value("${config.horario.close}")
	private Integer ending;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hora >= opening && hora < ending) {
			StringBuilder mensaje = new StringBuilder("Bienvenidos, el horario de atención al cliente es desde las ");
			mensaje.append(opening);
			mensaje.append("hs. hasta las");
			mensaje.append(ending);
			mensaje.append("hs. Gracias por su visita.");
			request.setAttribute("mensaje", mensaje.toString());
			return true;
		}
		response.sendRedirect(request.getContextPath().concat("/"));
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		String mensaje = (String) request.getAttribute("mensaje");
		
		if(modelAndView != null && handler instanceof HandlerMethod){
			modelAndView.addObject("mensaje", mensaje);
		}
	}

}
