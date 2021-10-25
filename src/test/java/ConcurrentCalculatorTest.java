import org.junit.jupiter.api.RepeatedTest;

/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午8:54
 * @Description: 多线程并发测试
 */
public class ConcurrentCalculatorTest {

    @RepeatedTest(40)
    void test01() throws InterruptedException {
        int res = Calculator.count(3);
        System.out.println("当前线程号："+Thread.currentThread().getId()+" 当前结果："+ res);
    }

    @RepeatedTest(20)
    void test02() throws InterruptedException {
        int res = Calculator.synCount(3);
        System.out.println("当前线程号："+Thread.currentThread().getId()+" 当前结果："+ res);
    }

}
