/**
 * Generated 2026. 04. 08. 19:00:15
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.annotation.TestValue;
import bxm.container.annotation.TestValues;
import bxm.context.das.LockUpdate;
import bxm.context.das.LockUpdater;
import bxm.das.annotation.DasLockUpdate;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;

/**
 * 
 *
 * @author 
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst000.dbio", datasource = "MainDS")
@BxmCategory(logicalName="Employee Information TST", description="", author="")
public interface DSmpEmpTst000
{
	/**
	 * 
	 */
	@TestValues({
		@TestValue(values="feduEmpNo=7369")
	})
	@BxmCategory(logicalName="Employee Info Single Select", description="", author="")
	DSmpEmpTst000Dto selectOne00(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@DasLockUpdate(table = "BXM400.SMP_EMP_TST")
	@BxmCategory(logicalName="Employee Info Single Select(Lock)", description="", author="")
	DSmpEmpTst000Dto selectOneLock00(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	
	/**
	 * Employee Info Single Select(Lock) for Lock update<br>
	 * LockUpdate - Generated from selectOneLock00
	 */
	LockUpdater<DSmpEmpTst000Dto> selectOneLock00(DSmpEmpTst000Dto dSmpEmpTst000Dto
	, LockUpdate lockUpdate);
	
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Update", description="", author="")
	int update00(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Delete Employee Info", description="", author="")
	int delete00(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Insert Employee Info", description="", author="")
	int insert00(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select FOR UPDATE", description="", author="")
	DSmpEmpTst000Dto selectOne01(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
}
