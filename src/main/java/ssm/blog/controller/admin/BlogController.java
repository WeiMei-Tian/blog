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
        Date current = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String releaseDate = dateFormat.format(current.getTime());
        blog.setReleaseDate(current);
        JSONObject jsonObject = new JSONObject();
        try {
            int result = blogServiceImp.addBlog(blog);
            if(result > 0){
                jsonObject.put("code",200);
            }else {
                jsonObject.put("code",100);
            }
        }catch (Exception e){
            jsonObject.put("code",100);
        }
        return jsonObject.toString();
    }

    @RequestMapping(value = "/admin/blog/listBlog", method = RequestMethod.POST)
    @ResponseBody
    public String blogs(@RequestParam(value = "page", required = true) String page,
                            @RequestParam(value = "rows", required = true) String rows){
        List<Blog> blogs = blogServiceImp.getBlogsByPage((Integer.parseInt(page) - 1)*Integer.parseInt(rows),Integer.parseInt(rows));
        logger.info("==============================" + blogs.get(0).getBlogType().getTypeName());
        JSONObject jsonObject = new JSONObject();
        int total = blogServiceImp.getBlogAllCount();
        jsonObject.put("total",total);
        jsonObject.put("rows",blogs);
        return jsonObject.toString();
    }
}
