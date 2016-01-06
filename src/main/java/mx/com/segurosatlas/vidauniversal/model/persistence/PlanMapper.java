package mx.com.segurosatlas.vidauniversal.model.persistence;

import java.util.List;

import mx.com.segurosatlas.vidauniversal.model.domain.Plan;


public interface PlanMapper {
	
	void save(Plan plan);
    
    void delete(Integer cvePlan);
    
	Plan findByID(Integer cvePlan);
     
    List<Plan> findAll();
    
    List<Plan> findPlanByCveLinea(Integer cveLinea);

}
