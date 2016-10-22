package myblog.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import myblog.user.vo.User;

public class UserDao extends HibernateDaoSupport {

	public User CheckUser(User user) {
		// TODO Auto-generated method stub
		String hql="from User where user=? and password=?";
		List<User> list =this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());
		if(list!=null||list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
}
