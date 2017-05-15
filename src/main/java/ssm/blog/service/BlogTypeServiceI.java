package ssm.blog.service;

import ssm.blog.entity.BlogType;

import java.util.List;

/**
 * Created by liwei on 2017/5/12.
 */
public interface BlogTypeServiceI {

    int addBlogType(BlogType blogType);

    List<BlogType> getAllBlogType();

    List<BlogType> getBlogTypeByPage(int offset, int rows);

    int getBlogTypeAllCount();

    int editBlogTypeById(BlogType blogType);
}
