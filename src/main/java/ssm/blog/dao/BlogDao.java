package ssm.blog.dao;

import org.apache.ibatis.annotations.Param;
import ssm.blog.entity.Blog;

/**
 * Created by liwei on 2017/5/15.
 */
public interface BlogDao {

    int addBlog(@Param("blog") Blog blog);
}
