/**
 * Generated 2026. 04. 10. 13:36:32
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.annotation.TestValue;
import bxm.container.annotation.TestValues;
import bxm.dft.smp.online.dbio.dto.BxmTestDbioDto;
import org.apache.ibatis.annotations.Param;

/**
 * 테스트용 DBIO
 *
 * @author sysadmin
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/BxmTestDbio.dbio", datasource = "MainDS")
@BxmCategory(logicalName="테스트 DBIO", description="테스트용 DBIO", author="sysadmin")
public interface BxmTestDbio
{
	/**
	 * 
	 */
	@TestValues({
		@TestValue(values="feduEmpNo=7654")
	})
	@BxmCategory(logicalName="단건조회", description="", author="sysadmin")
	BxmTestDbioDto select001(
		@Param("feduEmpNo")String feduEmpNo
		);
}
