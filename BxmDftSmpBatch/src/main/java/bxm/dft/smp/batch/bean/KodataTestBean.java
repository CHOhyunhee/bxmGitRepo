package bxm.dft.smp.batch.bean;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.batch.dbio.kodataDbio001;
import bxm.dft.smp.batch.dbio.kodataDbioDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmBean
@BxmCategory(logicalName="", author="sysadmin")
public class KodataTestBean {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	private kodataDbio001   kodatadbio001;
	
	/**
	 * 
	 *
	 * @return 
	 */
	@BxmCategory(logicalName="", description="", author="sysadmin")
	public kodataDbioDto getEmpInf(kodataDbioDto input) {
		
		kodatadbio001 = DefaultApplicationContext.getBean(kodatadbio001, kodataDbio001.class);
		kodataDbioDto output = null;
		
		output = kodatadbio001.selectOneKD001(String.valueOf(input.getFeduEmpNo()));
		return output;
	}
	
}
