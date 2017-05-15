package ssm.blog.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.blog.dao.BlogTypeDao;
import ssm.blog.entity.BlogType;
import ssm.blog.service.BlogTypeServiceI;

import java.util.List;

/**
 * Created by liwei on 2017/5/12.
 */
@Service
public class BlogTypeServiceImp implements BlogTypeServiceI {

    @Autowired
    BlogTypeDao blogDao;

    public int addBlogType(BlogType blogType) {
        return blogDao.addBlogType(blogType);
    }

    public List<BlogType> getAllBlogType() {
        return blogDao.getAllBlogType();
    }

    public List<BlogType> getBlogTypeByPage(int offset, int rows) {
        return blogDao.getBlogTypeByPage(offset,rows);
    }

    public int getBlogTypeAllCount() {
        return blogDao.getBlogTypeAllCount();
    }

    public int editBlogTypeById(BlogType blogType) {
        return blogDao.editBlogTypeById(blogType);
    }
}
