/**
 * BXM V5 - IO Java Source Generator
 */

package bxm.dft.smp.online.service.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
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
	"uploadFileFieldFileData", "uploadFileFieldContentType", "uploadFileFieldFileName", "textField", "trxCd", "errorYn"
}, name="SSMP1012A001InDto")
@XmlRootElement(name="SSMP1012A001InDto")
@BxmCategory(logicalName="파일 업로드 입력 DTO", description="") 
public class SSMP1012A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -898315057L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 업로드파일데이터
	 */
	@XmlElement
	@JsonProperty("uploadFileFieldFileData")
	@BxmOmm_Field(length=20, decimal=0, description="업로드파일데이터", align="left", fill="")
	private byte[] uploadFileFieldFileData= null;
	
	
	/**
	 * 업로드파일ContentType
	 */
	@XmlElement
	@JsonProperty("uploadFileFieldContentType")
	@BxmOmm_Field(length=20, decimal=0, description="업로드파일ContentType", align="left", fill="")
	private String uploadFileFieldContentType= null;
	
	
	/**
	 * 업로드화일이름
	 */
	@XmlElement
	@JsonProperty("uploadFileFieldFileName")
	@BxmOmm_Field(length=20, decimal=0, description="업로드화일이름", align="left", fill="")
	private String uploadFileFieldFileName= null;
	
	
	/**
	 * textField
	 */
	@XmlElement
	@JsonProperty("textField")
	@BxmOmm_Field(length=20, decimal=0, description="textField", align="left", fill="")
	private String textField= null;
	
	
	/**
	 * 거래코드
	 */
	@XmlElement
	@JsonProperty("trxCd")
	@BxmOmm_Field(length=20, decimal=0, description="거래코드", align="left", fill="")
	private String trxCd= null;
	
	
	/**
	 * 에러여부
	 */
	@XmlElement
	@JsonProperty("errorYn")
	@BxmOmm_Field(length=1, decimal=0, description="에러여부", align="left", fill="")
	private String errorYn= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_uploadFileFieldFileData= false;
	protected final boolean isSet_uploadFileFieldFileData(){
		return this.isSet_uploadFileFieldFileData;
	}
	private void setIsSet_uploadFileFieldFileData(boolean value){
		this.isSet_uploadFileFieldFileData= value;
	}
	/**
	 * 업로드파일데이터
	 */
	@XmlTransient
	public byte[] getUploadFileFieldFileData(){
		return this.uploadFileFieldFileData;
	}
	
	/**
	 * 업로드파일데이터
	 * 
	 * @param uploadFileFieldFileData 업로드파일데이터
	 */
	public void setUploadFileFieldFileData(byte[] uploadFileFieldFileData){
		this.uploadFileFieldFileData= uploadFileFieldFileData;
		this.setIsSet_uploadFileFieldFileData(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_uploadFileFieldContentType= false;
	protected final boolean isSet_uploadFileFieldContentType(){
		return this.isSet_uploadFileFieldContentType;
	}
	private void setIsSet_uploadFileFieldContentType(boolean value){
		this.isSet_uploadFileFieldContentType= value;
	}
	/**
	 * 업로드파일ContentType
	 */
	@XmlTransient
	public String getUploadFileFieldContentType(){
		return this.uploadFileFieldContentType;
	}
	
	/**
	 * 업로드파일ContentType
	 * 
	 * @param uploadFileFieldContentType 업로드파일ContentType
	 */
	public void setUploadFileFieldContentType(String uploadFileFieldContentType){
		this.uploadFileFieldContentType= uploadFileFieldContentType;
		this.setIsSet_uploadFileFieldContentType(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_uploadFileFieldFileName= false;
	protected final boolean isSet_uploadFileFieldFileName(){
		return this.isSet_uploadFileFieldFileName;
	}
	private void setIsSet_uploadFileFieldFileName(boolean value){
		this.isSet_uploadFileFieldFileName= value;
	}
	/**
	 * 업로드화일이름
	 */
	@XmlTransient
	public String getUploadFileFieldFileName(){
		return this.uploadFileFieldFileName;
	}
	
	/**
	 * 업로드화일이름
	 * 
	 * @param uploadFileFieldFileName 업로드화일이름
	 */
	public void setUploadFileFieldFileName(String uploadFileFieldFileName){
		this.uploadFileFieldFileName= uploadFileFieldFileName;
		this.setIsSet_uploadFileFieldFileName(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_textField= false;
	protected final boolean isSet_textField(){
		return this.isSet_textField;
	}
	private void setIsSet_textField(boolean value){
		this.isSet_textField= value;
	}
	/**
	 * textField
	 */
	@XmlTransient
	public String getTextField(){
		return this.textField;
	}
	
	/**
	 * textField
	 * 
	 * @param textField textField
	 */
	public void setTextField(String textField){
		this.textField= textField;
		this.setIsSet_textField(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trxCd= false;
	protected final boolean isSet_trxCd(){
		return this.isSet_trxCd;
	}
	private void setIsSet_trxCd(boolean value){
		this.isSet_trxCd= value;
	}
	/**
	 * 거래코드
	 */
	@XmlTransient
	public String getTrxCd(){
		return this.trxCd;
	}
	
	/**
	 * 거래코드
	 * 
	 * @param trxCd 거래코드
	 */
	public void setTrxCd(String trxCd){
		this.trxCd= trxCd;
		this.setIsSet_trxCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errorYn= false;
	protected final boolean isSet_errorYn(){
		return this.isSet_errorYn;
	}
	private void setIsSet_errorYn(boolean value){
		this.isSet_errorYn= value;
	}
	/**
	 * 에러여부
	 */
	@XmlTransient
	public String getErrorYn(){
		return this.errorYn;
	}
	
	/**
	 * 에러여부
	 * 
	 * @param errorYn 에러여부
	 */
	public void setErrorYn(String errorYn){
		this.errorYn= errorYn;
		this.setIsSet_errorYn(true);
	}
	
	@Override
	public SSMP1012A001InDto clone(){
		try{
			SSMP1012A001InDto object= (SSMP1012A001InDto)super.clone();
			if ( this.uploadFileFieldFileData== null ) object.uploadFileFieldFileData= null;
			else object.uploadFileFieldFileData= Arrays.copyOf(this.uploadFileFieldFileData, this.uploadFileFieldFileData.length);
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
		
		result= prime * result + ((this.uploadFileFieldFileData==null)?0:this.uploadFileFieldFileData.hashCode());
		result= prime * result + ((this.uploadFileFieldContentType==null)?0:this.uploadFileFieldContentType.hashCode());
		result= prime * result + ((this.uploadFileFieldFileName==null)?0:this.uploadFileFieldFileName.hashCode());
		result= prime * result + ((this.textField==null)?0:this.textField.hashCode());
		result= prime * result + ((this.trxCd==null)?0:this.trxCd.hashCode());
		result= prime * result + ((this.errorYn==null)?0:this.errorYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1012A001InDto other= (SSMP1012A001InDto)obj;
		{
			Object _uploadFileFieldFileData= getUploadFileFieldFileData();
			Object __uploadFileFieldFileData= other.getUploadFileFieldFileData();
			if ( _uploadFileFieldFileData== null ) { if ( __uploadFileFieldFileData!= null ) return false; }
			else if ( !_uploadFileFieldFileData.equals(__uploadFileFieldFileData) ) return false;
		}
		{
			Object _uploadFileFieldContentType= getUploadFileFieldContentType();
			Object __uploadFileFieldContentType= other.getUploadFileFieldContentType();
			if ( _uploadFileFieldContentType== null ) { if ( __uploadFileFieldContentType!= null ) return false; }
			else if ( !_uploadFileFieldContentType.equals(__uploadFileFieldContentType) ) return false;
		}
		{
			Object _uploadFileFieldFileName= getUploadFileFieldFileName();
			Object __uploadFileFieldFileName= other.getUploadFileFieldFileName();
			if ( _uploadFileFieldFileName== null ) { if ( __uploadFileFieldFileName!= null ) return false; }
			else if ( !_uploadFileFieldFileName.equals(__uploadFileFieldFileName) ) return false;
		}
		{
			Object _textField= getTextField();
			Object __textField= other.getTextField();
			if ( _textField== null ) { if ( __textField!= null ) return false; }
			else if ( !_textField.equals(__textField) ) return false;
		}
		{
			Object _trxCd= getTrxCd();
			Object __trxCd= other.getTrxCd();
			if ( _trxCd== null ) { if ( __trxCd!= null ) return false; }
			else if ( !_trxCd.equals(__trxCd) ) return false;
		}
		{
			Object _errorYn= getErrorYn();
			Object __errorYn= other.getErrorYn();
			if ( _errorYn== null ) { if ( __errorYn!= null ) return false; }
			else if ( !_errorYn.equals(__errorYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1012A001InDto.class.getName()).append(":\n");
		sb.append("\tuploadFileFieldFileData: ");
		sb.append(uploadFileFieldFileData==null?"null":getUploadFileFieldFileData());
		sb.append("\n");
		sb.append("\tuploadFileFieldContentType: ");
		sb.append(uploadFileFieldContentType==null?"null":getUploadFileFieldContentType());
		sb.append("\n");
		sb.append("\tuploadFileFieldFileName: ");
		sb.append(uploadFileFieldFileName==null?"null":getUploadFileFieldFileName());
		sb.append("\n");
		sb.append("\ttextField: ");
		sb.append(textField==null?"null":getTextField());
		sb.append("\n");
		sb.append("\ttrxCd: ");
		sb.append(trxCd==null?"null":getTrxCd());
		sb.append("\n");
		sb.append("\terrorYn: ");
		sb.append(errorYn==null?"null":getErrorYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* uploadFileFieldFileData */
		messageLen+= 20; /* uploadFileFieldContentType */
		messageLen+= 20; /* uploadFileFieldFileName */
		messageLen+= 20; /* textField */
		messageLen+= 20; /* trxCd */
		messageLen+= 1; /* errorYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("uploadFileFieldFileData");
		list.add("uploadFileFieldContentType");
		list.add("uploadFileFieldFileName");
		list.add("textField");
		list.add("trxCd");
		list.add("errorYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("uploadFileFieldFileData", get("uploadFileFieldFileData"));
		map.put("uploadFileFieldContentType", get("uploadFileFieldContentType"));
		map.put("uploadFileFieldFileName", get("uploadFileFieldFileName"));
		map.put("textField", get("textField"));
		map.put("trxCd", get("trxCd"));
		map.put("errorYn", get("errorYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1050575293:/* uploadFileFieldFileData */
			return getUploadFileFieldFileData();
		case 302109494:/* uploadFileFieldContentType */
			return getUploadFileFieldContentType();
		case -1050277596:/* uploadFileFieldFileName */
			return getUploadFileFieldFileName();
		case -1060986931:/* textField */
			return getTextField();
		case 110642107:/* trxCd */
			return getTrxCd();
		case -1478984899:/* errorYn */
			return getErrorYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1050575293:/* uploadFileFieldFileData */
			setUploadFileFieldFileData((byte[])value);
			break;
		case 302109494:/* uploadFileFieldContentType */
			setUploadFileFieldContentType((String)value);
			break;
		case -1050277596:/* uploadFileFieldFileName */
			setUploadFileFieldFileName((String)value);
			break;
		case -1060986931:/* textField */
			setTextField((String)value);
			break;
		case 110642107:/* trxCd */
			setTrxCd((String)value);
			break;
		case -1478984899:/* errorYn */
			setErrorYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
