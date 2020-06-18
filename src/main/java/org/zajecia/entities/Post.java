package org.zajecia.entities;


import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private String content;

    public Post(String title, String url, String content) {
        this.title = title;
        this.url = url;
        this.content = content;
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getUrl() {

        return url;
    }

    public String getContent() {

        return content;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public void setContent(String content) {

        this.content = content;
    }

}
