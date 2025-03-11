package bxm.dft.smp.online.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.bean.MSmpEmpInfMng;
import bxm.dft.smp.online.dbio.dto.DSmpEmpTst000Dto;
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
import bxm.instance.NestedRuntimeException;
import test.pre.svc.TestPreService;

/**
 * <b>BXM Service class</b>
 * <p>
 * <b>Revision history</b><br>
 * <pre>
 * 2017.11.14 : New creation
 * </pre>
 *
 * @since 2017.11.14
 * @version 1.0.0
 * @author Education
 */
@BxmService("SSMP1001A")
@BxmCategory(logicalName = "Single select", description = "Single select")
public class SSMP1001A {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private MSmpEmpInfMng mSmpEmpInfMng;

	@BxmServiceOperation("ssmp1001a001")
	@BxmCategory(logicalName = "Single select", description = "Single select for employee information")
	public SSMP1001A001OutDto ssmp1001a001(SSMP1001A001InDto input) throws DefaultApplicationException, InterruptedException {

		logger.debug("============== SERVICE START !!!!!!!!!! ==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng = DefaultApplicationContext.getBean(mSmpEmpInfMng, MSmpEmpInfMng.class);
		
		TestPreService testPreSvc = new TestPreService();
		
		logger.debug("TEST!!!");
		testPreSvc.preProcessTest();
		
		/** 
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto beanInput = new DSmpEmpTst000Dto();
		
		/** 
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A001OutDto output = new SSMP1001A001OutDto();

		/**
		 * @BXMType IF
		 */
		if (input.getFeduEmpNo() == 9877) {
			logger.error("Pre-Deploy Test Exception for FeduEmpNo [9877].");
			throw new DefaultApplicationException("BXME30000", new Object[] {},
					new Object[] { "Pre-Deploy Test Exception." });
		}
		
		
		if (input.getFeduEmpNo() == 1111) {
			List<String> myList = new ArrayList<>();
			myList.add("Element 1");
			myList.add("Element 2");

			// 1. 음수 인덱스에 접근
			String element = myList.get(-1); // IndexOutOfBoundsException 발생
		}
		
		

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			beanInput.setFeduEmpNo(input.getFeduEmpNo());
		}
		
		/**
		 * @BXMType BeanCall
		 * @Desc Call bean single select method
		 */
		DSmpEmpTst000Dto beanOutput = mSmpEmpInfMng.getEmpInf(beanInput);

		/**
		 * @BXMType IF
		 * @Desc DTO mapping if bean out is not null
		 */
		if (beanOutput != null) {
			output.setFeduEmpNo(beanOutput.getFeduEmpNo());
			output.setFeduEmpNm(beanOutput.getFeduEmpNm());
			output.setFeduOccpNm(beanOutput.getFeduOccpNm());
			output.setFeduMngrEmpNo(beanOutput.getFeduMngrEmpNo());
			output.setFeduIpsaDt(beanOutput.getFeduIpsaDt());
			output.setFeduPayAmt(beanOutput.getFeduPayAmt());
			output.setFeduDeptNo(beanOutput.getFeduDeptNo());
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
		}

		// DefaultApplicationContext.getBxmTrxLog().setTrxTypeCd("3");		
		
		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}

	@BxmServiceOperation("ssmp1001a002")
	@Transactional(noRollbackFor = RuntimeException.class)
	@BxmCategory(logicalName = "Single insert", description = "Single insert for employee information")
	public SSMP1001A002OutDto ssmp1001a002(SSMP1001A002InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START ==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng = DefaultApplicationContext.getBean(mSmpEmpInfMng, MSmpEmpInfMng.class);

		
		if (input.getFeduEmpNo() == 9877) {
			logger.error("Pre-Deploy Test Exception for FeduEmpNo [9877].");
			throw new DefaultApplicationException("BXME30000", new Object[] {},
					new Object[] { "Pre-Deploy Test Exception." });
		}
		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A002OutDto output = new SSMP1001A002OutDto();

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto beanInput = new DSmpEmpTst000Dto();

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			// Generated by code generator [[
			beanInput.setFeduEmpNo(input.getFeduEmpNo());
			beanInput.setFeduEmpNm(input.getFeduEmpNm());
			beanInput.setFeduOccpNm(input.getFeduOccpNm());
			beanInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			beanInput.setFeduIpsaDt(input.getFeduIpsaDt());
			beanInput.setFeduPayAmt(input.getFeduPayAmt());
			beanInput.setFeduDeptNo(input.getFeduDeptNo());
			// Generated by code generator ]]
		}

		/**
		 * @BXMType BeanCall
		 * @Desc Call bean method to insert employee information
		 */
		int addCnt = mSmpEmpInfMng.addEmpInf(beanInput);	
	
	
		

		
		logger.debug("addEmpInf is completed");

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			output.setSuccYn(addCnt == 1 ? "Y" : "N");
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
		}

		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}

	@BxmServiceOperation("ssmp1001a003")
	@BxmCategory(logicalName = "Single update", description = "Single update for employee information")
	public SSMP1001A003OutDto ssmp1001a003(SSMP1001A003InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START ==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng = DefaultApplicationContext.getBean(mSmpEmpInfMng, MSmpEmpInfMng.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A003OutDto output = new SSMP1001A003OutDto();

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto beanInput = new DSmpEmpTst000Dto();

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			// Generated by code generator [[
			beanInput.setFeduEmpNo(input.getFeduEmpNo());
			beanInput.setFeduEmpNm(input.getFeduEmpNm());
			beanInput.setFeduOccpNm(input.getFeduOccpNm());
			beanInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			beanInput.setFeduIpsaDt(input.getFeduIpsaDt());
			beanInput.setFeduPayAmt(input.getFeduPayAmt());
			beanInput.setFeduDeptNo(input.getFeduDeptNo());
			// Generated by code generator ]]
		}

		/**
		 * @BXMType BeanCall
		 * Call bean method to update employee information
		 */
		int modifyCnt = mSmpEmpInfMng.modifyEmpInf(beanInput);

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			output.setSuccYn(modifyCnt == 1 ? "Y" : "N");
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
		}

		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}

	@BxmServiceOperation("ssmp1001a005")
	@BxmCategory(logicalName = "Single update", description = "Single update for employee information")
	public SSMP1001A005OutDto ssmp1001a005(SSMP1001A005InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START ==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng = DefaultApplicationContext.getBean(mSmpEmpInfMng, MSmpEmpInfMng.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A005OutDto modifyOutput = new SSMP1001A005OutDto();

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto beanInput = input.getSmpEmpTstRowData();

		/**
		 * @BXMType BeanCall
		 * Get lock for a row before update
		 */
		mSmpEmpInfMng.getEmpInfBeforeUpdate(beanInput);

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			// Generated by code generator [[
			beanInput.setFeduEmpNo(input.getFeduEmpNo());
			beanInput.setFeduEmpNm(input.getFeduEmpNm());
			beanInput.setFeduOccpNm(input.getFeduOccpNm());
			beanInput.setFeduMngrEmpNo(input.getFeduMngrEmpNo());
			beanInput.setFeduIpsaDt(input.getFeduIpsaDt());
			beanInput.setFeduPayAmt(input.getFeduPayAmt());
			beanInput.setFeduDeptNo(input.getFeduDeptNo());
			// Generated by code generator ]]
		}

		/**
		 * @BXMType BeanCall
		 * Call bean method to update employee information
		 */
		int modifyCnt = mSmpEmpInfMng.modifyEmpInfAfterSelect(beanInput);

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			modifyOutput.setSuccYn(modifyCnt == 1 ? "Y" : "N");
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
		}

		logger.debug("output = {}", modifyOutput);
		logger.debug("============== SERVICE END ==============");

		return modifyOutput;
	}

	@BxmServiceOperation("ssmp1001a004")
	@BxmCategory(logicalName = "Single delete", description = "Single delete for employee information")
	public SSMP1001A004OutDto ssmp1001a004(SSMP1001A004InDto input) throws DefaultApplicationException {

		logger.debug("============== SERVICE START ==============");
		logger.debug("input = {}", input);

		mSmpEmpInfMng = DefaultApplicationContext.getBean(mSmpEmpInfMng, MSmpEmpInfMng.class);

		/**
		 * @BXMType VariableDeclaration
		 */
		SSMP1001A004OutDto output = new SSMP1001A004OutDto();

		/**
		 * @BXMType VariableDeclaration
		 */
		DSmpEmpTst000Dto beanInput = new DSmpEmpTst000Dto();

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			beanInput.setFeduEmpNo(input.getFeduEmpNo());
		}

		/**
		 * @BXMType BeanCall
		 * Call bean method to delete employee information
		 */
		int removeCnt = mSmpEmpInfMng.removeEmpInf(beanInput);

		/**
		 * @BXMType LogicalArea
		 * @Desc DTO mapping
		 */
		{
			output.setSuccYn(removeCnt == 1 ? "Y" : "N");
		}

		/**
		 * @BXMType LogicalArea
		 * @Desc add message
		 */
		{
			DefaultApplicationContext.addMessage("BXMI60000", null, new Object[] {});
		}

		logger.debug("output = {}", output);
		logger.debug("============== SERVICE END ==============");

		return output;
	}

}
