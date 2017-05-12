package ssm.blog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.blog.dao.BlogDao;
import ssm.blog.entity.BlogType;
import ssm.blog.service.BlogServiceI;

import java.util.List;

/**
 * Created by liwei on 2017/5/12.
 */
@Service
public class BlogServiceImp implements BlogServiceI {

    @Autowired
    BlogDao blogDao;

    public int addBlogType(BlogType blogType) {
        return blogDao.addBlogType(blogType);
    }

    public List<BlogType> getAllBlogType() {
        return blogDao.getAllBlogType();
    }
}
