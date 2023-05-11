package junit.demo1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitTest01 {

    @DisplayName("第一个测试")
    @Test
    public void test(){
        System.out.println("第一个test测试");

    }
}
