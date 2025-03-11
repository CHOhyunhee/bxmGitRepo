package bxm.dft.smp.online.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import bxm.dft.context.DefaultSystemHeader;
import bxm.dft.smp.online.bean.MSmpEmpInfMng;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
import bxm.omm.root.IOmmObject;
import bxm.test.support.JUnitModuleTestSupport;
import bxm.test.support.ModuleTestResult;
import java.net.URL;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("'Employee Info Management'의 테스트")
public class TestMSmpEmpInfMng
extends JUnitModuleTestSupport<DefaultSystemHeader>
{
	
	/**
	 * {@link bxm.dft.smp.online.bean.MSmpEmpInfMng#addEmpInf(
		* DSmpEmpTst000Dto
	 * )}
	 */
	@DisplayName("Single Insert")
	@Test
	void testAddEmpInf()
	{
		// TODO 필수 헤더값 설정
		
		
		// 테스트 대상 메소드의 입력 파라미터 타입 목록
		Class<?>[] paramTypes= new Class<?>[] {
			DSmpEmpTst000Dto.class
		};
		
		// TODO 입력 값 설정
		DSmpEmpTst000Dto param0= new DSmpEmpTst000Dto();
		//param0.setRowId(null); // Row ID
		//param0.setFeduEmpNo(0); // Employee id
		//param0.setFeduEmpNm(null); // Employee name
		//param0.setFeduOccpNm(null); // Employee Occupy
		//param0.setFeduMngrEmpNo(0); // Employee manager id
		//param0.setFeduIpsaDt(null); // Employee entering date
		//param0.setFeduPayAmt(new BigDecimal("0")); // Employee salary
		//param0.setFeduDeptNo(0); // Employee department
		
		
		try{
			// TODO 기대값 설정 : 테스트 결과로 원하는 기대 값을 설정 하십시오.
			int expected= 0;
			
			// 테스트 수행
			ModuleTestResult<DefaultSystemHeader, Integer> result= 
					doTest(
							MSmpEmpInfMng.class
							, "addEmpInf"
							, paramTypes
							// ↓↓↓↓입력↓↓↓↓
							, param0
							);
			
			int actual= result.getResult();
			
			// 결과 출력
			logger.debug("Output = {}", actual);
			
			// 결과 비교
			assertEquals(expected, actual);
		}
		catch (Exception e) {
			// 테스트 수행 실패
			logger.error(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	/**
	 * {@link bxm.dft.smp.online.bean.MSmpEmpInfMng#getEmpInf(
		* DSmpEmpTst000Dto
	 * )}
	 */
	@DisplayName("Single Select")
	@Test
	void testGetEmpInf()
	{
		// TODO 필수 헤더값 설정
		
		
		// 테스트 대상 메소드의 입력 파라미터 타입 목록
		Class<?>[] paramTypes= new Class<?>[] {
			DSmpEmpTst000Dto.class
		};
		
		// TODO 입력 값 설정
		DSmpEmpTst000Dto param0= new DSmpEmpTst000Dto();
		//param0.setRowId(null); // Row ID
		//param0.setFeduEmpNo(0); // Employee id
		//param0.setFeduEmpNm(null); // Employee name
		//param0.setFeduOccpNm(null); // Employee Occupy
		//param0.setFeduMngrEmpNo(0); // Employee manager id
		//param0.setFeduIpsaDt(null); // Employee entering date
		//param0.setFeduPayAmt(new BigDecimal("0")); // Employee salary
		//param0.setFeduDeptNo(0); // Employee department
		
		
		try{
			// TODO 기대값 설정 : 테스트 결과로 원하는 기대 값을 설정 하십시오.
			DSmpEmpTst000Dto expected= new DSmpEmpTst000Dto();
			
			// 테스트 수행
			ModuleTestResult<DefaultSystemHeader, DSmpEmpTst000Dto> result= 
					doTest(
							MSmpEmpInfMng.class
							, "getEmpInf"
							, paramTypes
							// ↓↓↓↓입력↓↓↓↓
							, param0
							);
			
			DSmpEmpTst000Dto actual= result.getResult();
			
			// 결과 출력
			logger.debug("Output = {}", actual);
			
			// 결과 비교
			assertEquals(expected, actual);
		}
		catch (Exception e) {
			// 테스트 수행 실패
			logger.error(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	@Override
	protected String getDefaultEndpointURL() {
		return "";
	}
	
	@Override
	protected Class<DefaultSystemHeader> getHeaderClass(){
		return DefaultSystemHeader.class;
	}
	
	@Override
	protected void beforeTest(
			URL endpointURL
			, DefaultSystemHeader requestHeader
			, IOmmObject requestOptionHeader1
			, IOmmObject requestOptionHeader2
			, IOmmObject requestOptionHeader3
			, Object[] requestInput
			) 
	{
		// TODO 테스트 직전에 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void afterTest(
			ModuleTestResult<DefaultSystemHeader, Object> testResult
			) 
	{
		// TODO 테스트 수행이 성공하면 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchMalformedEndpointURLError(
		String endpointURL
		, Throwable e
		) 
	{
		// TODO 잘못된 형식의 URL이 사용 되었을 때 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchInvalidEndpointURLError(
		URL endpointURL
		) 
	{
		// TODO 잘못된 URL 또는 원격지로 부터 데이터를 읽을 수 없을 때 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchPlatformError(
			DefaultSystemHeader requestHeader
			, IOmmObject requestOptionHeader1
			, IOmmObject requestOptionHeader2
			, IOmmObject requestOptionHeader3
			, Object[] requestInput
			, DefaultSystemHeader responseHeader
			) 
	{
		// TODO 플랫폼 에러가 발생했을 때 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchModuleError(
			DefaultSystemHeader requestHeader
			, IOmmObject requestOptionHeader1
			, IOmmObject requestOptionHeader2
			, IOmmObject requestOptionHeader3
			, Object[] requestInput
			, DefaultSystemHeader responseHeader
			) 
	{
		// TODO 모듈 에러가 발생했을 때 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchUnknownError(
			DefaultSystemHeader requestHeader
			, IOmmObject requestOptionHeader1
			, IOmmObject requestOptionHeader2
			, IOmmObject requestOptionHeader3
			, Object[] requestInput
			, Throwable cause
			) 
	{
		// TODO 알수 없는 에러가 발생했을 때 수행할 작업을 기술하십시오.
	}
	
	
}
