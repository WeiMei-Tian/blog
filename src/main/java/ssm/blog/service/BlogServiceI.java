package ssm.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.blog.dao.BlogDao;
import ssm.blog.entity.BlogType;

import java.util.List;

/**
 * Created by liwei on 2017/5/12.
 */
public interface BlogServiceI {

    int addBlogType(BlogType blogType);

    List<BlogType> getAllBlogType();
}
