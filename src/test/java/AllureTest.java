import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午10:21
 * @Description:
 */

@Feature("计算器方法测试")
public class AllureTest {

    Logger logger = LoggerFactory.getLogger(AllureTest.class);

    @Test
    @Order(2)
    @DisplayName("加法测试")
    @Story("加法测试")
    void addTest1(){
        Allure.addAttachment("My attachment", "My attachment content");
        logger.info("进行加法测试");
        System.out.println("第2个执行");
        int res = Calculator.add(3, 5);
        assertThat(res,equalTo(8));
    }


    @Test
    @Order(3)
    @DisplayName("减法测试")
    void subTest1(){
        logger.info("进行减法测试");
        System.out.println("第3个执行");
        int res = Calculator.sub(3, 1);
        assertThat(res,equalTo(2));
    }


    @Test
    @Order(5)
    @DisplayName("乘法测试")
    void mulTest1(){
        logger.info("进行乘法测试");
        System.out.println("第5个执行");
        int res = Calculator.mul(5, 4);
        assertThat(res,equalTo(20));
    }



    @Test
    @Order(4)
    @DisplayName("除法测试")
    void divTest1(){
        logger.info("进行除法测试");
        System.out.println("第4个执行");
        int res = Calculator.div(15, 0);
        assertThat(res,equalTo(0));
    }


    @Test
    @Order(1)
    @DisplayName("累加测试")
    void countTest() throws InterruptedException {
        logger.info("进行累加测试");
        System.out.println("第1个执行");
        int res1 = Calculator.count(3);
        int res2 = Calculator.count(3);
        int res3 = Calculator.count(3);
        assertAll(
                () -> assertThat(res1,equalTo(3)),
                () -> assertThat(res2,equalTo(3)),
                () -> assertThat(res3,equalTo(9))
        );
    }
}
