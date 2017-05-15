package ssm.blog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.blog.dao.BlogDao;
import ssm.blog.entity.Blog;
import ssm.blog.service.BlogService;

/**
 * Created by liwei on 2017/5/15.
 */
@Service
public class BlogServiceImp implements BlogService {

    @Autowired
    BlogDao blogDao;

    public int addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }
}
