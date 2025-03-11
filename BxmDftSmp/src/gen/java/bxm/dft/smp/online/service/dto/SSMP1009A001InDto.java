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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 업무로그 Input
 */
@XmlType(propOrder={
	"feduDeptNo", "feduDeptNm", "feduAdrCtnt"
}, name="SSMP1009A001InDto")
@XmlRootElement(name="SSMP1009A001InDto")
@BxmCategory(logicalName="", description="업무로그 Input") 
public class SSMP1009A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -476958233L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "업무로그 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * FW샘플 부서번호
	 */
	@XmlElement
	@JsonProperty("feduDeptNo")
	@BxmOmm_Field(length=2, decimal=0, description="FW샘플 부서번호", align="right", fill="")
	private Integer feduDeptNo= 0;
	
	
	/**
	 * FW샘플 부서명
	 */
	@XmlElement
	@JsonProperty("feduDeptNm")
	@BxmOmm_Field(length=14, decimal=0, description="FW샘플 부서명", align="left", fill="")
	private String feduDeptNm= null;
	
	
	/**
	 * FW샘플 주소내용
	 */
	@XmlElement
	@JsonProperty("feduAdrCtnt")
	@BxmOmm_Field(length=13, decimal=0, description="FW샘플 주소내용", align="left", fill="")
	private String feduAdrCtnt= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduDeptNo= false;
	protected final boolean isSet_feduDeptNo(){
		return this.isSet_feduDeptNo;
	}
	private void setIsSet_feduDeptNo(boolean value){
		this.isSet_feduDeptNo= value;
	}
	/**
	 * FW샘플 부서번호
	 */
	@XmlTransient
	public Integer getFeduDeptNo(){
		return this.feduDeptNo;
	}
	
	/**
	 * FW샘플 부서번호
	 * 
	 * @param feduDeptNo FW샘플 부서번호
	 */
	public void setFeduDeptNo(Integer feduDeptNo){
		this.feduDeptNo= feduDeptNo;
		this.setIsSet_feduDeptNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduDeptNm= false;
	protected final boolean isSet_feduDeptNm(){
		return this.isSet_feduDeptNm;
	}
	private void setIsSet_feduDeptNm(boolean value){
		this.isSet_feduDeptNm= value;
	}
	/**
	 * FW샘플 부서명
	 */
	@XmlTransient
	public String getFeduDeptNm(){
		return this.feduDeptNm;
	}
	
	/**
	 * FW샘플 부서명
	 * 
	 * @param feduDeptNm FW샘플 부서명
	 */
	public void setFeduDeptNm(String feduDeptNm){
		this.feduDeptNm= feduDeptNm;
		this.setIsSet_feduDeptNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduAdrCtnt= false;
	protected final boolean isSet_feduAdrCtnt(){
		return this.isSet_feduAdrCtnt;
	}
	private void setIsSet_feduAdrCtnt(boolean value){
		this.isSet_feduAdrCtnt= value;
	}
	/**
	 * FW샘플 주소내용
	 */
	@XmlTransient
	public String getFeduAdrCtnt(){
		return this.feduAdrCtnt;
	}
	
	/**
	 * FW샘플 주소내용
	 * 
	 * @param feduAdrCtnt FW샘플 주소내용
	 */
	public void setFeduAdrCtnt(String feduAdrCtnt){
		this.feduAdrCtnt= feduAdrCtnt;
		this.setIsSet_feduAdrCtnt(true);
	}
	
	@Override
	public SSMP1009A001InDto clone(){
		try{
			SSMP1009A001InDto object= (SSMP1009A001InDto)super.clone();
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
		
		result= prime * result + ((this.feduDeptNo==null)?0:this.feduDeptNo.hashCode());
		result= prime * result + ((this.feduDeptNm==null)?0:this.feduDeptNm.hashCode());
		result= prime * result + ((this.feduAdrCtnt==null)?0:this.feduAdrCtnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1009A001InDto other= (SSMP1009A001InDto)obj;
		{
			Object _feduDeptNo= getFeduDeptNo();
			Object __feduDeptNo= other.getFeduDeptNo();
			if ( _feduDeptNo== null ) { if ( __feduDeptNo!= null ) return false; }
			else if ( !_feduDeptNo.equals(__feduDeptNo) ) return false;
		}
		{
			Object _feduDeptNm= getFeduDeptNm();
			Object __feduDeptNm= other.getFeduDeptNm();
			if ( _feduDeptNm== null ) { if ( __feduDeptNm!= null ) return false; }
			else if ( !_feduDeptNm.equals(__feduDeptNm) ) return false;
		}
		{
			Object _feduAdrCtnt= getFeduAdrCtnt();
			Object __feduAdrCtnt= other.getFeduAdrCtnt();
			if ( _feduAdrCtnt== null ) { if ( __feduAdrCtnt!= null ) return false; }
			else if ( !_feduAdrCtnt.equals(__feduAdrCtnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1009A001InDto.class.getName()).append(":\n");
		sb.append("\tfeduDeptNo: ");
		sb.append(feduDeptNo==null?"null":getFeduDeptNo());
		sb.append("\n");
		sb.append("\tfeduDeptNm: ");
		sb.append(feduDeptNm==null?"null":getFeduDeptNm());
		sb.append("\n");
		sb.append("\tfeduAdrCtnt: ");
		sb.append(feduAdrCtnt==null?"null":getFeduAdrCtnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* feduDeptNo */
		messageLen+= 14; /* feduDeptNm */
		messageLen+= 13; /* feduAdrCtnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("feduDeptNo");
		list.add("feduDeptNm");
		list.add("feduAdrCtnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("feduDeptNo", get("feduDeptNo"));
		map.put("feduDeptNm", get("feduDeptNm"));
		map.put("feduAdrCtnt", get("feduAdrCtnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 255783062:/* feduDeptNo */
			return getFeduDeptNo();
		case 255783060:/* feduDeptNm */
			return getFeduDeptNm();
		case 943591318:/* feduAdrCtnt */
			return getFeduAdrCtnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 255783062:/* feduDeptNo */
			setFeduDeptNo((Integer)value);
			break;
		case 255783060:/* feduDeptNm */
			setFeduDeptNm((String)value);
			break;
		case 943591318:/* feduAdrCtnt */
			setFeduAdrCtnt((String)value);
			break;
		default:
			break;
		}
	}
	
}
