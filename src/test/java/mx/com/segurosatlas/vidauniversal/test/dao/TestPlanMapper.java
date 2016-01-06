package mx.com.segurosatlas.vidauniversal.test.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import mx.com.segurosatlas.vidauniversal.model.configuration.MybatisConfiguration;
import mx.com.segurosatlas.vidauniversal.model.domain.Plan;
import mx.com.segurosatlas.vidauniversal.model.persistence.PlanMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MybatisConfiguration.class)
@Transactional
public class TestPlanMapper {

	private final static Logger logger = Logger.getLogger(TestPlanMapper.class);
	
	@Autowired
	private PlanMapper mapper;

	@Test
	public void testConfiguration(){
		logger.info("testing configuration...");
	}

	@Test
	public void testInsert(){
		Plan vo = new Plan();
		
		vo.setCveLinea(4);
		vo.setCvePlan(968);
		vo.setDescripcion("Nombre plan prueba");
		vo.setDescripcionc("descripcion c del plan");
		vo.setTasaFinanc(0);
		vo.setTablaMortal(0);
		vo.setTablaEdadesEq(0);
		
		mapper.save(vo);
		logger.info("Inserto Plan: " + vo);
		
	}
	
	@Test
	public void testDelete(){
		mapper.delete(968);
		logger.info("Elimina plan: 968");
		
	}
	
	
	
	@Test
	public void testFindAll(){
		for(Plan vo: mapper.findAll()){
			logger.info(vo );
		}
		
	}
	
	@Test
	public void testFindById(){
		Plan vo = mapper.findByID(67);
			logger.info("NamePlan: " + vo.getDescripcion() );
	}
	
	@Test
	public void testFindPlanByCveLinea(){		
			logger.info("PlanesDeVida: " + mapper.findPlanByCveLinea(4).size());
	}
	
}
