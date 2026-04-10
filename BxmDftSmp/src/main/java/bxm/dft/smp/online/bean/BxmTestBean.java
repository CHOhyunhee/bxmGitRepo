package bxm.dft.smp.online.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.dbio.BxmTestDbio;
import bxm.dft.smp.online.dbio.dto.BxmTestDbioDto;

/**
 * 
 *
 * @author sysadmin
 */
@BxmBean
@BxmCategory(logicalName="테스트 BEAN ", author="sysadmin")
public class BxmTestBean {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	private BxmTestDbio bxmTestDbio;
	/**
	 * 
	 *
	 * @return 
	 */
	@BxmCategory(logicalName="단건조회", description="", author="sysadmin")
	public BxmTestDbioDto getEmpInf(BxmTestDbioDto input) {
		
		bxmTestDbio = DefaultApplicationContext.getBean(bxmTestDbio, BxmTestDbio.class);
		
		BxmTestDbioDto output = null;
		
		output = bxmTestDbio.select001(String.valueOf(input.getFeduEmpNo()));
		
		logger.debug("bean output = {}", output);
		
		return output;
	}
	
}
