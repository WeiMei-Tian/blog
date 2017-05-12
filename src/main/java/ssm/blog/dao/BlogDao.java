package ssm.blog.dao;

import org.apache.ibatis.annotations.Param;
import ssm.blog.entity.BlogType;

import java.util.List;

/**
 * Created by liwei on 2017/5/12.
 */
public interface BlogDao {

    int addBlogType(@Param("blogType") BlogType blogType);

    List<BlogType> getAllBlogType();
}
