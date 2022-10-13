package com.prosalyte.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/DimaTarasiuk/module_3");
        project.run();

    }
}
