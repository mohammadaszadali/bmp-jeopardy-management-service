package com.dtag.bm.jeopardy.service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dtag.bm.jeopardy.service.model.Jeopardy;

@Repository
public interface JeopardyRepository extends MongoRepository<Jeopardy, String> {

	public Jeopardy getById(String Id);

	public void deleteById(String Id);

	public Jeopardy getByExternalId(String externalId);

}
