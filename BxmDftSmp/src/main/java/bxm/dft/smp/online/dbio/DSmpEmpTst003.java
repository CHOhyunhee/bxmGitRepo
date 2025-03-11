/**
 * Generated 2024. 12. 20. 14:37:38
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst003selectList01Out;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author 
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst003.dbio", datasource = "MainDS")
@BxmCategory(logicalName="Sample DBIO", description="", author="")
public interface DSmpEmpTst003
{
	/**
	 * 
	 */
	@BxmCategory(logicalName="", description="", author="")
	DSmpEmpTst003selectList01Out selectMultiEmpList(
		@Param("feduEmpNo")Integer feduEmpNo
		);
}
