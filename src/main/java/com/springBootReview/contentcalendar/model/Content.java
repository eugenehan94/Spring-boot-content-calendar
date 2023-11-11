package com.springBootReview.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

//@Table(value= "tbl_content")
public record Content(
        @Id
        Integer id,
        @NotBlank
//        @Column("str_title")
        String title,
        String desc,
        Status status, Type contentType, LocalDateTime dateCreated,
        LocalDateTime dateUpdated, String url) {

}
