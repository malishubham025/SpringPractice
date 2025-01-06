package com.example.rest_api;

public class Journal {
    int id;
    String title;
    String content;

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    Journal(){}
    Journal(int id,String title,String content){
        this.content=content;
        this.id=id;
        this.title=title;
    }

}
