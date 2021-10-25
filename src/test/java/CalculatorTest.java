import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午7:56
 * @Description:
 */
public class CalculatorTest {

    @Test
    void addTest1(){
        int res = Calculator.add(3, 5);
        assertThat(res,equalTo(8));
    }

    @Test
    void addTest2(){
        int res = Calculator.add(3, 5);
        assertThat(res,equalTo(1));
    }

    @Test
    void subTest1(){
        int res = Calculator.sub(3, 1);
        assertThat(res,equalTo(2));
    }

    @Test
    void subTest2(){
        int res = Calculator.sub(3, 1);
        assertThat(res,equalTo(0));
    }

    @Test
    void mulTest1(){
        int res = Calculator.mul(5, 4);
        assertThat(res,equalTo(20));
    }

    @Test
    void mulTest2(){
        int res = Calculator.mul(5, 4);
        assertThat(res,equalTo(10));
    }

    @Test
    void divTest1(){
        int res = Calculator.div(15, 0);
        assertThat(res,equalTo(0));
    }

    @Test
    void divTest2(){
        int res = Calculator.div(15, 3);
        assertThat(res,equalTo(5));
    }

    @Test
    void countTest() throws InterruptedException {
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
