package ssm.blog.controller.admin;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ssm.blog.entity.Blog;
import ssm.blog.entity.BlogType;
import ssm.blog.service.BlogService;
import ssm.blog.service.imp.BlogServiceImp;
import ssm.blog.service.imp.BlogTypeServiceImp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by liwei on 2017/5/15.
 */
@Controller
public class BlogController {

    private Logger logger = Logger.getLogger(BlogController.this.getClass());
    @Autowired
    BlogServiceImp blogServiceImp;
    @Autowired
    BlogTypeServiceImp blogTypeServiceImp;

    @RequestMapping(value = "admin/writeblog",method = RequestMethod.GET)
    public ModelAndView writeBlog(){
        ModelAndView modelAndView = new ModelAndView("admin/writeBlog");
        List<BlogType> blogTypes = blogTypeServiceImp.getAllBlogType();
        modelAndView.addObject("blogTypeList",blogTypes);
        return modelAndView;
    }

    @RequestMapping(value = "/admin/blog/addnew", method = RequestMethod.POST)
    @ResponseBody
    public String addBlog(@ModelAttribute Blog blog){
        logger.error("-------- aaaaaaaaaaaaaaaaaaaa --------" + blog.getTitle());
        Date current = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String releaseDate = dateFormat.format(current.getTime());
        blog.setReleaseDate(current);
        int result = blogServiceImp.addBlog(blog);
        JSONObject jsonObject = new JSONObject();
        if(result > 0){
            jsonObject.put("code",200);
        }else {
            jsonObject.put("code",100);
        }
        return jsonObject.toString();
    }
}
