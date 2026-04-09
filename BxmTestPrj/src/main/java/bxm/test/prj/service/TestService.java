package bxm.test.prj.service;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.test.prj.bean.TestBean;
import bxm.test.prj.dto.TestDto;
import bxm.test.prj.dto.TestInDto;

/**
 * 
 *
 * @author sysadmin
 */ 
@BxmService("TestService")
@BxmCategory(logicalName="", author="sysadmin")
public class TestService {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	/**
	 * 
	 */
	private TestBean bean;
	
	/**
	 * 
	 * 
	 * @param input 
	 * @return 
	 */
	@BxmServiceOperation("getEmpInf")
	@BxmCategory(logicalName="단건조회 메소드", description="", author="sysadmin")
	public TestDto getEmpInf(TestInDto input)
	{
		logger.debug("============== SERVICE START ==============");
		logger.debug("input= {}", input);
		
		/**
		* @BXMType GetBean
		*/
		bean= DefaultApplicationContext.getBean(bean, TestBean.class);
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( input== null ) /**null check*/{
			// TODO 적합한 메시지 코드로 변경 하십시오.
			throw new DefaultApplicationException("BXME00001", new Object[]{""}, new Object[]{input.getFeduEmpNo()});
		}
		else if ( input.getFeduEmpNo()== null ) /**null check - */{
			// TODO 적합한 메시지 코드로 변경 하십시오.
			throw new DefaultApplicationException("msg_code", new Object[]{""});
		}
		/**
		 * @BXMType VariableDeclaration
		 */
		TestInDto beanInput= new TestInDto();
		beanInput.setFeduEmpNo(input.getFeduEmpNo()); //  FW샘플 임직원번호 
		/**
		 * @BXMType VariableDeclaration
		 */
		TestDto out= new TestDto();
		/**
		 * @BXMType BeanCall
		 * @Desc 
		 */
		TestDto beanOutput= bean.getEmp(beanInput);
		/**
		 * @BXMType IF
		 * @Desc 입력 검증 : 필수 입력 값 검증 코드를 작성 하십시오.
		 */
		if ( beanOutput== null ) /**null check*/{
			// TODO 적합한 메시지 코드로 변경 하십시오.
			throw new DefaultApplicationException("msg_code", new Object[]{""});
		}
		out.setFeduEmpNo(beanOutput.getFeduEmpNo()); //  FW샘플 임직원번호 
		out.setFeduEmpNm(beanOutput.getFeduEmpNm()); //  FW샘플 임직원명 
		out.setFeduOccpNm(beanOutput.getFeduOccpNm()); //  FW샘플 직업명 
		out.setFeduMngrEmpNo(beanOutput.getFeduMngrEmpNo()); //  FW샘플 관리자임직원번호 
		out.setFeduHireDt(beanOutput.getFeduHireDt()); //  FW샘플 입사일자 
		out.setFeduPayAmt(beanOutput.getFeduPayAmt()); //  FW샘플 급여금액 
		out.setFeduDeptNo(beanOutput.getFeduDeptNo()); //  FW샘플 부서번호 
		
		logger.debug("out= {}", out);
		logger.debug("============== SERVICE END ==============");
		
		//TODO :
		
		return out;
		
	} 
	
}
