package pl.lechowicz.springcache;

public class Post {
    private Integer postId;
    private String title;

    public Post(Integer postId, String title) {
        this.postId = postId;
        this.title = title;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                '}';
    }
}
