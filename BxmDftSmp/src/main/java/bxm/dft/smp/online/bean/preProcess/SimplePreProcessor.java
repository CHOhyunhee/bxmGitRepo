package bxm.dft.smp.online.bean.preProcess;

import bxm.BizPreprocessor;
import bxm.common.Context;
import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.omm.root.IOmmObject;
import bxm.request.ContextHeader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmBean("SimplePreProcessor")
@BxmCategory(logicalName="", description="", author="sysadmin")
public class SimplePreProcessor extends BizPreprocessor {
	private Logger logger= LoggerFactory.getLogger(getClass());

	
	
	@Override
	public void preProcess(Context ctx, ContextHeader header, IOmmObject input) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("SimplePreProcessor is started'");
		
	}
	
}
