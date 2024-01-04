package com.fermandez.pdf;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QueryRequest {
    private String searchTerm;
    private int minAge;
    private int maxAge;

}

