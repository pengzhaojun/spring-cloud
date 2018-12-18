package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eooco
 * @Description: TODO
 * @date 2018/10/9 17:23
 */
@RestController
public class HelloController {

    @Value("${name}")
    String name;
    @Value("${age}")
    String age;
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public ModelAndView hello(){
        User user = new User();
        user.setAge(age);
        user.setHello(hello);
        user.setName(name);
        String winNumber ="01,02,05,07,10,16,27,36,38,43,44,45,54,55,59,61,62,64,78,80";
        //String src =  String.format("http://1007747.com/statics/style/style901/images/bead/lhc/01.png",strs[i]);
        return new ModelAndView("index");  // 逻辑名
    }


    @RequestMapping("/dabaojian")
    public String dabaojian(@RequestParam(value = "b") String a){
        String.format("http://1007747.com/statics/style/style901/images/bead/lhc/%s.png",38);
        return String.format("%s  ,my name is %s ,  %s 岁 ,%s" , hello, name ,age ,a );
    }

}
