/**
 * Generated 2025. 01. 22. 14:46:54
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08InDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList08OutDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList09InDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst002selectList09OutDto;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author 
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst002.dbio", datasource = "MainDS")
@BxmCategory(logicalName="Employee Info 02", description="", author="")
public interface DSmpEmpTst002
{
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - if test", description="", author="")
	List<DSmpEmpTst000Dto> selectList01(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - choose(when,otherwise)", description="", author="")
	List<DSmpEmpTst000Dto> selectList02(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - equalsIgnoreCase", description="", author="")
	List<DSmpEmpTst000Dto> selectList05(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - eq", description="", author="")
	List<DSmpEmpTst000Dto> selectList06(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - ==", description="", author="")
	List<DSmpEmpTst000Dto> selectList07(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Update - set", description="", author="")
	int update04(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Update - trim", description="", author="")
	int update03(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - foreach(Using DTO)", description="", author="")
	List<DSmpEmpTst002selectList08OutDto> selectList08(
		@Param("master")DSmpEmpTst002selectList08InDto master
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Select - foreach(Using Array)", description="", author="")
	List<DSmpEmpTst002selectList09OutDto> selectList09(
		@Param("master")DSmpEmpTst002selectList09InDto master
		);
}
