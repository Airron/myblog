package myblog.navigation.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import myblog.navigation.vo.Navigation;

public class NavigationDao extends HibernateDaoSupport{


	public  List<Navigation> findAll() {
		String hql="from Navigation";
		List<Navigation> list=this.getHibernateTemplate().find(hql);
		if(list==null){
			
			return null;
		}
		else{
		return list;
		}
	}

	public List<Navigation> getNavid() {
		// 获得navigation的ID
		String hql="from Navigation";
		List<Navigation> list=this.getHibernateTemplate().find(hql);
		return list;
	}

}
