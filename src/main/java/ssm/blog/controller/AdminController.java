package ssm.blog.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ssm.blog.entity.BlogType;
import ssm.blog.service.imp.BlogServiceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liwei on 2017/5/11.
 */
@Controller
public class AdminController {

    @Autowired
    BlogServiceImp blogServiceImp;

    @RequestMapping("/admin/menu")
    public ModelAndView adminIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        return modelAndView;
    }

    @RequestMapping("/admin")
    public ModelAndView adminIndex2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/main");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/main");
        return modelAndView;
    }

    @RequestMapping(value = "admin/blogtype", method = RequestMethod.GET)
    public ModelAndView blogtype(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/blogtype");
        return modelAndView;
    }

    @RequestMapping(value = "admin/blogtype2", method = RequestMethod.GET)
    public ModelAndView blogtype2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/blogTypeManage");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/blogType/listBlogType", method = RequestMethod.POST)
    @ResponseBody
    public String blogtype3(@RequestParam(value = "page", required = true) String page,
                            @RequestParam(value = "rows", required = true) String rows){
        List<BlogType> blogTypes = blogServiceImp.getAllBlogType();
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("total",blogTypes.size());
        jsonObject.put("rows",blogTypes);
        return jsonObject.toString();
    }


    @RequestMapping(value = "admin/blogtype/add", method = RequestMethod.POST)
    @ResponseBody
    public String addBlogtype(@ModelAttribute BlogType blogType){
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
}
