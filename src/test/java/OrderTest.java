import io.qameta.allure.Epic;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午9:48
 * @Description: 顺序执行测试
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OrderTest {

    @Test
    @Order(2)
    void addTest1(){
        System.out.println("第2个执行");
        int res = Calculator.add(3, 5);
        assertThat(res,equalTo(8));
    }


    @Test
    @Order(3)
    void subTest1(){
        System.out.println("第3个执行");
        int res = Calculator.sub(3, 1);
        assertThat(res,equalTo(2));
    }


    @Test
    @Order(5)
    void mulTest1(){
        System.out.println("第5个执行");
        int res = Calculator.mul(5, 4);
        assertThat(res,equalTo(20));
    }



    @Test
    @Order(4)
    void divTest1(){
        System.out.println("第4个执行");
        int res = Calculator.div(15, 0);
        assertThat(res,equalTo(0));
    }


    @Test
    @Order(1)
    void countTest() throws InterruptedException {
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
