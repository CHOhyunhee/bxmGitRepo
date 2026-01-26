package ci.cd.svc;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmService("CiCdSvc")
@BxmCategory(logicalName="", author="sysadmin")
public class CiCdSvc {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	
}
