/**
 * Generated 2025. 02. 28. 12:30:28
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.dft.smp.online.dbio.dto.DBxmLogTestIO3;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.dft.smp.online.dbio.dto.TestDbioIO;
import java.util.List;

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
	 * test
	 */
	@BxmCategory(logicalName="Employee Info Single Select", description="test", author="")
	DSmpEmpTst000Dto selectOne00(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
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
	/**
	 * 
	 */
	@BxmCategory(logicalName="", description="", author="sysadmin")
	int insertAppLog(
		DBxmLogTestIO3 dBxmLogTestIO3
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="", description="", author="sysadmin")
	List<TestDbioIO> TestSql();
}
