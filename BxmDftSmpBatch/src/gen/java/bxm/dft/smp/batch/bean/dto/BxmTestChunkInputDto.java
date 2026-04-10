/**
 * BXM V5 - IO Java Source Generator
 */

package bxm.dft.smp.batch.bean.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"domainId", "jobId", "jobNm", "jobTypeCd", "bxmAppId", "useYn", "sysLogLvNm", "bizLogLvNm", "dbLogLvNm", "commitCfgList", "processDupExecYn", "paramDupExecYn", "stdDtDscd", "dtBefAftDscd", "dtBefAftDayCnt"
	, "stdDtParamUseYn", "jobUseStartDt", "jobUseEndDt", "dsAllwList", "defaultCommitIntvl", "regUserId", "regOccurDttm", "modifyUserId", "modifyOccurDttm"
}, name="BxmTestChunkInputDto")
@XmlRootElement(name="BxmTestChunkInputDto")
@BxmCategory(logicalName="BxmTestChunk 입력 IO", description="") 
public class BxmTestChunkInputDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 410500199L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 도메인ID
	 */
	@XmlElement
	@JsonProperty("domainId")
	@BxmOmm_Field(length=14, decimal=0, description="도메인ID", align="left", fill="")
	private String domainId= null;
	
	
	/**
	 * 배치작업ID
	 */
	@XmlElement
	@JsonProperty("jobId")
	@BxmOmm_Field(length=100, decimal=0, description="배치작업ID", align="left", fill="")
	private String jobId= null;
	
	
	/**
	 * 배치작업명
	 */
	@XmlElement
	@JsonProperty("jobNm")
	@BxmOmm_Field(length=256, decimal=0, description="배치작업명", align="left", fill="")
	private String jobNm= null;
	
	
	/**
	 * 배치작업타입코드
	 */
	@XmlElement
	@JsonProperty("jobTypeCd")
	@BxmOmm_Field(length=1, decimal=0, description="배치작업타입코드", align="left", fill="")
	private String jobTypeCd= null;
	
	
	/**
	 * BXM어플리케이션ID
	 */
	@XmlElement
	@JsonProperty("bxmAppId")
	@BxmOmm_Field(length=40, decimal=0, description="BXM어플리케이션ID", align="left", fill="")
	private String bxmAppId= null;
	
	
	/**
	 * 사용여부
	 */
	@XmlElement
	@JsonProperty("useYn")
	@BxmOmm_Field(length=1, decimal=0, description="사용여부", align="left", fill="")
	private String useYn= null;
	
	
	/**
	 * 시스템로그레벨명
	 */
	@XmlElement
	@JsonProperty("sysLogLvNm")
	@BxmOmm_Field(length=10, decimal=0, description="시스템로그레벨명", align="left", fill="")
	private String sysLogLvNm= null;
	
	
	/**
	 * 업무로그레벨명
	 */
	@XmlElement
	@JsonProperty("bizLogLvNm")
	@BxmOmm_Field(length=10, decimal=0, description="업무로그레벨명", align="left", fill="")
	private String bizLogLvNm= null;
	
	
	/**
	 * DB로그레벨명
	 */
	@XmlElement
	@JsonProperty("dbLogLvNm")
	@BxmOmm_Field(length=10, decimal=0, description="DB로그레벨명", align="left", fill="")
	private String dbLogLvNm= null;
	
	
	/**
	 * 커밋설정목록
	 */
	@XmlElement
	@JsonProperty("commitCfgList")
	@BxmOmm_Field(length=1024, decimal=0, description="커밋설정목록", align="left", fill="")
	private String commitCfgList= null;
	
	
	/**
	 * 프로세스중복실행여부
	 */
	@XmlElement
	@JsonProperty("processDupExecYn")
	@BxmOmm_Field(length=1, decimal=0, description="프로세스중복실행여부", align="left", fill="")
	private String processDupExecYn= null;
	
	
	/**
	 * 파라미터중복실행여부
	 */
	@XmlElement
	@JsonProperty("paramDupExecYn")
	@BxmOmm_Field(length=1, decimal=0, description="파라미터중복실행여부", align="left", fill="")
	private String paramDupExecYn= null;
	
	
	/**
	 * 기준일자구분코드
	 */
	@XmlElement
	@JsonProperty("stdDtDscd")
	@BxmOmm_Field(length=1, decimal=0, description="기준일자구분코드", align="left", fill="")
	private String stdDtDscd= null;
	
	
	/**
	 * 일자전후구분코드
	 */
	@XmlElement
	@JsonProperty("dtBefAftDscd")
	@BxmOmm_Field(length=1, decimal=0, description="일자전후구분코드", align="left", fill="")
	private String dtBefAftDscd= null;
	
	
	/**
	 * 일자전후일수
	 */
	@XmlElement
	@JsonProperty("dtBefAftDayCnt")
	@BxmOmm_Field(length=2, decimal=0, description="일자전후일수", align="right", fill="")
	private Integer dtBefAftDayCnt= 0;
	
	
	/**
	 * 기준일자파라미터사용여부
	 */
	@XmlElement
	@JsonProperty("stdDtParamUseYn")
	@BxmOmm_Field(length=1, decimal=0, description="기준일자파라미터사용여부", align="left", fill="")
	private String stdDtParamUseYn= null;
	
	
	/**
	 * 배치작업사용시작일자
	 */
	@XmlElement
	@JsonProperty("jobUseStartDt")
	@BxmOmm_Field(length=8, decimal=0, description="배치작업사용시작일자", align="left", fill="")
	private String jobUseStartDt= null;
	
	
	/**
	 * 배치작업사용종료일자
	 */
	@XmlElement
	@JsonProperty("jobUseEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="배치작업사용종료일자", align="left", fill="")
	private String jobUseEndDt= null;
	
	
	/**
	 * 데이타소스허용목록
	 */
	@XmlElement
	@JsonProperty("dsAllwList")
	@BxmOmm_Field(length=200, decimal=0, description="데이타소스허용목록", align="left", fill="")
	private String dsAllwList= null;
	
	
	/**
	 * 디폴트커밋인터벌
	 */
	@XmlElement
	@JsonProperty("defaultCommitIntvl")
	@BxmOmm_Field(length=5, decimal=0, description="디폴트커밋인터벌", align="right", fill="")
	private Integer defaultCommitIntvl= 0;
	
	
	/**
	 * 등록사용자ID
	 */
	@XmlElement
	@JsonProperty("regUserId")
	@BxmOmm_Field(length=50, decimal=0, description="등록사용자ID", align="left", fill="")
	private String regUserId= null;
	
	
	/**
	 * 등록발생일시
	 */
	@XmlElement
	@JsonProperty("regOccurDttm")
	@BxmOmm_Field(length=23, decimal=0, description="등록발생일시", align="left", fill="")
	private String regOccurDttm= null;
	
	
	/**
	 * 변경사용자ID
	 */
	@XmlElement
	@JsonProperty("modifyUserId")
	@BxmOmm_Field(length=50, decimal=0, description="변경사용자ID", align="left", fill="")
	private String modifyUserId= null;
	
	
	/**
	 * 변경발생일시
	 */
	@XmlElement
	@JsonProperty("modifyOccurDttm")
	@BxmOmm_Field(length=23, decimal=0, description="변경발생일시", align="left", fill="")
	private String modifyOccurDttm= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_domainId= false;
	protected final boolean isSet_domainId(){
		return this.isSet_domainId;
	}
	private void setIsSet_domainId(boolean value){
		this.isSet_domainId= value;
	}
	/**
	 * 도메인ID
	 */
	@XmlTransient
	public String getDomainId(){
		return this.domainId;
	}
	
	/**
	 * 도메인ID
	 * 
	 * @param domainId 도메인ID
	 */
	public void setDomainId(String domainId){
		this.domainId= domainId;
		this.setIsSet_domainId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jobId= false;
	protected final boolean isSet_jobId(){
		return this.isSet_jobId;
	}
	private void setIsSet_jobId(boolean value){
		this.isSet_jobId= value;
	}
	/**
	 * 배치작업ID
	 */
	@XmlTransient
	public String getJobId(){
		return this.jobId;
	}
	
	/**
	 * 배치작업ID
	 * 
	 * @param jobId 배치작업ID
	 */
	public void setJobId(String jobId){
		this.jobId= jobId;
		this.setIsSet_jobId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jobNm= false;
	protected final boolean isSet_jobNm(){
		return this.isSet_jobNm;
	}
	private void setIsSet_jobNm(boolean value){
		this.isSet_jobNm= value;
	}
	/**
	 * 배치작업명
	 */
	@XmlTransient
	public String getJobNm(){
		return this.jobNm;
	}
	
	/**
	 * 배치작업명
	 * 
	 * @param jobNm 배치작업명
	 */
	public void setJobNm(String jobNm){
		this.jobNm= jobNm;
		this.setIsSet_jobNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jobTypeCd= false;
	protected final boolean isSet_jobTypeCd(){
		return this.isSet_jobTypeCd;
	}
	private void setIsSet_jobTypeCd(boolean value){
		this.isSet_jobTypeCd= value;
	}
	/**
	 * 배치작업타입코드
	 */
	@XmlTransient
	public String getJobTypeCd(){
		return this.jobTypeCd;
	}
	
	/**
	 * 배치작업타입코드
	 * 
	 * @param jobTypeCd 배치작업타입코드
	 */
	public void setJobTypeCd(String jobTypeCd){
		this.jobTypeCd= jobTypeCd;
		this.setIsSet_jobTypeCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bxmAppId= false;
	protected final boolean isSet_bxmAppId(){
		return this.isSet_bxmAppId;
	}
	private void setIsSet_bxmAppId(boolean value){
		this.isSet_bxmAppId= value;
	}
	/**
	 * BXM어플리케이션ID
	 */
	@XmlTransient
	public String getBxmAppId(){
		return this.bxmAppId;
	}
	
	/**
	 * BXM어플리케이션ID
	 * 
	 * @param bxmAppId BXM어플리케이션ID
	 */
	public void setBxmAppId(String bxmAppId){
		this.bxmAppId= bxmAppId;
		this.setIsSet_bxmAppId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_useYn= false;
	protected final boolean isSet_useYn(){
		return this.isSet_useYn;
	}
	private void setIsSet_useYn(boolean value){
		this.isSet_useYn= value;
	}
	/**
	 * 사용여부
	 */
	@XmlTransient
	public String getUseYn(){
		return this.useYn;
	}
	
	/**
	 * 사용여부
	 * 
	 * @param useYn 사용여부
	 */
	public void setUseYn(String useYn){
		this.useYn= useYn;
		this.setIsSet_useYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sysLogLvNm= false;
	protected final boolean isSet_sysLogLvNm(){
		return this.isSet_sysLogLvNm;
	}
	private void setIsSet_sysLogLvNm(boolean value){
		this.isSet_sysLogLvNm= value;
	}
	/**
	 * 시스템로그레벨명
	 */
	@XmlTransient
	public String getSysLogLvNm(){
		return this.sysLogLvNm;
	}
	
	/**
	 * 시스템로그레벨명
	 * 
	 * @param sysLogLvNm 시스템로그레벨명
	 */
	public void setSysLogLvNm(String sysLogLvNm){
		this.sysLogLvNm= sysLogLvNm;
		this.setIsSet_sysLogLvNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bizLogLvNm= false;
	protected final boolean isSet_bizLogLvNm(){
		return this.isSet_bizLogLvNm;
	}
	private void setIsSet_bizLogLvNm(boolean value){
		this.isSet_bizLogLvNm= value;
	}
	/**
	 * 업무로그레벨명
	 */
	@XmlTransient
	public String getBizLogLvNm(){
		return this.bizLogLvNm;
	}
	
	/**
	 * 업무로그레벨명
	 * 
	 * @param bizLogLvNm 업무로그레벨명
	 */
	public void setBizLogLvNm(String bizLogLvNm){
		this.bizLogLvNm= bizLogLvNm;
		this.setIsSet_bizLogLvNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dbLogLvNm= false;
	protected final boolean isSet_dbLogLvNm(){
		return this.isSet_dbLogLvNm;
	}
	private void setIsSet_dbLogLvNm(boolean value){
		this.isSet_dbLogLvNm= value;
	}
	/**
	 * DB로그레벨명
	 */
	@XmlTransient
	public String getDbLogLvNm(){
		return this.dbLogLvNm;
	}
	
	/**
	 * DB로그레벨명
	 * 
	 * @param dbLogLvNm DB로그레벨명
	 */
	public void setDbLogLvNm(String dbLogLvNm){
		this.dbLogLvNm= dbLogLvNm;
		this.setIsSet_dbLogLvNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_commitCfgList= false;
	protected final boolean isSet_commitCfgList(){
		return this.isSet_commitCfgList;
	}
	private void setIsSet_commitCfgList(boolean value){
		this.isSet_commitCfgList= value;
	}
	/**
	 * 커밋설정목록
	 */
	@XmlTransient
	public String getCommitCfgList(){
		return this.commitCfgList;
	}
	
	/**
	 * 커밋설정목록
	 * 
	 * @param commitCfgList 커밋설정목록
	 */
	public void setCommitCfgList(String commitCfgList){
		this.commitCfgList= commitCfgList;
		this.setIsSet_commitCfgList(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_processDupExecYn= false;
	protected final boolean isSet_processDupExecYn(){
		return this.isSet_processDupExecYn;
	}
	private void setIsSet_processDupExecYn(boolean value){
		this.isSet_processDupExecYn= value;
	}
	/**
	 * 프로세스중복실행여부
	 */
	@XmlTransient
	public String getProcessDupExecYn(){
		return this.processDupExecYn;
	}
	
	/**
	 * 프로세스중복실행여부
	 * 
	 * @param processDupExecYn 프로세스중복실행여부
	 */
	public void setProcessDupExecYn(String processDupExecYn){
		this.processDupExecYn= processDupExecYn;
		this.setIsSet_processDupExecYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_paramDupExecYn= false;
	protected final boolean isSet_paramDupExecYn(){
		return this.isSet_paramDupExecYn;
	}
	private void setIsSet_paramDupExecYn(boolean value){
		this.isSet_paramDupExecYn= value;
	}
	/**
	 * 파라미터중복실행여부
	 */
	@XmlTransient
	public String getParamDupExecYn(){
		return this.paramDupExecYn;
	}
	
	/**
	 * 파라미터중복실행여부
	 * 
	 * @param paramDupExecYn 파라미터중복실행여부
	 */
	public void setParamDupExecYn(String paramDupExecYn){
		this.paramDupExecYn= paramDupExecYn;
		this.setIsSet_paramDupExecYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_stdDtDscd= false;
	protected final boolean isSet_stdDtDscd(){
		return this.isSet_stdDtDscd;
	}
	private void setIsSet_stdDtDscd(boolean value){
		this.isSet_stdDtDscd= value;
	}
	/**
	 * 기준일자구분코드
	 */
	@XmlTransient
	public String getStdDtDscd(){
		return this.stdDtDscd;
	}
	
	/**
	 * 기준일자구분코드
	 * 
	 * @param stdDtDscd 기준일자구분코드
	 */
	public void setStdDtDscd(String stdDtDscd){
		this.stdDtDscd= stdDtDscd;
		this.setIsSet_stdDtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dtBefAftDscd= false;
	protected final boolean isSet_dtBefAftDscd(){
		return this.isSet_dtBefAftDscd;
	}
	private void setIsSet_dtBefAftDscd(boolean value){
		this.isSet_dtBefAftDscd= value;
	}
	/**
	 * 일자전후구분코드
	 */
	@XmlTransient
	public String getDtBefAftDscd(){
		return this.dtBefAftDscd;
	}
	
	/**
	 * 일자전후구분코드
	 * 
	 * @param dtBefAftDscd 일자전후구분코드
	 */
	public void setDtBefAftDscd(String dtBefAftDscd){
		this.dtBefAftDscd= dtBefAftDscd;
		this.setIsSet_dtBefAftDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dtBefAftDayCnt= false;
	protected final boolean isSet_dtBefAftDayCnt(){
		return this.isSet_dtBefAftDayCnt;
	}
	private void setIsSet_dtBefAftDayCnt(boolean value){
		this.isSet_dtBefAftDayCnt= value;
	}
	/**
	 * 일자전후일수
	 */
	@XmlTransient
	public Integer getDtBefAftDayCnt(){
		return this.dtBefAftDayCnt;
	}
	
	/**
	 * 일자전후일수
	 * 
	 * @param dtBefAftDayCnt 일자전후일수
	 */
	public void setDtBefAftDayCnt(Integer dtBefAftDayCnt){
		this.dtBefAftDayCnt= dtBefAftDayCnt;
		this.setIsSet_dtBefAftDayCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_stdDtParamUseYn= false;
	protected final boolean isSet_stdDtParamUseYn(){
		return this.isSet_stdDtParamUseYn;
	}
	private void setIsSet_stdDtParamUseYn(boolean value){
		this.isSet_stdDtParamUseYn= value;
	}
	/**
	 * 기준일자파라미터사용여부
	 */
	@XmlTransient
	public String getStdDtParamUseYn(){
		return this.stdDtParamUseYn;
	}
	
	/**
	 * 기준일자파라미터사용여부
	 * 
	 * @param stdDtParamUseYn 기준일자파라미터사용여부
	 */
	public void setStdDtParamUseYn(String stdDtParamUseYn){
		this.stdDtParamUseYn= stdDtParamUseYn;
		this.setIsSet_stdDtParamUseYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jobUseStartDt= false;
	protected final boolean isSet_jobUseStartDt(){
		return this.isSet_jobUseStartDt;
	}
	private void setIsSet_jobUseStartDt(boolean value){
		this.isSet_jobUseStartDt= value;
	}
	/**
	 * 배치작업사용시작일자
	 */
	@XmlTransient
	public String getJobUseStartDt(){
		return this.jobUseStartDt;
	}
	
	/**
	 * 배치작업사용시작일자
	 * 
	 * @param jobUseStartDt 배치작업사용시작일자
	 */
	public void setJobUseStartDt(String jobUseStartDt){
		this.jobUseStartDt= jobUseStartDt;
		this.setIsSet_jobUseStartDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_jobUseEndDt= false;
	protected final boolean isSet_jobUseEndDt(){
		return this.isSet_jobUseEndDt;
	}
	private void setIsSet_jobUseEndDt(boolean value){
		this.isSet_jobUseEndDt= value;
	}
	/**
	 * 배치작업사용종료일자
	 */
	@XmlTransient
	public String getJobUseEndDt(){
		return this.jobUseEndDt;
	}
	
	/**
	 * 배치작업사용종료일자
	 * 
	 * @param jobUseEndDt 배치작업사용종료일자
	 */
	public void setJobUseEndDt(String jobUseEndDt){
		this.jobUseEndDt= jobUseEndDt;
		this.setIsSet_jobUseEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dsAllwList= false;
	protected final boolean isSet_dsAllwList(){
		return this.isSet_dsAllwList;
	}
	private void setIsSet_dsAllwList(boolean value){
		this.isSet_dsAllwList= value;
	}
	/**
	 * 데이타소스허용목록
	 */
	@XmlTransient
	public String getDsAllwList(){
		return this.dsAllwList;
	}
	
	/**
	 * 데이타소스허용목록
	 * 
	 * @param dsAllwList 데이타소스허용목록
	 */
	public void setDsAllwList(String dsAllwList){
		this.dsAllwList= dsAllwList;
		this.setIsSet_dsAllwList(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_defaultCommitIntvl= false;
	protected final boolean isSet_defaultCommitIntvl(){
		return this.isSet_defaultCommitIntvl;
	}
	private void setIsSet_defaultCommitIntvl(boolean value){
		this.isSet_defaultCommitIntvl= value;
	}
	/**
	 * 디폴트커밋인터벌
	 */
	@XmlTransient
	public Integer getDefaultCommitIntvl(){
		return this.defaultCommitIntvl;
	}
	
	/**
	 * 디폴트커밋인터벌
	 * 
	 * @param defaultCommitIntvl 디폴트커밋인터벌
	 */
	public void setDefaultCommitIntvl(Integer defaultCommitIntvl){
		this.defaultCommitIntvl= defaultCommitIntvl;
		this.setIsSet_defaultCommitIntvl(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_regUserId= false;
	protected final boolean isSet_regUserId(){
		return this.isSet_regUserId;
	}
	private void setIsSet_regUserId(boolean value){
		this.isSet_regUserId= value;
	}
	/**
	 * 등록사용자ID
	 */
	@XmlTransient
	public String getRegUserId(){
		return this.regUserId;
	}
	
	/**
	 * 등록사용자ID
	 * 
	 * @param regUserId 등록사용자ID
	 */
	public void setRegUserId(String regUserId){
		this.regUserId= regUserId;
		this.setIsSet_regUserId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_regOccurDttm= false;
	protected final boolean isSet_regOccurDttm(){
		return this.isSet_regOccurDttm;
	}
	private void setIsSet_regOccurDttm(boolean value){
		this.isSet_regOccurDttm= value;
	}
	/**
	 * 등록발생일시
	 */
	@XmlTransient
	public String getRegOccurDttm(){
		return this.regOccurDttm;
	}
	
	/**
	 * 등록발생일시
	 * 
	 * @param regOccurDttm 등록발생일시
	 */
	public void setRegOccurDttm(String regOccurDttm){
		this.regOccurDttm= regOccurDttm;
		this.setIsSet_regOccurDttm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_modifyUserId= false;
	protected final boolean isSet_modifyUserId(){
		return this.isSet_modifyUserId;
	}
	private void setIsSet_modifyUserId(boolean value){
		this.isSet_modifyUserId= value;
	}
	/**
	 * 변경사용자ID
	 */
	@XmlTransient
	public String getModifyUserId(){
		return this.modifyUserId;
	}
	
	/**
	 * 변경사용자ID
	 * 
	 * @param modifyUserId 변경사용자ID
	 */
	public void setModifyUserId(String modifyUserId){
		this.modifyUserId= modifyUserId;
		this.setIsSet_modifyUserId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_modifyOccurDttm= false;
	protected final boolean isSet_modifyOccurDttm(){
		return this.isSet_modifyOccurDttm;
	}
	private void setIsSet_modifyOccurDttm(boolean value){
		this.isSet_modifyOccurDttm= value;
	}
	/**
	 * 변경발생일시
	 */
	@XmlTransient
	public String getModifyOccurDttm(){
		return this.modifyOccurDttm;
	}
	
	/**
	 * 변경발생일시
	 * 
	 * @param modifyOccurDttm 변경발생일시
	 */
	public void setModifyOccurDttm(String modifyOccurDttm){
		this.modifyOccurDttm= modifyOccurDttm;
		this.setIsSet_modifyOccurDttm(true);
	}
	
	@Override
	public BxmTestChunkInputDto clone(){
		try{
			BxmTestChunkInputDto object= (BxmTestChunkInputDto)super.clone();
			return object;
		}
		catch(CloneNotSupportedException e){
			throw new CloneFailedException(e);
		}
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result= 1;
		
		result= prime * result + ((this.domainId==null)?0:this.domainId.hashCode());
		result= prime * result + ((this.jobId==null)?0:this.jobId.hashCode());
		result= prime * result + ((this.jobNm==null)?0:this.jobNm.hashCode());
		result= prime * result + ((this.jobTypeCd==null)?0:this.jobTypeCd.hashCode());
		result= prime * result + ((this.bxmAppId==null)?0:this.bxmAppId.hashCode());
		result= prime * result + ((this.useYn==null)?0:this.useYn.hashCode());
		result= prime * result + ((this.sysLogLvNm==null)?0:this.sysLogLvNm.hashCode());
		result= prime * result + ((this.bizLogLvNm==null)?0:this.bizLogLvNm.hashCode());
		result= prime * result + ((this.dbLogLvNm==null)?0:this.dbLogLvNm.hashCode());
		result= prime * result + ((this.commitCfgList==null)?0:this.commitCfgList.hashCode());
		result= prime * result + ((this.processDupExecYn==null)?0:this.processDupExecYn.hashCode());
		result= prime * result + ((this.paramDupExecYn==null)?0:this.paramDupExecYn.hashCode());
		result= prime * result + ((this.stdDtDscd==null)?0:this.stdDtDscd.hashCode());
		result= prime * result + ((this.dtBefAftDscd==null)?0:this.dtBefAftDscd.hashCode());
		result= prime * result + ((this.dtBefAftDayCnt==null)?0:this.dtBefAftDayCnt.hashCode());
		result= prime * result + ((this.stdDtParamUseYn==null)?0:this.stdDtParamUseYn.hashCode());
		result= prime * result + ((this.jobUseStartDt==null)?0:this.jobUseStartDt.hashCode());
		result= prime * result + ((this.jobUseEndDt==null)?0:this.jobUseEndDt.hashCode());
		result= prime * result + ((this.dsAllwList==null)?0:this.dsAllwList.hashCode());
		result= prime * result + ((this.defaultCommitIntvl==null)?0:this.defaultCommitIntvl.hashCode());
		result= prime * result + ((this.regUserId==null)?0:this.regUserId.hashCode());
		result= prime * result + ((this.regOccurDttm==null)?0:this.regOccurDttm.hashCode());
		result= prime * result + ((this.modifyUserId==null)?0:this.modifyUserId.hashCode());
		result= prime * result + ((this.modifyOccurDttm==null)?0:this.modifyOccurDttm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final BxmTestChunkInputDto other= (BxmTestChunkInputDto)obj;
		{
			Object _domainId= getDomainId();
			Object __domainId= other.getDomainId();
			if ( _domainId== null ) { if ( __domainId!= null ) return false; }
			else if ( !_domainId.equals(__domainId) ) return false;
		}
		{
			Object _jobId= getJobId();
			Object __jobId= other.getJobId();
			if ( _jobId== null ) { if ( __jobId!= null ) return false; }
			else if ( !_jobId.equals(__jobId) ) return false;
		}
		{
			Object _jobNm= getJobNm();
			Object __jobNm= other.getJobNm();
			if ( _jobNm== null ) { if ( __jobNm!= null ) return false; }
			else if ( !_jobNm.equals(__jobNm) ) return false;
		}
		{
			Object _jobTypeCd= getJobTypeCd();
			Object __jobTypeCd= other.getJobTypeCd();
			if ( _jobTypeCd== null ) { if ( __jobTypeCd!= null ) return false; }
			else if ( !_jobTypeCd.equals(__jobTypeCd) ) return false;
		}
		{
			Object _bxmAppId= getBxmAppId();
			Object __bxmAppId= other.getBxmAppId();
			if ( _bxmAppId== null ) { if ( __bxmAppId!= null ) return false; }
			else if ( !_bxmAppId.equals(__bxmAppId) ) return false;
		}
		{
			Object _useYn= getUseYn();
			Object __useYn= other.getUseYn();
			if ( _useYn== null ) { if ( __useYn!= null ) return false; }
			else if ( !_useYn.equals(__useYn) ) return false;
		}
		{
			Object _sysLogLvNm= getSysLogLvNm();
			Object __sysLogLvNm= other.getSysLogLvNm();
			if ( _sysLogLvNm== null ) { if ( __sysLogLvNm!= null ) return false; }
			else if ( !_sysLogLvNm.equals(__sysLogLvNm) ) return false;
		}
		{
			Object _bizLogLvNm= getBizLogLvNm();
			Object __bizLogLvNm= other.getBizLogLvNm();
			if ( _bizLogLvNm== null ) { if ( __bizLogLvNm!= null ) return false; }
			else if ( !_bizLogLvNm.equals(__bizLogLvNm) ) return false;
		}
		{
			Object _dbLogLvNm= getDbLogLvNm();
			Object __dbLogLvNm= other.getDbLogLvNm();
			if ( _dbLogLvNm== null ) { if ( __dbLogLvNm!= null ) return false; }
			else if ( !_dbLogLvNm.equals(__dbLogLvNm) ) return false;
		}
		{
			Object _commitCfgList= getCommitCfgList();
			Object __commitCfgList= other.getCommitCfgList();
			if ( _commitCfgList== null ) { if ( __commitCfgList!= null ) return false; }
			else if ( !_commitCfgList.equals(__commitCfgList) ) return false;
		}
		{
			Object _processDupExecYn= getProcessDupExecYn();
			Object __processDupExecYn= other.getProcessDupExecYn();
			if ( _processDupExecYn== null ) { if ( __processDupExecYn!= null ) return false; }
			else if ( !_processDupExecYn.equals(__processDupExecYn) ) return false;
		}
		{
			Object _paramDupExecYn= getParamDupExecYn();
			Object __paramDupExecYn= other.getParamDupExecYn();
			if ( _paramDupExecYn== null ) { if ( __paramDupExecYn!= null ) return false; }
			else if ( !_paramDupExecYn.equals(__paramDupExecYn) ) return false;
		}
		{
			Object _stdDtDscd= getStdDtDscd();
			Object __stdDtDscd= other.getStdDtDscd();
			if ( _stdDtDscd== null ) { if ( __stdDtDscd!= null ) return false; }
			else if ( !_stdDtDscd.equals(__stdDtDscd) ) return false;
		}
		{
			Object _dtBefAftDscd= getDtBefAftDscd();
			Object __dtBefAftDscd= other.getDtBefAftDscd();
			if ( _dtBefAftDscd== null ) { if ( __dtBefAftDscd!= null ) return false; }
			else if ( !_dtBefAftDscd.equals(__dtBefAftDscd) ) return false;
		}
		{
			Object _dtBefAftDayCnt= getDtBefAftDayCnt();
			Object __dtBefAftDayCnt= other.getDtBefAftDayCnt();
			if ( _dtBefAftDayCnt== null ) { if ( __dtBefAftDayCnt!= null ) return false; }
			else if ( !_dtBefAftDayCnt.equals(__dtBefAftDayCnt) ) return false;
		}
		{
			Object _stdDtParamUseYn= getStdDtParamUseYn();
			Object __stdDtParamUseYn= other.getStdDtParamUseYn();
			if ( _stdDtParamUseYn== null ) { if ( __stdDtParamUseYn!= null ) return false; }
			else if ( !_stdDtParamUseYn.equals(__stdDtParamUseYn) ) return false;
		}
		{
			Object _jobUseStartDt= getJobUseStartDt();
			Object __jobUseStartDt= other.getJobUseStartDt();
			if ( _jobUseStartDt== null ) { if ( __jobUseStartDt!= null ) return false; }
			else if ( !_jobUseStartDt.equals(__jobUseStartDt) ) return false;
		}
		{
			Object _jobUseEndDt= getJobUseEndDt();
			Object __jobUseEndDt= other.getJobUseEndDt();
			if ( _jobUseEndDt== null ) { if ( __jobUseEndDt!= null ) return false; }
			else if ( !_jobUseEndDt.equals(__jobUseEndDt) ) return false;
		}
		{
			Object _dsAllwList= getDsAllwList();
			Object __dsAllwList= other.getDsAllwList();
			if ( _dsAllwList== null ) { if ( __dsAllwList!= null ) return false; }
			else if ( !_dsAllwList.equals(__dsAllwList) ) return false;
		}
		{
			Object _defaultCommitIntvl= getDefaultCommitIntvl();
			Object __defaultCommitIntvl= other.getDefaultCommitIntvl();
			if ( _defaultCommitIntvl== null ) { if ( __defaultCommitIntvl!= null ) return false; }
			else if ( !_defaultCommitIntvl.equals(__defaultCommitIntvl) ) return false;
		}
		{
			Object _regUserId= getRegUserId();
			Object __regUserId= other.getRegUserId();
			if ( _regUserId== null ) { if ( __regUserId!= null ) return false; }
			else if ( !_regUserId.equals(__regUserId) ) return false;
		}
		{
			Object _regOccurDttm= getRegOccurDttm();
			Object __regOccurDttm= other.getRegOccurDttm();
			if ( _regOccurDttm== null ) { if ( __regOccurDttm!= null ) return false; }
			else if ( !_regOccurDttm.equals(__regOccurDttm) ) return false;
		}
		{
			Object _modifyUserId= getModifyUserId();
			Object __modifyUserId= other.getModifyUserId();
			if ( _modifyUserId== null ) { if ( __modifyUserId!= null ) return false; }
			else if ( !_modifyUserId.equals(__modifyUserId) ) return false;
		}
		{
			Object _modifyOccurDttm= getModifyOccurDttm();
			Object __modifyOccurDttm= other.getModifyOccurDttm();
			if ( _modifyOccurDttm== null ) { if ( __modifyOccurDttm!= null ) return false; }
			else if ( !_modifyOccurDttm.equals(__modifyOccurDttm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(BxmTestChunkInputDto.class.getName()).append(":\n");
		sb.append("\tdomainId: ");
		sb.append(domainId==null?"null":getDomainId());
		sb.append("\n");
		sb.append("\tjobId: ");
		sb.append(jobId==null?"null":getJobId());
		sb.append("\n");
		sb.append("\tjobNm: ");
		sb.append(jobNm==null?"null":getJobNm());
		sb.append("\n");
		sb.append("\tjobTypeCd: ");
		sb.append(jobTypeCd==null?"null":getJobTypeCd());
		sb.append("\n");
		sb.append("\tbxmAppId: ");
		sb.append(bxmAppId==null?"null":getBxmAppId());
		sb.append("\n");
		sb.append("\tuseYn: ");
		sb.append(useYn==null?"null":getUseYn());
		sb.append("\n");
		sb.append("\tsysLogLvNm: ");
		sb.append(sysLogLvNm==null?"null":getSysLogLvNm());
		sb.append("\n");
		sb.append("\tbizLogLvNm: ");
		sb.append(bizLogLvNm==null?"null":getBizLogLvNm());
		sb.append("\n");
		sb.append("\tdbLogLvNm: ");
		sb.append(dbLogLvNm==null?"null":getDbLogLvNm());
		sb.append("\n");
		sb.append("\tcommitCfgList: ");
		sb.append(commitCfgList==null?"null":getCommitCfgList());
		sb.append("\n");
		sb.append("\tprocessDupExecYn: ");
		sb.append(processDupExecYn==null?"null":getProcessDupExecYn());
		sb.append("\n");
		sb.append("\tparamDupExecYn: ");
		sb.append(paramDupExecYn==null?"null":getParamDupExecYn());
		sb.append("\n");
		sb.append("\tstdDtDscd: ");
		sb.append(stdDtDscd==null?"null":getStdDtDscd());
		sb.append("\n");
		sb.append("\tdtBefAftDscd: ");
		sb.append(dtBefAftDscd==null?"null":getDtBefAftDscd());
		sb.append("\n");
		sb.append("\tdtBefAftDayCnt: ");
		sb.append(dtBefAftDayCnt==null?"null":getDtBefAftDayCnt());
		sb.append("\n");
		sb.append("\tstdDtParamUseYn: ");
		sb.append(stdDtParamUseYn==null?"null":getStdDtParamUseYn());
		sb.append("\n");
		sb.append("\tjobUseStartDt: ");
		sb.append(jobUseStartDt==null?"null":getJobUseStartDt());
		sb.append("\n");
		sb.append("\tjobUseEndDt: ");
		sb.append(jobUseEndDt==null?"null":getJobUseEndDt());
		sb.append("\n");
		sb.append("\tdsAllwList: ");
		sb.append(dsAllwList==null?"null":getDsAllwList());
		sb.append("\n");
		sb.append("\tdefaultCommitIntvl: ");
		sb.append(defaultCommitIntvl==null?"null":getDefaultCommitIntvl());
		sb.append("\n");
		sb.append("\tregUserId: ");
		sb.append(regUserId==null?"null":getRegUserId());
		sb.append("\n");
		sb.append("\tregOccurDttm: ");
		sb.append(regOccurDttm==null?"null":getRegOccurDttm());
		sb.append("\n");
		sb.append("\tmodifyUserId: ");
		sb.append(modifyUserId==null?"null":getModifyUserId());
		sb.append("\n");
		sb.append("\tmodifyOccurDttm: ");
		sb.append(modifyOccurDttm==null?"null":getModifyOccurDttm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 14; /* domainId */
		messageLen+= 100; /* jobId */
		messageLen+= 256; /* jobNm */
		messageLen+= 1; /* jobTypeCd */
		messageLen+= 40; /* bxmAppId */
		messageLen+= 1; /* useYn */
		messageLen+= 10; /* sysLogLvNm */
		messageLen+= 10; /* bizLogLvNm */
		messageLen+= 10; /* dbLogLvNm */
		messageLen+= 1024; /* commitCfgList */
		messageLen+= 1; /* processDupExecYn */
		messageLen+= 1; /* paramDupExecYn */
		messageLen+= 1; /* stdDtDscd */
		messageLen+= 1; /* dtBefAftDscd */
		messageLen+= 2; /* dtBefAftDayCnt */
		messageLen+= 1; /* stdDtParamUseYn */
		messageLen+= 8; /* jobUseStartDt */
		messageLen+= 8; /* jobUseEndDt */
		messageLen+= 200; /* dsAllwList */
		messageLen+= 5; /* defaultCommitIntvl */
		messageLen+= 50; /* regUserId */
		messageLen+= 23; /* regOccurDttm */
		messageLen+= 50; /* modifyUserId */
		messageLen+= 23; /* modifyOccurDttm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("domainId");
		list.add("jobId");
		list.add("jobNm");
		list.add("jobTypeCd");
		list.add("bxmAppId");
		list.add("useYn");
		list.add("sysLogLvNm");
		list.add("bizLogLvNm");
		list.add("dbLogLvNm");
		list.add("commitCfgList");
		list.add("processDupExecYn");
		list.add("paramDupExecYn");
		list.add("stdDtDscd");
		list.add("dtBefAftDscd");
		list.add("dtBefAftDayCnt");
		list.add("stdDtParamUseYn");
		list.add("jobUseStartDt");
		list.add("jobUseEndDt");
		list.add("dsAllwList");
		list.add("defaultCommitIntvl");
		list.add("regUserId");
		list.add("regOccurDttm");
		list.add("modifyUserId");
		list.add("modifyOccurDttm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("domainId", get("domainId"));
		map.put("jobId", get("jobId"));
		map.put("jobNm", get("jobNm"));
		map.put("jobTypeCd", get("jobTypeCd"));
		map.put("bxmAppId", get("bxmAppId"));
		map.put("useYn", get("useYn"));
		map.put("sysLogLvNm", get("sysLogLvNm"));
		map.put("bizLogLvNm", get("bizLogLvNm"));
		map.put("dbLogLvNm", get("dbLogLvNm"));
		map.put("commitCfgList", get("commitCfgList"));
		map.put("processDupExecYn", get("processDupExecYn"));
		map.put("paramDupExecYn", get("paramDupExecYn"));
		map.put("stdDtDscd", get("stdDtDscd"));
		map.put("dtBefAftDscd", get("dtBefAftDscd"));
		map.put("dtBefAftDayCnt", get("dtBefAftDayCnt"));
		map.put("stdDtParamUseYn", get("stdDtParamUseYn"));
		map.put("jobUseStartDt", get("jobUseStartDt"));
		map.put("jobUseEndDt", get("jobUseEndDt"));
		map.put("dsAllwList", get("dsAllwList"));
		map.put("defaultCommitIntvl", get("defaultCommitIntvl"));
		map.put("regUserId", get("regUserId"));
		map.put("regOccurDttm", get("regOccurDttm"));
		map.put("modifyUserId", get("modifyUserId"));
		map.put("modifyOccurDttm", get("modifyOccurDttm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1129430271:/* domainId */
			return getDomainId();
		case 101296568:/* jobId */
			return getJobId();
		case 101296732:/* jobNm */
			return getJobNm();
		case 1162852184:/* jobTypeCd */
			return getJobTypeCd();
		case 1307033221:/* bxmAppId */
			return getBxmAppId();
		case 111577852:/* useYn */
			return getUseYn();
		case -217007424:/* sysLogLvNm */
			return getSysLogLvNm();
		case 1292992954:/* bizLogLvNm */
			return getBizLogLvNm();
		case 646042607:/* dbLogLvNm */
			return getDbLogLvNm();
		case 1771095531:/* commitCfgList */
			return getCommitCfgList();
		case 92694710:/* processDupExecYn */
			return getProcessDupExecYn();
		case -1995444136:/* paramDupExecYn */
			return getParamDupExecYn();
		case -784192029:/* stdDtDscd */
			return getStdDtDscd();
		case 2041779564:/* dtBefAftDscd */
			return getDtBefAftDscd();
		case -665889431:/* dtBefAftDayCnt */
			return getDtBefAftDayCnt();
		case -178832158:/* stdDtParamUseYn */
			return getStdDtParamUseYn();
		case -1125201752:/* jobUseStartDt */
			return getJobUseStartDt();
		case 1179017313:/* jobUseEndDt */
			return getJobUseEndDt();
		case 2008540771:/* dsAllwList */
			return getDsAllwList();
		case -1699445011:/* defaultCommitIntvl */
			return getDefaultCommitIntvl();
		case -494791686:/* regUserId */
			return getRegUserId();
		case -1523820831:/* regOccurDttm */
			return getRegOccurDttm();
		case 245931936:/* modifyUserId */
			return getModifyUserId();
		case 2126602619:/* modifyOccurDttm */
			return getModifyOccurDttm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1129430271:/* domainId */
			setDomainId((String)value);
			break;
		case 101296568:/* jobId */
			setJobId((String)value);
			break;
		case 101296732:/* jobNm */
			setJobNm((String)value);
			break;
		case 1162852184:/* jobTypeCd */
			setJobTypeCd((String)value);
			break;
		case 1307033221:/* bxmAppId */
			setBxmAppId((String)value);
			break;
		case 111577852:/* useYn */
			setUseYn((String)value);
			break;
		case -217007424:/* sysLogLvNm */
			setSysLogLvNm((String)value);
			break;
		case 1292992954:/* bizLogLvNm */
			setBizLogLvNm((String)value);
			break;
		case 646042607:/* dbLogLvNm */
			setDbLogLvNm((String)value);
			break;
		case 1771095531:/* commitCfgList */
			setCommitCfgList((String)value);
			break;
		case 92694710:/* processDupExecYn */
			setProcessDupExecYn((String)value);
			break;
		case -1995444136:/* paramDupExecYn */
			setParamDupExecYn((String)value);
			break;
		case -784192029:/* stdDtDscd */
			setStdDtDscd((String)value);
			break;
		case 2041779564:/* dtBefAftDscd */
			setDtBefAftDscd((String)value);
			break;
		case -665889431:/* dtBefAftDayCnt */
			setDtBefAftDayCnt((Integer)value);
			break;
		case -178832158:/* stdDtParamUseYn */
			setStdDtParamUseYn((String)value);
			break;
		case -1125201752:/* jobUseStartDt */
			setJobUseStartDt((String)value);
			break;
		case 1179017313:/* jobUseEndDt */
			setJobUseEndDt((String)value);
			break;
		case 2008540771:/* dsAllwList */
			setDsAllwList((String)value);
			break;
		case -1699445011:/* defaultCommitIntvl */
			setDefaultCommitIntvl((Integer)value);
			break;
		case -494791686:/* regUserId */
			setRegUserId((String)value);
			break;
		case -1523820831:/* regOccurDttm */
			setRegOccurDttm((String)value);
			break;
		case 245931936:/* modifyUserId */
			setModifyUserId((String)value);
			break;
		case 2126602619:/* modifyOccurDttm */
			setModifyOccurDttm((String)value);
			break;
		default:
			break;
		}
	}
	
}
