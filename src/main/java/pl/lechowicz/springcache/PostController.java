package pl.lechowicz.springcache;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    PostService service;

    public PostController(PostService postService){
        this.service = postService;
    }
    @GetMapping("/posts/{id}")
    public @ResponseBody Post findById(@PathVariable("id") Integer postId) {
        return service.findById(postId);
    }

    @PostMapping("/posts/{id}")
    public void updatePost(@PathVariable("id") Integer postId, @RequestBody Post post) {
        service.updatePost(postId, post);
    }

    @DeleteMapping("/posts/{id}")
    public void deleteById(@PathVariable("id") Integer postId) {
        service.deleteById(postId);
    }
}
