package mao.spring_boot_web_environment_simulation_test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


//默认值
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
//自定义端口
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//随机端口
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringBootWebEnvironmentSimulationTestApplicationTests
{

    @Test
    void contextLoads()
    {

    }

}
