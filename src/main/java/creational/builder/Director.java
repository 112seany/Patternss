package main.java.creational.builder;

public class Director {
    WebsiteBuilder builder;
    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildCms();
        builder.buildName();
        builder.buildPrice();
        Website website = builder.getWebsite();

        return website;
    }
}
