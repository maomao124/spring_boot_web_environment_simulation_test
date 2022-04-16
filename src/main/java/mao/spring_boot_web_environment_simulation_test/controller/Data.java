package mao.spring_boot_web_environment_simulation_test.controller;

/**
 * Project name(项目名称)：spring_boot_web_environment_simulation_test
 * Package(包名): mao.spring_boot_web_environment_simulation_test.controller
 * Class(类名): Data
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 13:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Data
{
    private int id=1;
    private String name="张三";

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        return stringbuilder.toString();
    }
}
