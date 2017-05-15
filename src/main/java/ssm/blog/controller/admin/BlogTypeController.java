package ssm.blog.controller.admin;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ssm.blog.entity.BlogType;
import ssm.blog.service.imp.BlogTypeServiceImp;

import java.util.List;

/**
 * Created by liwei on 2017/5/11.
 */
@Controller
public class BlogTypeController {

    private Logger logger = Logger.getLogger(BlogTypeController.this.getClass());

    @Autowired
    BlogTypeServiceImp blogServiceImp;

    @RequestMapping(value = "admin/blogtype", method = RequestMethod.GET)
    public ModelAndView blogtype(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/blogtype");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/blogType/listBlogType", method = RequestMethod.POST)
    @ResponseBody
    public String blogtype3(@RequestParam(value = "page", required = true) String page,
                            @RequestParam(value = "rows", required = true) String rows){
        List<BlogType> blogTypes = blogServiceImp.getBlogTypeByPage((Integer.parseInt(page) - 1)*Integer.parseInt(rows),Integer.parseInt(rows));
        JSONObject jsonObject = new JSONObject();

        int total = blogServiceImp.getBlogTypeAllCount();
        jsonObject.put("total",total);
        jsonObject.put("rows",blogTypes);
        return jsonObject.toString();
    }


    @RequestMapping(value = "admin/blogtype/add", method = RequestMethod.POST)
    @ResponseBody
    public String addBlogtype(@ModelAttribute BlogType blogType){
        logger.error("--------------------" + blogType.getTypeName());

        int result = blogServiceImp.addBlogType(blogType);
        JSONObject jsonObject = new JSONObject();
        if(result > 0){
            jsonObject.put("success",true);
            System.out.println("-------------------------add blog type true-------------------");
            return jsonObject.toString();
        }else {
            jsonObject.put("success",false);
            System.out.println("-------------------------add blog type  false-------------------");
            return jsonObject.toString();
        }

    }

    @RequestMapping(value = "admin/blogType/edit" , method = RequestMethod.POST)
    @ResponseBody
    public String editBlogType(@RequestParam(value = "id",required = true)String id,@ModelAttribute BlogType blogType){
        int result = blogServiceImp.editBlogTypeById(blogType);
        JSONObject jsonObject = new JSONObject();
        if(result > 0){
            jsonObject.put("success",true);
            System.out.println("-------------------------edit blog type true-------------------");
            return jsonObject.toString();
        }else {
            jsonObject.put("success",false);
            System.out.println("-------------------------edit blog type  false-------------------");
            return jsonObject.toString();
        }
    }
}
