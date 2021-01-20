package com.melike.backend.socialpress.response;

public class TwitterResponse {
    private String url;
    private String title;
    private String html;
    private String version;

    public TwitterResponse() {}

    public TwitterResponse(String url, String title, String html, String version) {
        this.url = url;
        this.title = title;
        this.html = html;
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
