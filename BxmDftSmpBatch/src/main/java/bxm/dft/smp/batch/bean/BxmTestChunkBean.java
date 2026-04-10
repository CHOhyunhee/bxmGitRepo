package bxm.dft.smp.batch.bean;

import bxm.batch.dft.context.DefaultBatchApplicationContext;
import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.context.das.DasUtils;
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.batch.bean.dto.BxmTestChunkInputDto;
import bxm.dft.smp.batch.bean.dto.BxmTestChunkOutputDto;
import bxm.dft.smp.batch.dbio.DbxmJobInfo001;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.context.annotation.Scope;

/**
 * 
 *
 * @author sysadmin
 */
@Scope("step")
@BxmBean("BxmTestChunkBean")
@BxmCategory(logicalName="BxmTestChunk Bean", author="sysadmin")
public class BxmTestChunkBean implements ItemProcessor<BxmTestChunkInputDto, BxmTestChunkOutputDto>, ItemReader<BxmTestChunkInputDto>, ItemStream
{
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private DbxmJobInfo001 dbxmJobInfo001;
	private Iterator<BxmTestChunkOutputDto> iterator;
	
	/**
	 * 제공된 ExecutionContext의 스트림을 엽니다.
	 * 
	 * @param executionContext 현재 스텝의 ExecutionContext.
	 * @return 
	 */
	@Override
	@BxmCategory(logicalName="BxmTestChunk Bean", description="", author="sysadmin")
	public void open(ExecutionContext executionContext) throws ItemStreamException
	{
		
		dbxmJobInfo001 = DefaultApplicationContext.getBean(dbxmJobInfo001, DbxmJobInfo001.class);
		
		String oDate = DefaultBatchApplicationContext.getJobParameter("oDate");
		
		/**
		 * TODO : DB 조회 처리 로직을 작성하세요
		 */
		List<BxmTestChunkOutputDto> dbioOut= dbxmJobInfo001.selectList00();
		
		iterator = dbioOut.iterator();
	}
			
	
	/**
	 * 입력 데이터를 읽고 다음 데이터로 이동합니다.
	 *
	 * @return 처리할 항목 반환
	 */
	@Override
	@BxmCategory(logicalName="BxmTestChunk Bean", description="", author="sysadmin")
	public BxmTestChunkInputDto read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		BxmTestChunkInputDto in = null;
		
		/**
		 * TODO : 파일 Data를 읽어 ItemProcessor에 전달할 업무로직을 작성하세요
		 */
		if(iterator.hasNext())
		{
			in = new BxmTestChunkInputDto();
			
			BxmTestChunkOutputDto input = iterator.next();
					
			in.setDomainId(input.getDomainId()); // 도메인ID
			in.setJobId(input.getJobId()); // 배치작업ID
			in.setJobNm(input.getJobNm()); // 배치작업명
			in.setJobTypeCd(input.getJobTypeCd()); // 배치작업타입코드
			in.setBxmAppId(input.getBxmAppId()); // BXM어플리케이션ID
			in.setUseYn(input.getUseYn()); // 사용여부
			in.setSysLogLvNm(input.getSysLogLvNm()); // 시스템로그레벨명
			in.setBizLogLvNm(input.getBizLogLvNm()); // 업무로그레벨명
			in.setDbLogLvNm(input.getDbLogLvNm()); // DB로그레벨명
			in.setCommitCfgList(input.getCommitCfgList()); // 커밋설정목록
			in.setProcessDupExecYn(input.getProcessDupExecYn()); // 프로세스중복실행여부
			in.setParamDupExecYn(input.getParamDupExecYn()); // 파라미터중복실행여부
			in.setStdDtDscd(input.getStdDtDscd()); // 기준일자구분코드
			in.setDtBefAftDscd(input.getDtBefAftDscd()); // 일자전후구분코드
			in.setDtBefAftDayCnt(input.getDtBefAftDayCnt()); // 일자전후일수
			in.setStdDtParamUseYn(input.getStdDtParamUseYn()); // 기준일자파라미터사용여부
			in.setJobUseStartDt(input.getJobUseStartDt()); // 배치작업사용시작일자
			in.setJobUseEndDt(input.getJobUseEndDt()); // 배치작업사용종료일자
			in.setDsAllwList(input.getDsAllwList()); // 데이타소스허용목록
			in.setDefaultCommitIntvl(input.getDefaultCommitIntvl()); // 디폴트커밋인터벌
			in.setRegUserId(input.getRegUserId()); // 등록사용자ID
			in.setRegOccurDttm(input.getRegOccurDttm()); // 등록발생일시
			in.setModifyUserId(input.getModifyUserId()); // 변경사용자ID
			in.setModifyOccurDttm(input.getModifyOccurDttm()); // 변경발생일시
			
			
		}
		
		return in;
	}
	
	/**
	 * Reader에서 읽은 데이터를 원하는 타입으로 변환하거나 가공하여 Writer에 넘겨줍니다.
	 * 
	 * @param in ItemReader에서 받을 데이터 타입
	 * @return ItemWriter에 보낼 데이터 타입
	 */
	@Override
	@BxmCategory(logicalName="BxmTestChunk Bean", description="", author="sysadmin")
	public BxmTestChunkOutputDto process(BxmTestChunkInputDto in) throws Exception
	{
		BxmTestChunkOutputDto out = new BxmTestChunkOutputDto();
		
	logger.debug("out is {}", out);
		out.setDomainId(in.getDomainId()); // 도메인ID
		out.setJobId(in.getJobId()); // 배치작업ID
		out.setJobNm(in.getJobNm()); // 배치작업명
		out.setJobTypeCd(in.getJobTypeCd()); // 배치작업타입코드
		out.setBxmAppId(in.getBxmAppId()); // BXM어플리케이션ID
		out.setUseYn(in.getUseYn()); // 사용여부
		out.setSysLogLvNm(in.getSysLogLvNm()); // 시스템로그레벨명
		out.setBizLogLvNm(in.getBizLogLvNm()); // 업무로그레벨명
		out.setDbLogLvNm(in.getDbLogLvNm()); // DB로그레벨명
		out.setCommitCfgList(in.getCommitCfgList()); // 커밋설정목록
		out.setProcessDupExecYn(in.getProcessDupExecYn()); // 프로세스중복실행여부
		out.setParamDupExecYn(in.getParamDupExecYn()); // 파라미터중복실행여부
		out.setStdDtDscd(in.getStdDtDscd()); // 기준일자구분코드
		out.setDtBefAftDscd(in.getDtBefAftDscd()); // 일자전후구분코드
		out.setDtBefAftDayCnt(in.getDtBefAftDayCnt()); // 일자전후일수
		out.setStdDtParamUseYn(in.getStdDtParamUseYn()); // 기준일자파라미터사용여부
		out.setJobUseStartDt(in.getJobUseStartDt()); // 배치작업사용시작일자
		out.setJobUseEndDt(in.getJobUseEndDt()); // 배치작업사용종료일자
		out.setDsAllwList(in.getDsAllwList()); // 데이타소스허용목록
		out.setDefaultCommitIntvl(in.getDefaultCommitIntvl()); // 디폴트커밋인터벌
		out.setRegUserId(in.getRegUserId()); // 등록사용자ID
		out.setRegOccurDttm(in.getRegOccurDttm()); // 등록발생일시
		out.setModifyUserId(in.getModifyUserId()); // 변경사용자ID
		out.setModifyOccurDttm(in.getModifyOccurDttm()); // 변경발생일시
		
		
		return out;
	}
	
	/**
	 * chunk size 만큼의 1 cycle 완료시마다 실행됩니다.
	 * 
	 * @param executionContext 업데이트할 ExecutionContext
	 * @return 
	 */
	@Override
	@BxmCategory(logicalName="BxmTestChunk Bean", description="", author="sysadmin")
	public void update(ExecutionContext executionContext) throws ItemStreamException 
	{
	}
	
	/**
	 * 리소스 해제 또는 초기화작업 해제 등 마무리 작업을 진행합니다.
	 *
	 * @return 
	 */
	@Override
	@BxmCategory(logicalName="BxmTestChunk Bean", description="", author="sysadmin")
	public void close() throws ItemStreamException 
	{
		DasUtils.disconnectDasExecutor(iterator);
	}
}
