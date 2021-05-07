package za.co.jaliatechnologies.spring_cloud_openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/",
fallback = JSONPlaceHolderFallback.class)
public interface JSONPlaceHolderClient{


    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<PostDto> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces =
    "application/json")
    PostDto getPostById(@PathVariable("postId") Long postId);
}
