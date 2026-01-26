package test.onl.svc;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmService("TestSvc")
@BxmCategory(logicalName="", author="sysadmin")
public class TestSvc {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	
}
