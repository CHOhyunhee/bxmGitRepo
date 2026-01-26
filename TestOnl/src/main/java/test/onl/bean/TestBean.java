package test.onl.bean;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 *
 * @author sysadmin
 */
@BxmBean
@BxmCategory(logicalName="", author="sysadmin")
public class TestBean {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
}
