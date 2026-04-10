/**
 * Generated 2026. 04. 10. 12:46:53
 */
package bxm.dft.smp.batch.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.dft.smp.batch.bean.dto.BxmTestChunkOutputDto;
import java.util.List;

/**
 * 
 *
 * @author sysadmin
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/batch/dbio/DbxmJobInfo001.dbio", datasource = "MainDS")
@BxmCategory(logicalName="배치작업정보", description="", author="sysadmin")
public interface DbxmJobInfo001
{
	/**
	 * 배치작업정보 SELECT
	 */
	@BxmCategory(logicalName="배치작업정보 SELECT", description="배치작업정보 SELECT", author="sysadmin")
	List<BxmTestChunkOutputDto> selectList00();
}
