/**
 * Generated 2026. 01. 26. 14:33:19
 */
package test.onl.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import org.apache.ibatis.annotations.Param;
import test.onl.dto.TestDto;

/**
 * 
 *
 * @author sysadmin
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "test/onl/dbio/TestDbio.dbio", datasource = "MainDS")
@BxmCategory(logicalName="", description="", author="sysadmin")
public interface TestDbio
{
	/**
	 * 
	 */
	@BxmCategory(logicalName="", description="", author="sysadmin")
	TestDto select001(
		@Param("feduEmpNo")String feduEmpNo
		);
}
