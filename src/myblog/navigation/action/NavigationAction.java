package myblog.navigation.action;

import java.util.Iterator;
import java.util.List;

import org.apache.catalina.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import myblog.navigation.service.NavigationService;
import myblog.navigation.vo.Navigation;

@SuppressWarnings("serial")
public class NavigationAction extends ActionSupport implements ModelDriven<Navigation>{
	private NavigationService navigationService;
	private Navigation navigation =new Navigation();
	@Override
	public Navigation getModel() {
		// TODO Auto-generated method stub
		return navigation;
	}
	
	//接收从locationhref中传入的当前页面的编号
	
	public String execute(){
		String navid=navigation.getNavid().toString();
		String navname=navigation.getNavname();
		ActionContext.getContext().getSession().put("navid", Integer.valueOf(navid));
		ActionContext.getContext().getSession().put("navname", navname);
		return navid;
		}


	}

