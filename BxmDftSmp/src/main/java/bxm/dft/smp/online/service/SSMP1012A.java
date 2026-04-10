package bxm.dft.smp.online.service;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.online.service.dto.SSMP1012A001InDto;
import bxm.dft.smp.online.service.dto.SSMP1012A001OutDto;
import bxm.dft.smp.online.service.dto.SSMP1012A002InDto;
import bxm.dft.smp.online.service.dto.SSMP1012A002OutDto;
import bxm.dft.util.DefaultFileUtils;

/**
 * 파일 Uoload/Download 서비스
 *
 * @author sysadmin
*/
@BxmService("SSMP1012A")
@BxmCategory(logicalName="파일Upload/Download", description="파일 Uoload/Download 서비스", author="sysadmin")
public class SSMP1012A {
	private Logger logger= LoggerFactory.getLogger(getClass());
	
	@BxmServiceOperation("ssmp1012a001")
	@BxmCategory(logicalName="파일 업로드", description="Multi/part로 올라온 파일 업로드 처리", author="sysadmin")
	public SSMP1012A001OutDto ssmp1012a001(SSMP1012A001InDto input) {
		SSMP1012A001OutDto output = new SSMP1012A001OutDto();

		// Upload File Data
		logger.debug("UploadFileData's size : {}", input.getUploadFileFieldFileData().length);
		logger.debug("UploadFileData's fileName : {}", input.getUploadFileFieldFileName());
		logger.debug("UploadFileData's ContentType : {}", input.getUploadFileFieldContentType());
		
		// File이외의 Form Field
		logger.debug("TextField : {}", input.getTextField());

		if("Y".equals(input.getErrorYn())) {
			logger.error("File upload error");
			throw new DefaultApplicationException("BXME30000", new Object[] {});
		}
		
		// Write upload file to file system 
		String filePath = "smp/"+input.getUploadFileFieldFileName();
		DefaultFileUtils.writeFile(input.getUploadFileFieldFileData(), filePath);

		String testRst = new String(input.getUploadFileFieldFileData());
		output.setTestRst(testRst);
		
		logger.debug("Service Output : {}", output);	
		return output;
	}
	
	@BxmServiceOperation("ssmp1012a002")
	@BxmCategory(logicalName= "파일 다운로드 Service")
	public SSMP1012A002OutDto ssmp1012a002(SSMP1012A002InDto input) {
		
		SSMP1012A002OutDto output = new SSMP1012A002OutDto();

		String filePath = "smp/TEST_file.txt";  
		byte[] fileData = DefaultFileUtils.readFile(filePath);
		output.setBinaryData(fileData);
		
		if ("Y".equals(input.getErrorYn())) {
			logger.error("File upload error");
			throw new DefaultApplicationException("BXME30000", new Object[] {});
		}
		
		DefaultApplicationContext.setHttpResponseHeader("Content-Type", "text/plain");
		DefaultApplicationContext.setHttpResponseHeader("Content-Disposition", "attachment; filename=winter.txt");
		
		DefaultFileUtils.deleteFile(filePath);
 
		logger.debug("Service Output : {}", output);
		return output;
	}
}
