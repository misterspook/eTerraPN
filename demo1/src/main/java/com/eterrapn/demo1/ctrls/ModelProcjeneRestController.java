package com.eterrapn.demo1.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eterrapn.demo1.jpa.ModelProcjene;
import com.eterrapn.demo1.reps.ModelProcjeneRepository;

@RestController
public class ModelProcjeneRestController {
	
	private final ModelProcjeneRepository modelProcjeneRepository;
	
	@Autowired
	public ModelProcjeneRestController(ModelProcjeneRepository modelProcjeneRepository) {
		this.modelProcjeneRepository = modelProcjeneRepository;
	}
	
	@RequestMapping(value = "modeli", method = RequestMethod.GET)
	public Collection<ModelProcjene> getModeleProcjene() {
		return modelProcjeneRepository.findAll();
	}

}
