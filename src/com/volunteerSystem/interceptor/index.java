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
		//���session
		Map session = context.getContext().getSession();
		String username = (String) session.get("student.stuId");
		//�ж��û��Ϸ���
		if(username == null || "".equals(username)) {
			//�����û���½ҳ��
			return Action.LOGIN;
		} else {
			//������һ��������û������
			return invocation.invoke();
		}
	}

}
