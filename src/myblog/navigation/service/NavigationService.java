package myblog.navigation.service;

import java.util.List;

import myblog.navigation.dao.NavigationDao;
import myblog.navigation.vo.Navigation;

public class NavigationService {
	/*注入navigationDao*/
	private NavigationDao navigationDao;
	public void setNavigationDao(NavigationDao navigationDao) {
		this.navigationDao = navigationDao;
	}
	public List<Navigation> findAll() {
		//定义查找所有导航栏的navigationDao方法
		return navigationDao.findAll();
	}



}
