package org.hy.fbi.security.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hy.foundation.common.exception.RestRuntimeException;

import com.google.gson.Gson;

/**
 * Servlet implementation class ExceptionHandleServlet
 */
public class ExceptionHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExceptionHandleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RuntimeException ex=(RuntimeException)request.getSession().getAttribute("SPRING_SECURITY_LAST_EXCEPTION");

		RestRuntimeException e=new RestRuntimeException();
//		ex=new RuntimeException(ex.getCause());
		if(ex instanceof org.springframework.security.authentication.AuthenticationServiceException){ //用户名错误			
			e.setErrorCode(4101);
			e.setReason("用户名错误!");
			if(ex.getCause() instanceof java.lang.NullPointerException){
				e.setErrorCode(4103);
				e.setReason("您没有权限登陆系统!");
			}
		}else if(ex instanceof org.springframework.security.authentication.BadCredentialsException){ //密码错误
			e.setErrorCode(4101);
			e.setReason("密码错误!");			
		}else if(ex instanceof org.springframework.security.authentication.DisabledException){ //帐户锁定
			e.setErrorCode(4102);
			e.setReason("此帐户已被锁定,请联系管理员!");				
		}else{
			e.setErrorCode(4100);
			e.setReason("登陆验证错误!");				
		}
		
//		ex.printStackTrace();
		e.setStackTrace(ex.getStackTrace());
		
		Gson gson=new Gson();
		String resutl=gson.toJson(e);
		PrintWriter out = response.getWriter();
		out.write(resutl);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
