import br.com.allandonega.HelloWorld;
import br.com.utils.SystemInfo;
import br.com.utils.Utils;

public class TestPrograms {
    public static void main(String[] args) {
        System.out.println("<<<< INI >>>>");
        new SystemInfo().execSystemInfo();
        new HelloWorld().escreveMensagem("Hello World");
        System.out.println();
        System.out.println("<<<< FIM >>>>");
    }

}
