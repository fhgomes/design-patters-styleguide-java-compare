package com.factoryvsbuilder;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * How to name this component? Has ability to handle the request and transform in a correct Entity
 * Maybe with more steps/transformations than a direct Mapper, like MapStruct
 * The purpose is to isolate this logic and separate from the main Service, to make it better testable and maintainable
 *
 * Is it a factory ? even not using interface ou abstraction, but because it creates my object?
 * Is it a builder ? even if it´s not complex and has a Single Method, also its not possible to build part of the object?
 */
@Component
public class ExampleSimpleFactory {

	public DummyEntity doSomeBusinessLogic(DummyDTO request, String justExtraParamToUse) {
		Long prop2FromRequest = createProp2FromRequest(request);
		String prop3FromRequest = createProp3FromRequest(request, justExtraParamToUse);
		return new DummyEntity(request.getProp1(), prop2FromRequest, prop3FromRequest);
	}

	private Long createProp2FromRequest(DummyDTO request) {
		return request.getPartOfNumberProp2() + request.getAnotherPartOfNumberProp2();
	}

	private String createProp3FromRequest(DummyDTO request, String justExtraParamToUse) {
		DummySpecialPropDTO specialProp = request.getSpecialProp();
		if (specialProp == null) {
			return justExtraParamToUse;
		}
		return specialProp.getSpecialPartOfProp3() + specialProp.getSpecialAnotherPartOfProp3();
	}

}