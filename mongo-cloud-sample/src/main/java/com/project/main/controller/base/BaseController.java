package com.project.main.controller.base;

import com.project.main.common.model.PaginationRequest;
import com.project.main.common.model.SearchRequest;
import com.project.main.common.model.SearchResponse;
import com.project.main.service.dto.base.BaseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseController<D extends BaseDto> {

    @GetMapping(value = "{id}")
    D get(@PathVariable("id") Integer id);

    @PostMapping(value = "create")
    D create(@RequestBody D personDto);

    @PostMapping("update")
    D update(@RequestBody D personDto);

    @PostMapping(value = "search")
    SearchResponse<D> search(@RequestBody SearchRequest<D> request);

    @PostMapping(value = "all")
    SearchResponse<D> all(@RequestBody PaginationRequest request);

    @GetMapping(value = "delete/{id}")
    void delete(@PathVariable("id") Integer id);
}
