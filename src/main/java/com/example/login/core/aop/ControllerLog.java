package com.example.login.core.aop;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Controlle日志切面
 */
@Aspect
@Component
public class ControllerLog {
	private static org.slf4j.Logger log = LoggerFactory
			.getLogger("RestControllerLog");

	@Around("@annotation(org.springframework.web.bind.annotation.RestController) || execution(* com.example.login.controller.*.*(..))")
	public Object aroudAdvice(ProceedingJoinPoint pjp) throws Throwable {
		if (log.isDebugEnabled()) {
			long start = 0;
			ObjectMapper om = new ObjectMapper();
			String uuid=UUID.randomUUID().toString();
			Object[] args=pjp.getArgs();
			String uri="";
			if(args.length>0&&args[0] instanceof HttpServletRequest){
				HttpServletRequest req = (HttpServletRequest)args[0];
				uri=req.getRequestURI();
				Object vo =req.getAttribute("baseTpRqVo");
				if(vo==null){
					args[0]=om.writeValueAsString(req.getParameterMap());
				}else{
					args[0]=om.writeValueAsString(vo);					
				}
			}
			String name = pjp.getSignature().getDeclaringType().getSimpleName()+"."+pjp.getSignature().getName();
			name=name+"-"+uri;
			log.debug("Req{} {}-参数：{}",uuid, name, pjp.getArgs());
			Object o = null;
			try {
				start = System.currentTimeMillis();
				o = pjp.proceed();
				return o;
			} finally {
				if (o != null) {
					log.debug("Req{} {}-结果({}mm)：{}",uuid, name,
							(System.currentTimeMillis() - start),
							shortMsg(om.writeValueAsString(o)));
				}
			}
		} else {
			return pjp.proceed();
		}
	}
	/**
	 * 单条日志最多打印200字符
	 * @author ShaozeWang
	 * @param msg
	 * @return
	 * @since 2015年7月24日 下午2:49:39
	 */
	private String shortMsg(String msg){
		if(msg==null)return null;
		return StringUtils.left(msg, 200);
	}
}
