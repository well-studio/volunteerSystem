package com.volunteerSystem.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class index extends AbstractInterceptor {
	private static final long serialVersionUID = -4433782231692303342L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context =invocation.getInvocationContext();
		//获得session
		Map session = context.getContext().getSession();
		String username = (String) session.get("student.stuId");
		//判断用户合法性
		if(username == null || "".equals(username)) {
			//返回用户登陆页面
			return Action.LOGIN;
		} else {
			//进行下一步操作，没有拦截
			return invocation.invoke();
		}
	}

}
