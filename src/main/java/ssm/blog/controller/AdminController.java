package ssm.blog.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ssm.blog.entity.BlogType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liwei on 2017/5/11.
 */
@Controller
public class AdminController {

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
        JSONObject jsonObject = new JSONObject();
        List<BlogType> list = new ArrayList<BlogType>();
        BlogType blogType = new BlogType("java",1);
        BlogType blogType2 = new BlogType("python",2);
        BlogType blogType3 = new BlogType("javascript",3);
        BlogType blogType4 = new BlogType("c++",4);
        BlogType blogType5 = new BlogType("c++",4);
        list.add(blogType);
        list.add(blogType2);
        list.add(blogType3);
        list.add(blogType4);
        list.add(blogType5);

        List<BlogType> list2 = new ArrayList<BlogType>();
        BlogType blogType6 = new BlogType("java aa",1);
        BlogType blogType7 = new BlogType("python aa",2);
        BlogType blogType8 = new BlogType("javascript aa",3);
        BlogType blogType9 = new BlogType("c++ aa",4);
        BlogType blogType10 = new BlogType("c++ aa",4);
        list2.add(blogType6);
        list2.add(blogType7);
        list2.add(blogType8);
        list2.add(blogType9);
        list2.add(blogType10);

        jsonObject.put("total",100);
        if("1".equals(page)){
            jsonObject.put("rows",list);
        }else {
            jsonObject.put("rows",list2);
        }
        return jsonObject.toString();
    }
}
