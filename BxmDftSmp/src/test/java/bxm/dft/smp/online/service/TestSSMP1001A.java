package bxm.dft.smp.online.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import bxm.dft.context.DefaultSystemHeader;
import bxm.dft.smp.online.service.dto.SSMP1001A001InDto;
import bxm.dft.smp.online.service.dto.SSMP1001A001OutDto;
import bxm.dft.smp.online.service.dto.SSMP1001A002InDto;
import bxm.dft.smp.online.service.dto.SSMP1001A002OutDto;
import bxm.dft.smp.online.service.dto.SSMP1001A003InDto;
import bxm.dft.smp.online.service.dto.SSMP1001A003OutDto;
import bxm.dft.smp.online.service.dto.SSMP1001A004InDto;
import bxm.dft.smp.online.service.dto.SSMP1001A004OutDto;
import bxm.dft.smp.online.service.dto.SSMP1001A005InDto;
import bxm.dft.smp.online.service.dto.SSMP1001A005OutDto;
import bxm.omm.root.IOmmObject;
import bxm.test.support.JUnitServiceTestSupport;
import bxm.test.support.TestResult;

import java.math.BigDecimal;
import java.net.URL;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("'Single select'의 테스트")
public class TestSSMP1001A
extends JUnitServiceTestSupport<DefaultSystemHeader>
{
	
	/**
	 * {@link bxm.dft.smp.online.service.SSMP1001A#ssmp1001a001(SSMP1001A001InDto)}
	 */
	@DisplayName("Single select")
	@Test
	void testSsmp1001a001()
	{
		// TODO 필수 헤더값 설정
		setHeaderValue("trxCd", "SSMP1001A001");
		setHeaderValue("chlType", "A1");
		
		// TODO 입력 인스턴스 생성 및 필드 값 설정
		SSMP1001A001InDto input= new SSMP1001A001InDto();
		input.setFeduEmpNo(7839); // FW교육임직원번호
		
		try{
			// TODO 기대값 설정 : 테스트 결과로 원하는 기대 값을 설정 하십시오.
			SSMP1001A001OutDto expected= new SSMP1001A001OutDto();
			expected.setFeduEmpNm("KING");
			expected.setFeduEmpNo(7839);
			expected.setFeduOccpNm("PRESIDENT"); // FW교육직업명
			expected.setFeduMngrEmpNo(0); // FW교육관리자임직원번호
			expected.setFeduIpsaDt(null); // FW교육입사일자
			expected.setFeduPayAmt(5000); // FW교육급여금액
			expected.setFeduDeptNo(10); // FW교육부서번호
			
			
			// 테스트 수행
			TestResult<DefaultSystemHeader, SSMP1001A001OutDto> result= doTest(input);
			
			SSMP1001A001OutDto actual= result.getResult();
			
			// 결과 출력
			logger.debug("Output = {}", actual);
			
			// 결과 비교
			assertEquals(expected, actual);
		} 
		catch(Exception e){
			// 테스트 수행 실패
			logger.error(e.getMessage());
			fail(e.getMessage());
		}
	}
	

	@Override
	protected String getDefaultEndpointURL() {
		return "http://172.19.90.23:38080/serviceEndpoint/httpService/request.obj";
	}
	
	@Override
	protected Class<DefaultSystemHeader> getHeaderClass(){
		return DefaultSystemHeader.class;
	}
	
	@Override
	protected void beforeTest(
			URL endpointURL
			, DefaultSystemHeader header
			, IOmmObject optionHeader1
			, IOmmObject optionHeader2
			, IOmmObject optionHeader3
			, IOmmObject input
			) 
	{
		// TODO 테스트 직전에 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void afterTest(
			TestResult<DefaultSystemHeader, IOmmObject> testResult
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
			DefaultSystemHeader header
			, IOmmObject optionHeader1
			, IOmmObject optionHeader2
			, IOmmObject optionHeader3
			, IOmmObject input
			, DefaultSystemHeader responseHeader
			) 
	{
		// TODO 플랫폼 에러가 발생했을 때 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchServiceError(
			DefaultSystemHeader header
			, IOmmObject optionHeader1
			, IOmmObject optionHeader2
			, IOmmObject optionHeader3
			, IOmmObject input
			, DefaultSystemHeader responseHeader
			) 
	{
		// TODO 서비스 에러가 발생했을 때 수행할 작업을 기술하십시오.
	}
	
	@Override
	protected void catchUnknownError(
			DefaultSystemHeader header
			, IOmmObject optionHeader1
			, IOmmObject optionHeader2
			, IOmmObject optionHeader3
			, IOmmObject input
			, Throwable cause
			) 
	{
		// TODO 알수 없는 에러가 발생했을 때 수행할 작업을 기술하십시오.
	}
	
	
}
