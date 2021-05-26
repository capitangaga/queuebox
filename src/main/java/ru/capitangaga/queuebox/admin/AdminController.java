package ru.capitangaga.queuebox.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.capitangaga.queuebox.admin.dto.AppNameDto;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private String appName;

    @GetMapping("/name")
    public AppNameDto name() {
        return new AppNameDto(appName);
    }
}
