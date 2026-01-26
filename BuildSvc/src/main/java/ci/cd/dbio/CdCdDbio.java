/**
 * Generated 2026. 01. 26. 11:25:44
 */
package ci.cd.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import ci.cd.dto.CiCdDto;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author sysadmin
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "ci/cd/dbio/CdCdDbio.dbio", datasource = "MainDS")
@BxmCategory(logicalName="", description="", author="sysadmin")
public interface CdCdDbio
{
	/**
	 * 
	 */
	@BxmCategory(logicalName="", description="", author="sysadmin")
	CiCdDto select001(
		@Param("feduDeptNo")String feduDeptNo
		);
}
