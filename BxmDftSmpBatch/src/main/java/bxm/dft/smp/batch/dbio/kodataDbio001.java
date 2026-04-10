/**
 * Generated 2026. 04. 10. 15:31:11
 */
package bxm.dft.smp.batch.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.annotation.TestValue;
import bxm.container.annotation.TestValues;
import bxm.dft.smp.batch.dbio.kodataDbioDto;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author sysadmin
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/batch/dbio/kodataDbio001.dbio", datasource = "MainDS")
@BxmCategory(logicalName="", description="", author="sysadmin")
public interface kodataDbio001
{
	/**
	 * 
	 */
	@TestValues({
		@TestValue(values="feduEmpNo=7369")
	})
	@BxmCategory(logicalName="", description="", author="sysadmin")
	kodataDbioDto selectOneKD001(
		@Param("feduEmpNo")String feduEmpNo
		);
}
