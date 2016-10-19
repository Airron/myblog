package myblog.user.service;

import myblog.user.dao.UserDao;
import myblog.user.vo.User;

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
