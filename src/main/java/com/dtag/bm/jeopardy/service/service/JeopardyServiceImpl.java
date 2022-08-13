package com.dtag.bm.jeopardy.service.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.dtag.bm.jeopardy.service.dao.JeopardyRepository;
import com.dtag.bm.jeopardy.service.model.Jeopardy;
import com.dtag.bm.jeopardy.service.util.JeopardyManagementConstants;

@Service
public class JeopardyServiceImpl implements JeopardyService {

	private static Logger logger = LoggerFactory.getLogger(JeopardyServiceImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	JeopardyRepository repository;

	@Override
	public Jeopardy createJeopardy(Jeopardy jeopardy) {
		StringBuffer ramdomId = new StringBuffer();
		long id = System.nanoTime();
		jeopardy.setId(ramdomId.append(JeopardyManagementConstants.ID).append(new Long(id).toString()).toString());
		logger.info("Id : " + jeopardy.getId());
		mongoTemplate.save(jeopardy);
		logger.info("jeopardy " + jeopardy );
		return jeopardy;
	}

	@Override
	public Jeopardy getJeopardyById(String Id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("Id".trim()).is(Id.trim()));
		return mongoTemplate.findOne(query, Jeopardy.class);
	}
	public void deleteById(String Id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("Id".trim()).is(Id.trim()));
		mongoTemplate.remove(query, Jeopardy.class);
	}
	@Override
	public List<Jeopardy> getByExternalId(String externalId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("externalId".trim()).is(externalId.trim()));
		List<Jeopardy> jeopardies = mongoTemplate.find(query, Jeopardy.class);
		for(Jeopardy jeopardy :jeopardies) {
			if(jeopardy.getJeopardyStatus().equalsIgnoreCase("open")) {
				jeopardies.add(jeopardy);
				logger.info(" Jeopardy for open Status " + jeopardies );
				return jeopardies;	
		}
		}
		return null;
	}
	@Override
	public String updateJeopardy(Jeopardy jeopardy, String id) {
		jeopardy.setId(id);
		mongoTemplate.save(jeopardy);
		return "updated successfully";
	}

}
