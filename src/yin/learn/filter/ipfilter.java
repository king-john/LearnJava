package yin.learn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ipfilter implements Filter//实现Filter接口  
{
	protected FilterConfig config;  

	protected String rejectedlP;  
	public void init(FilterConfig filterConfig)throws ServletException  
    {
		this.config=filterConfig;//从Web务器获取过滤器配置对象  
   
		rejectedlP=config.getInitParameter("RejectedlP");
		System.out.println("rejectedlP:"+rejectedlP);
		//从配置中取得过滤lP  
    }  
	public void doFilter(ServletRequest request,
			ServletResponse response,FilterChain chain)throws IOException,ServletException  
	{
		System.out.println("过滤器检查客户端发出Web资源的请求");
		/*RequestDispatcher dispatcher=request.getRequestDispatcher("");  
			
		String remotelP=request.getRemoteAddr();//获取客户请求IP  
		System.out.println("remotelP:"+remotelP);
		int i=remotelP.lastIndexOf("."); 
		int r=rejectedlP.lastIndexOf(".");
		System.out.println(i);
		System.out.println(r);
		String relPscope=rejectedlP.substring(0,r);//过滤lP段  
		if(relPscope.equals(remotelP.substring(0,i)))  
		{      
			System.out.println("IPreject");
			dispatcher.forward(request,response);//重定向到rejectedError．jsp页面  
 
            return;//阻塞，直接返Web回客户端  
		}  else{
			chain.doFilter(request,response);//调用过滤链上的下一个过滤器  
		}*/
	}  
  
	public void destroy(){}  
}


