package dblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Darrick
 * @package dblog.web
 * @class TestController
 * @date 2017/12/27 17:20
 * @description
 * @versions 1.0
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testIndex(){
        return "test";
    }
}
