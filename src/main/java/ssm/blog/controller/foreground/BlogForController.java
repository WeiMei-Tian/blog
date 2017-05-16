package ssm.blog.controller.foreground;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ssm.blog.entity.Blog;
import ssm.blog.service.BlogService;
import ssm.blog.service.imp.BlogServiceImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liwei on 2017/5/16.
 */
@Controller
public class BlogForController {

    private Logger logger = Logger.getLogger(BlogForController.class);
    @Autowired
    BlogServiceImp blogServiceImp;

    @RequestMapping("/index")
    public ModelAndView admin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        List<Blog> blogs = blogServiceImp.getBlogsByPage(0,10);
        List<String> imgs = new ArrayList<String>();
        imgs.add("img1");
        imgs.add("img2");
        imgs.add("img3");
        for (Blog blog : blogs){
            blog.setImageList(imgs);
        }
        modelAndView.addObject("blogList",blogs);
        return modelAndView;
    }
}
