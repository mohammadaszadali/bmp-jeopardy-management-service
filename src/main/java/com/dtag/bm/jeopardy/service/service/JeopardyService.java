package com.dtag.bm.jeopardy.service.service;

import java.util.List;

import com.dtag.bm.jeopardy.service.model.Jeopardy;

public interface JeopardyService {

	public Jeopardy createJeopardy(Jeopardy jeopardy);

	public Jeopardy getJeopardyById(String Id);

	public void deleteById(String Id);

	public String updateJeopardy(Jeopardy order, String id);

	public List<Jeopardy> getByExternalId(String externalId);

}
