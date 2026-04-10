package bxm.dft.smp.online.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.bean.BxmTestBean;
import bxm.dft.smp.online.dbio.dto.BxmTestDbioDto;
import bxm.dft.smp.online.service.dto.BxmTestSvcInDto;
import bxm.dft.smp.online.service.dto.BxmTestSvcOutDto;

/**
 * 
 *
 * @author sysadmin
 */
@BxmService("BxmTestSvc")
@BxmCategory(logicalName="테스트 서비스", author="sysadmin")
public class BxmTestSvc {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	private BxmTestBean bxmTestBean;
	
	/**
	 * 
	 */
	@BxmServiceOperation("ssmp9009a009")
	@BxmCategory(logicalName="", description="", author="sysadmin")
	public BxmTestSvcOutDto ssmp9009a009(BxmTestSvcInDto input)
	{
		
		bxmTestBean = DefaultApplicationContext.getBean(bxmTestBean, BxmTestBean.class);
		
		BxmTestSvcOutDto output = new BxmTestSvcOutDto();
		
		BxmTestDbioDto beanInput = new BxmTestDbioDto();
		
		
		beanInput.setFeduEmpNo(input.getFeduEmpNo());
		
		BxmTestDbioDto beanOutput = bxmTestBean.getEmpInf(beanInput);
		
		output.setFeduEmpNo(beanOutput.getFeduEmpNo()); // FW샘플 임직원번호
		output.setFeduEmpNm(beanOutput.getFeduEmpNm()); // FW샘플 임직원명
		output.setFeduOccpNm(beanOutput.getFeduOccpNm()); // FW샘플 직업명
		output.setFeduMngrEmpNo(beanOutput.getFeduMngrEmpNo()); // FW샘플 관리자임직원번호
		output.setFeduHireDt(beanOutput.getFeduHireDt()); // FW샘플 입사일자
		output.setFeduPayAmt(beanOutput.getFeduPayAmt()); // FW샘플 급여금액
		output.setFeduDeptNo(beanOutput.getFeduDeptNo()); // FW샘플 부서번호
		
		if(input.getFeduEmpNo().equals(BigDecimal.valueOf(9877))) {
			  logger.error("Pre-Deploy Test Exception for FeduEmpNo [9877].");
			   throw new DefaultApplicationException("BXME30000", new Object[] {},
			     new Object[] { "Pre-Deploy Test Exception." });
		}
		
		 {
			   DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
			  }
		
		return output;
	}
	
	
}
