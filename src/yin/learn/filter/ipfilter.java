package yin.learn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ipfilter implements Filter//ʵ��Filter�ӿ�  
{
	protected FilterConfig config;  

	protected String rejectedlP;  
	public void init(FilterConfig filterConfig)throws ServletException  
    {
		this.config=filterConfig;//��Web������ȡ���������ö���  
   
		rejectedlP=config.getInitParameter("RejectedlP");
		System.out.println("rejectedlP:"+rejectedlP);
		//��������ȡ�ù���lP  
    }  
	public void doFilter(ServletRequest request,
			ServletResponse response,FilterChain chain)throws IOException,ServletException  
	{
		System.out.println("���������ͻ��˷���Web��Դ������");
		/*RequestDispatcher dispatcher=request.getRequestDispatcher("");  
			
		String remotelP=request.getRemoteAddr();//��ȡ�ͻ�����IP  
		System.out.println("remotelP:"+remotelP);
		int i=remotelP.lastIndexOf("."); 
		int r=rejectedlP.lastIndexOf(".");
		System.out.println(i);
		System.out.println(r);
		String relPscope=rejectedlP.substring(0,r);//����lP��  
		if(relPscope.equals(remotelP.substring(0,i)))  
		{      
			System.out.println("IPreject");
			dispatcher.forward(request,response);//�ض���rejectedError��jspҳ��  
 
            return;//������ֱ�ӷ�Web�ؿͻ���  
		}  else{
			chain.doFilter(request,response);//���ù������ϵ���һ��������  
		}*/
	}  
  
	public void destroy(){}  
}


