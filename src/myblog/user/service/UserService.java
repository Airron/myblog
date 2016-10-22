package myblog.user.service;

import org.springframework.transaction.annotation.Transactional;

import myblog.user.dao.UserDao;
import myblog.user.vo.User;

@Transactional
public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User CheckUser(User user) {
		// TODO Auto-generated method stub
	 return userDao.CheckUser(user);
	}
}
