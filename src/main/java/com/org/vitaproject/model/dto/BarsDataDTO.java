package com.org.vitaproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class BarsDataDTO {
    private Map<String, Map<String, Object>> barsData;
}