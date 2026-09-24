package com.example.request;

import java.time.LocalDate;

import lombok.Data;
//when we select dropdown data the data will stored in dto class
@Data
public class SearchRequest {
private String planName;
private String planStatus;
private String gender;
private LocalDate startDate;
private LocalDate endDate;
}
