package myblog.user.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import myblog.user.service.UserService;
import myblog.user.vo.User;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	private UserService userService;
		
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	
	
	public String loginpage(){
		return "loginpage";
	}
	
	
	public String CheckUser(){
		User existuser=userService.CheckUser(user);
		ActionContext.getContext().getSession().put("usermessage", existuser);
		if(existuser!=null){
			ServletActionContext.getRequest().getSession()
			.setAttribute("existUser", existuser);
			return "loginsubmit";
		}
		this.addActionError("登录失败:用户名或密码错误或用户未激活!");
		return NONE;
		
	}
	
	public String loginsubmit(){
		return CheckUser();
	}
	
	
}
