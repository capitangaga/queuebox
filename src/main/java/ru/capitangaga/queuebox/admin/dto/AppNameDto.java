package ru.capitangaga.queuebox.admin.dto;

import lombok.Getter;

public class AppNameDto {
    @Getter
    private final String appName;

    public AppNameDto(String appName) {
        this.appName = appName;
    }
}
