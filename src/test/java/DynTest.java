import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import entity.Result;
import entity.ResultList;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * @author JJJJ
 * @Title: dynamic test
 * @date 2021/10/25下午9:13
 * @Description: 动态生成用例
 */
public class DynTest {


    @TestFactory
    Collection<org.junit.jupiter.api.DynamicTest>  test01() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        ResultList resList = objectMapper.readValue(new File("src/main/resources/shell_test_result.yaml"), ResultList.class);
        List<DynamicTest> list = new ArrayList<>();
        resList.getResultList().forEach(res -> {
            DynamicTest dynamicTest = dynamicTest(res.getCaseName(),() -> {
                assertTrue(res.getResult());
            });
            list.add(dynamicTest);
        });

        return list;
    }


}
