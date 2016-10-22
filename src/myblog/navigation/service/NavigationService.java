package myblog.navigation.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import myblog.navigation.dao.NavigationDao;
import myblog.navigation.vo.Navigation;

@Transactional
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
	public List<Navigation> getNavid() {
		// TODO Auto-generated method stub
		return navigationDao.getNavid();
	}



}
