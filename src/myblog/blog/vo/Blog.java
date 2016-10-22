package myblog.blog.vo;

public class Blog {
	/*
	 * 博客文章的实体类
	 * 
	 */
	private Integer blogid;
	private Integer typeid;
	private String title;
	private String content;
	private String date;
	private String emphasis;
	public Integer getBlogid() {
		return blogid;
	}
	public void setBlogid(Integer blogid) {
		this.blogid = blogid;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmphasis() {
		return emphasis;
	}
	public void setEmphasis(String emphasis) {
		this.emphasis = emphasis;
	}
}
