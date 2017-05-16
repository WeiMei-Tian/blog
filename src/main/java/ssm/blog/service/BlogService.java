package ssm.blog.service;

import ssm.blog.entity.Blog;

import java.util.List;

/**
 * Created by liwei on 2017/5/15.
 */
public interface BlogService {

    int addBlog(Blog blog);

    List<Blog> getBlogsByPage(int offset, int rows);

    int getBlogAllCount();
}
