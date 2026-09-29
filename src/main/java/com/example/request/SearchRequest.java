package com.example.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
//when we select dropdown data the data will stored in dto class
@Data
public class SearchRequest {
private String planName;
private String planStatus;
private String gender;
@DateTimeFormat(pattern="dd-MM-yyyy")
private LocalDate startDate;
private LocalDate endDate;
}
