package bxm.dft.smp.online.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.bean.MSmpEmpInfMng03;
import bxm.dft.smp.online.service.dto.SSMP1006A002InDto;
import bxm.dft.smp.online.service.dto.SSMP1006A002OutDto;
import bxm.dft.smp.online.service.dto.SSMP1006A002SubDto;
import bxm.dft.smp.online.service.dto.SSMP1006A003InDto;

/**
 * @file         bxm.dft.smp.online.service.SSMP1006A.java
 * @filetype     java source file
 * @brief
 * @author       Seungjin Chung
 * @version      0.1
 * @history
 * <pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           Seungjin Chung       2017.04.11       신규 작성
 * </pre>
 */
@BxmService("SSMP1006A")
@BxmCategory(logicalName = "OMM Validator", description = "OMM Validator")
public class SSMP1006A {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private MSmpEmpInfMng03 mSmpEmpInfMng03;
	
	@BxmServiceOperation("ssmp1006a002")
	@BxmCategory(logicalName = "OMM Validator 테스트 메소드", description = "OMM Validator Include OMM List 테스트 메소드")
	public SSMP1006A002OutDto SSMP1006A002(SSMP1006A002InDto input) throws DefaultApplicationException {
		logger.info("Start OMM Validator Test Method: Include OMM List Type");
		mSmpEmpInfMng03 = DefaultApplicationContext.getBean(MSmpEmpInfMng03.class);
		SSMP1006A002OutDto output = new SSMP1006A002OutDto();
		
		logger.debug("======================= DEBUG Log ===========================");
		logger.info("======================= INFO Log ===========================");
		logger.error("======================= ERROR Log ===========================");
		logger.warn("======================= WARN Log ===========================");
		
		List<SSMP1006A002SubDto> list = mSmpEmpInfMng03.getMultiEmpList(input.getEmpList());
		
		output.setSize(list.size());
		output.getEmpList().addAll(list);
		return output;
	}

	@BxmServiceOperation("ssmp1006a003")
	@BxmCategory(logicalName = "OMM Validator 테스트 메소드", description = "OMM Validator Include OMM 테스트 메소드")
	public SSMP1006A002OutDto SSMP1006A003(SSMP1006A003InDto input) throws DefaultApplicationException {
		logger.info("Start OMM Validator Test Method: Include OMM Type");
		mSmpEmpInfMng03 = DefaultApplicationContext.getBean(MSmpEmpInfMng03.class);
		SSMP1006A002OutDto output = new SSMP1006A002OutDto();
		
		output.setSize(1);
		output.getEmpList().add(input.getEmpInfo());
		return output;
	}
	
	@BxmServiceOperation("ssmp1006a004")
	@BxmCategory(logicalName = "OMM Validator 테스트 메소드", description = "OMM Validator Include OMM 테스트 메소드")
	public SSMP1006A002OutDto SSMP1006A004(SSMP1006A002SubDto input) throws DefaultApplicationException {
		logger.info("Start OMM Validator Test Method: Include OMM Type");
		mSmpEmpInfMng03 = DefaultApplicationContext.getBean(MSmpEmpInfMng03.class);
		SSMP1006A002OutDto output = new SSMP1006A002OutDto();
		
		output.setSize(1);
		output.getEmpList().add(input);
		return output;
	}
	
}

