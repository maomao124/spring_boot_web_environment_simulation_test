package mao.spring_boot_web_environment_simulation_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project name(项目名称)：spring_boot_web_environment_simulation_test
 * Package(包名): mao.spring_boot_web_environment_simulation_test.controller
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 13:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@Controller
public class MyController
{
    /**
     * Test string.
     *
     * @return the string
     */
    @RequestMapping("test1")
    @ResponseBody
    public String test()
    {
        return "hello";
    }

    /**
     * Test 2 data.
     *
     * @return the data
     */
    @RequestMapping("test2")
    @ResponseBody
    public Data test2()
    {
        return new Data();
    }
}
