package com.project.main.controller;

import com.project.main.common.model.PaginationRequest;
import com.project.main.common.model.SearchRequest;
import com.project.main.common.model.SearchResponse;
import com.project.main.controller.base.BaseController;
import com.project.main.service.dto.PersonDto;
import com.project.main.data.document.Person;
import com.project.main.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("api/person")
@RequiredArgsConstructor
public class PersonController implements BaseController<PersonDto> {

    private final static Logger LOGGER = Logger.getLogger(PersonController.class.getName());

    private final PersonService personService;

    @Override
    @GetMapping(value = "{id}")
    public PersonDto get(@PathVariable("id") Integer id) {
        LOGGER.info("PersonController get method is start.");
        final PersonDto personDto = personService.get(id);
        LOGGER.info("PersonController get method is end.");
        return personDto;
    }

    @Override
    @PostMapping(value = "create")
    public PersonDto create(@RequestBody PersonDto personDto) {
        LOGGER.info("PersonController create method is start.");
        final Person person = personService.save(personDto.toDocument());
        LOGGER.info("PersonController create method is end.");
        return person.toDto();
    }

    @Override
    @PostMapping("update")
    public PersonDto update(@RequestBody PersonDto personDto) {
        LOGGER.info("PersonController update method is start.");
        final Person person = personService.update(personDto.toDocument());
        LOGGER.info("PersonController update method is end");
        return person.toDto();
    }

    @Override
    @PostMapping(value = "search")
    public SearchResponse<PersonDto> search(@RequestBody SearchRequest<PersonDto> request) {
        LOGGER.info("PersonController search method is start.");
        final SearchResponse<PersonDto> search = personService.search(request);
        LOGGER.info("PersonController search method is end.");
        return search;
    }

    @Override
    @PostMapping(value = "all")
    public SearchResponse<PersonDto> all(@RequestBody PaginationRequest request) {
        LOGGER.info("PersonController all method is start.");
        final SearchResponse<PersonDto> searchResponse = personService.all(request);
        LOGGER.info("PersonController all method is end.");
        return searchResponse;
    }

    @Override
    @GetMapping(value = "delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        LOGGER.info("PersonController delete method is start.");
        personService.delete(id);
        LOGGER.info("PersonController delete method is end.");
    }
}
