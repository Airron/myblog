package myblog.blog.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import myblog.blog.service.BlogService;
import myblog.blog.vo.Blog;

public class BlogAction	extends ActionSupport  implements ModelDriven<Blog>{
	private Blog blog;
	@Override
	public Blog getModel() {
		// TODO Auto-generated method stub
		return blog;
	}
	private BlogService blogService;
	
	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}
	public String execute(){
		return "blogcreatepage";
	}
	public String blogSave(){
		return NONE;
	}
	
	
}
