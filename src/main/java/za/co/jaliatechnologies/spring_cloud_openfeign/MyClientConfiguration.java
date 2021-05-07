package za.co.jaliatechnologies.spring_cloud_openfeign;

import com.squareup.okhttp.OkHttpClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@FeignClient(value = "jplaceholder",
            url = "https://jsonplaceholder.typicode.com/",
            configuration = MyClientConfiguration.class)
@Configuration
public class MyClientConfiguration {

    @Bean
    public OkHttpClient client(){
        return new OkHttpClient();
    }
}
