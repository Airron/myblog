package myblog.blog.service;

import org.springframework.transaction.annotation.Transactional;

import myblog.blog.dao.BlogDao;
@Transactional
public class BlogService {
	private BlogDao blogDao;

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}
}
