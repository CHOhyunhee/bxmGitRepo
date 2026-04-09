/**
 * Generated 2026. 04. 09. 15:43:06
 */
package bxm.test.prj.dao;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.annotation.TestValue;
import bxm.container.annotation.TestValues;
import bxm.test.prj.dto.TestDto;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author sysadmin
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/test/prj/dao/TestDbio.dbio", datasource = "MainDS")
@BxmCategory(logicalName="임직원정보조회 DBIO ", description="", author="sysadmin")
public interface TestDbio
{
	/**
	 * 
	 */
	@TestValues({
		@TestValue(values="feduEmpNo=7369")
	})
	@BxmCategory(logicalName="", description="", author="sysadmin")
	TestDto select001(
		@Param("feduEmpNo")String feduEmpNo
		);
}
