package com.ls.gradesproj;

public class Note {
    private String title;
    private String content;
    private String topic;


    public Note(String title, String content, String topic) {
        this.title = title;
        this.content = content;
        this.topic = topic;
    }

    public Note() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
