package ssm.blog.dao;

import org.apache.ibatis.annotations.Param;
import ssm.blog.entity.BlogType;

import java.util.List;

/**
 * Created by liwei on 2017/5/12.
 */
public interface BlogTypeDao {

    int addBlogType(@Param("blogType") BlogType blogType);

    List<BlogType> getAllBlogType();

    List<BlogType> getBlogTypeByPage(@Param("offset") int offset,@Param("rows")int rows);

    int getBlogTypeAllCount();

    int editBlogTypeById(@Param("blogType")BlogType blogType);

    BlogType getById(@Param("id") int id);
}
