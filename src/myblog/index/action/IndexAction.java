package myblog.index.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import myblog.navigation.service.NavigationService;
import myblog.navigation.vo.Navigation;



public class IndexAction extends ActionSupport {
	private NavigationService navigationService;

	public void setNavigationService(NavigationService navigationService) {
		this.navigationService = navigationService;
	}

	public String execute(){
		//执行查询输出导航栏的方法
		List<Navigation> nList=navigationService.findAll();
	
		//将集合存入session中
		ActionContext.getContext().getSession().put("nList", nList);
		return "index";
	}
	
}
