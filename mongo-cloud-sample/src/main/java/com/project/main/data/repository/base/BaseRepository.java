package com.project.main.data.repository.base;

import com.project.main.data.document.base.BaseDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends BaseDocument, PK extends Serializable> extends MongoRepository<T, PK>{
}
