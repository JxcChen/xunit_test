/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午7:43
 * @Description: 计算器
 */
public class Calculator {
    static int result = 0 ;

    public static int add(int x,int y){
        result = x + y;
        return result;
    }

    public static int sub(int x,int y){
        result = x - y;
        return result;
    }

    public static int mul(int x,int y){
        result = x * y;
        return result;
    }

    public static int div(int x,int y){
        if (y == 0) {
            System.out.println("除数不能为0");
            return 0;
        }
        result = x / y;
        return result;
    }

    public static int count(int x) throws InterruptedException {
        Thread.sleep(1000);
        result += x;
        return result;
    }

    public static synchronized int synCount(int x) throws InterruptedException {
        Thread.sleep(1000);
        result += x;
        return result;
    }
}
