package za.co.jaliatechnologies.spring_cloud_openfeign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {

    @Override
    public List<PostDto> getPosts() {
        return Collections.emptyList();
    }

    @Override
    public PostDto getPostById(Long postId) {
        return null;
    }
}
