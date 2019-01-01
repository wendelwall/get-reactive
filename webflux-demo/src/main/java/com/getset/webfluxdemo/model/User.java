package com.getset.webfluxdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {
    @Id
    private String id;
    @NotBlank(message = "用户名不能为空")
    @Indexed(unique = true)
    private String username;
    private String name;
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
