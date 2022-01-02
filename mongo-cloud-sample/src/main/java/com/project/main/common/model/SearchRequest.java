package com.project.main.common.model;

import com.project.main.service.dto.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest<T extends BaseDto> extends PaginationRequest {
    private T searchDto;
}
