package pl.lechowicz.springcache;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Cacheable("posts")
    public Post findById(Integer postId) {
        System.out.println("#### Fetching Post ######");
        return new Post(postId, "Demo post");
    }

    @CachePut(cacheNames = "posts", key = "#postId")
    public Post updatePost(Integer postId, Post post) {
        System.out.printf(post.toString());
        return post;
    }

    @CacheEvict("posts")
    public void deleteById(Integer postId) {
        // delete post
    }
}
