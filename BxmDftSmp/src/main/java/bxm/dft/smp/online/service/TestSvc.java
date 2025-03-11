package bxm.dft.smp.online.service;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * test service 
 *
 * @author tester
 */
@BxmService("TestSvc")
@BxmCategory(logicalName="test service ", description="test service ", author="tester")
public class TestSvc {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	
}
