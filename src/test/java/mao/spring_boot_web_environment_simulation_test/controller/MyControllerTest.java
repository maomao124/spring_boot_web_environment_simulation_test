package mao.spring_boot_web_environment_simulation_test.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HandlerResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * Project name(项目名称)：spring_boot_web_environment_simulation_test
 * Package(包名): mao.spring_boot_web_environment_simulation_test.controller
 * Class(测试类名): MyControllerTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 13:30
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */


//默认值
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
//自定义端口
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class MyControllerTest
{
    /**
     * The Mock mvc.
     */
    @Autowired
    MockMvc mockMvc;

    /**
     * Test 1.
     *
     * @throws Exception the exception
     */
    @Test
    public void test1() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test1");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配状态
        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        //比对
        resultActions.andExpect(ok);
    }

    /**
     * Test 2.
     *
     * @throws Exception the exception
     */
    @Test
    public void test2() throws Exception
    {
        //访问不存在页面
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test2");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配状态
        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        //比对
        resultActions.andExpect(ok);
    }

    /**
     * Test 3.
     *
     * @throws Exception the exception
     */
    @Test
    public void test3() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test1");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配响应体
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher ok = content.string("hello");
        //比对
        resultActions.andExpect(ok);
    }

    /**
     * Test 4.
     *
     * @throws Exception the exception
     */
    @Test
    public void test4() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test1");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配响应体
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //错误
        ResultMatcher ok = content.string("hello1");
        //比对
        resultActions.andExpect(ok);
    }

    /**
     * Test 5.
     *
     * @throws Exception the exception
     */
    @Test
    public void test5() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test2");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配响应体
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher ok = content.json("{\"id\":1,\"name\":\"张三\"}");
        //比对
        resultActions.andExpect(ok);
    }

    /**
     * Test 6.
     *
     * @throws Exception the exception
     */
    @Test
    public void test6() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test2");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配响应体
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher ok = content.json("{\"id\":2,\"name\":\"张三\"}");
        //比对
        resultActions.andExpect(ok);
    }

    /**
     * Test 7.
     *
     * @throws Exception the exception
     */
    @Test
    public void test7() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test2");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配响应头
        HandlerResultMatchers handlerResultMatchers = MockMvcResultMatchers.handler();
        ResultMatcher resultMatcher = handlerResultMatchers.methodName("test2");
        //比对
        resultActions.andExpect(resultMatcher);
    }

    /**
     * Test 8.
     *
     * @throws Exception the exception
     */
    @Test
    public void test8() throws Exception
    {
        //访问
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/test2");
        //执行
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        //匹配响应头
        HandlerResultMatchers handlerResultMatchers = MockMvcResultMatchers.handler();
        ResultMatcher resultMatcher = handlerResultMatchers.methodName("test2");
        //比对
        resultActions.andExpect(resultMatcher);
    }
}