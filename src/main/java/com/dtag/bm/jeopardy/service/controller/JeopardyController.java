package com.dtag.bm.jeopardy.service.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bm.jeopardy.service.model.Jeopardy;
import com.dtag.bm.jeopardy.service.service.JeopardyServiceImpl;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/jeopardyManagement/v1")
@JsonIgnoreProperties(ignoreUnknown = true)
public class JeopardyController {
	
	private static Logger logger = LoggerFactory.getLogger(JeopardyController.class);
	
	@Autowired
	private JeopardyServiceImpl serviceImpl;
	
	@SuppressWarnings("unused")
	private final String className = this.getClass().getSimpleName();
	
	/**
	 * This will create New Jeopardy
	 * 
	 * @return Jeopardy
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "create new Jeopardy", notes = "create new Jeopardy")

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Created new Jeopardy"),

			@ApiResponse(code = 500, message = "Internal Server Error") })

	@PostMapping("/jeopardy")
	public ResponseEntity<?> createJeopardy(@Valid @RequestBody Jeopardy jeopardy) throws Exception {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			Jeopardy jeopardy1 = serviceImpl.createJeopardy(jeopardy);
			logger.info("created Jeopardy : " + jeopardy1 );
            responseEntity = new ResponseEntity<>(jeopardy1, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}

	/**
	 * This will fetch Jeopardy
	 * 
	 * @return Jeopardy
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "fetch  JeopardyId", notes = "fetch  JeopardyId")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetch JeopardyId"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping("/jeopardydyId/{id}")
	public ResponseEntity<?> getJeopardyById(@Valid @PathVariable(value = "id") String Id)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			Jeopardy jeopardy  = serviceImpl.getJeopardyById(Id);
			logger.info("Jeopardy for given Id " + Id + " Jeopardy " + jeopardy);
			responseEntity = new ResponseEntity<>(jeopardy, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}

	/**
	 * This will delete jeopardydyId
	 * 
	 * @return void
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */

	@ApiOperation(value = "delete  JeopardyById", notes = "delete JeopardyById")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Deleted jeopardy"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@DeleteMapping("/Jeopardy/{id}")
	public ResponseEntity<?> deletById(@Valid @PathVariable(value = "id") String Id)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			serviceImpl.deleteById(Id);
			responseEntity = new ResponseEntity<>("Jeopardy delete Successfully", HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}

	/**
	 * This will update Jeopardy
	 * 
	 * @return jeopardy
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "update Jeopardy", notes = "update Jeopardy")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Updated Jeopardy"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PutMapping("/jeopardy/{id}")
	public ResponseEntity<?> updateJeopardy(@Valid @RequestBody Jeopardy jeopardy, @Valid @PathVariable(value = "id") String id)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			String status = serviceImpl.updateJeopardy(jeopardy, id);
			responseEntity = new ResponseEntity<>(status, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;

	}

	/**
	 * This will fetch getByExternalId
	 * 
	 * @return List of Jeopardy
	 * @throws com.fasterxml.jackson.core.JsonProcessingException
	 * 
	 */
	@ApiOperation(value = "fetch JeopardyByExternalId", notes = "fetch  JeopardyByExternalId")

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetch JeopardyByExternalId"),

			@ApiResponse(code = 500, message = "Internal Server Error") })

	@GetMapping("/jeopardy/getByExternalId/{externalId}")
	public ResponseEntity<?> getByExternalId(@Valid @PathVariable(value = "externalId") String externalId)
			throws Exception{
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {
			List<Jeopardy> jeopardy = serviceImpl.getByExternalId(externalId);
			logger.info("Jeopardy Details for ORN " + externalId + " Jeopardy " + jeopardy);
			if(jeopardy==null) {
				responseEntity = new ResponseEntity<>(" No Open JeoPardy Found", HttpStatus.NOT_FOUND);
			}
			responseEntity = new ResponseEntity<>(jeopardy, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	}
}
