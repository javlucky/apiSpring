package com.example.demo.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VolumeInfo {
    private List<String> authors;
    private List<String> categories;
    private String description;
    private List<IndustryIdentifier> industryIdentifiers;
    private int pageCount;
    private String publishedDate;
    private String publisher;
    private String title;
}
