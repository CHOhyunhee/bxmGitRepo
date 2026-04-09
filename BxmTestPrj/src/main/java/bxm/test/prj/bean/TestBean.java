package bxm.test.prj.bean;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.dft.context.DefaultApplicationContext;
import bxm.test.prj.dao.TestDbio;
import bxm.test.prj.dto.TestDto;
import bxm.test.prj.dto.TestInDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmBean
@BxmCategory(logicalName="단건조회용 bean", author="sysadmin")
public class TestBean {
	private Logger logger= LoggerFactory.getLogger(getClass());

	private TestDbio testDbio;
	
	/**
	 * 
	 *
	 * @return 
	 */
	@BxmCategory(logicalName="단건조회 메소드", description="", author="sysadmin")
	public TestDto getEmp(TestInDto input) {
		
		testDbio = DefaultApplicationContext.getBean(testDbio, TestDbio.class);
		
		TestDto output = null;
	
		output = testDbio.select001(String.valueOf(input.getFeduEmpNo()));
		
		logger.debug("output = {}", output);
		
		return output;
	}
	
}
