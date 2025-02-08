package org.example.Bean;

import org.springframework.context.annotation.Lazy;

public class UserConfig {

    String name;
    String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
          this.className = className;
    }
}

