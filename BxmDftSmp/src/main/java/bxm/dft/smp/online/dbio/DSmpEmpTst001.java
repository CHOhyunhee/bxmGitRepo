/**
 * Generated 2024. 09. 04. 16:15:10
 */
package bxm.dft.smp.online.dbio;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmDataAccess;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01InDto;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst001selectPage01OutDto;
import bxm.dft.smp.online.service.dto.SSMP1002A002InDto;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author 
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/online/dbio/DSmpEmpTst001.dbio", datasource = "MainDS")
@BxmCategory(logicalName="Employee Info 01", description="", author="")
public interface DSmpEmpTst001
{
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Multi-Select01", description="", author="")
	List<DSmpEmpTst000Dto> selectList01(
		DSmpEmpTst000Dto dSmpEmpTst000Dto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Multi-Select 02", description="", author="")
	List<DSmpEmpTst000Dto> selectList02(
		SSMP1002A002InDto sSMP1002A002InDto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Pagzing (Top-N)", description="", author="")
	List<DSmpEmpTst001selectPage01OutDto> selectPage01(
		@Param("input")DSmpEmpTst001selectPage01InDto input
		, @Param("pageNum")int pageNum
		, @Param("pageCount")int pageCount
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="", description="", author="")
	Long selectCount01(
		DSmpEmpTst001selectPage01InDto dSmpEmpTst001selectPage01InDto
		);
	/**
	 * 
	 */
	@BxmCategory(logicalName="Employee Info Pagzing (Next-Key)", description="", author="")
	List<DSmpEmpTst000Dto> selectPage02(
		@Param("input")DSmpEmpTst000Dto input
		, @Param("next")DSmpEmpTst000Dto next
		, @Param("pageCount")int pageCount
		);
}
