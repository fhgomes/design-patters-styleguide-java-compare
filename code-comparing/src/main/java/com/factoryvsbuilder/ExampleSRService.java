package com.factoryvsbuilder;

import org.springframework.stereotype.Service;

@Service
public class ExampleSRService {

	private final ExampleRepository exampleRepository;
	private final ExampleSimpleFactory exampleSimpleFactory;

	public ExampleSRService(ExampleRepository exampleRepository, ExampleSimpleFactory exampleSimpleFactory) {
		this.exampleRepository = exampleRepository;
		this.exampleSimpleFactory = exampleSimpleFactory;
	}

	public void doSomeBusinessLogic(DummyDTO request) {
		validate(request);

		/*
			Extracted build complexity to other class, to share responsibilities,
			make easier to read
			make easier to test
			make easier to maintain
		 */
		DummyEntity myPreciousEntity = exampleSimpleFactory.doSomeBusinessLogic(request, "defaultProp3");

		exampleRepository.dummySave(myPreciousEntity);
	}

	private void validate(DummyDTO request) {
		//do something
	}
}