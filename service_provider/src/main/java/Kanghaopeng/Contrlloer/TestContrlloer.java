package Kanghaopeng.Contrlloer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContrlloer {
    @Value("${server.port}")
    String Port;
    @GetMapping("/hi")
    public String GetTest(@RequestParam("Name") String Name){
        return Port+"---------"+Name;
    }
}
