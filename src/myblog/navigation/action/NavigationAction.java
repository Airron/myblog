package myblog.navigation.action;

import java.util.Iterator;
import java.util.List;

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
	
	public String execute(){
		String navid=navigation.getNavid().toString();
		return navid;
		}


	}

