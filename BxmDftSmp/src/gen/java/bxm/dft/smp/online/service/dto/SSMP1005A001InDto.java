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
 * 내부연동 Input
 */
@XmlType(propOrder={
	"feduEmpNo"
}, name="SSMP1005A001InDto")
@XmlRootElement(name="SSMP1005A001InDto")
@BxmCategory(logicalName="", description="내부연동 Input") 
public class SSMP1005A001InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 309095787L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "내부연동 Input";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * FW교육임직원번호
	 */
	@XmlElement
	@JsonProperty("feduEmpNo")
	@BxmOmm_Field(length=4, decimal=0, description="FW교육임직원번호", align="right", fill="")
	private Integer feduEmpNo= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feduEmpNo= false;
	protected final boolean isSet_feduEmpNo(){
		return this.isSet_feduEmpNo;
	}
	private void setIsSet_feduEmpNo(boolean value){
		this.isSet_feduEmpNo= value;
	}
	/**
	 * FW교육임직원번호
	 */
	@XmlTransient
	public Integer getFeduEmpNo(){
		return this.feduEmpNo;
	}
	
	/**
	 * FW교육임직원번호
	 * 
	 * @param feduEmpNo FW교육임직원번호
	 */
	public void setFeduEmpNo(Integer feduEmpNo){
		this.feduEmpNo= feduEmpNo;
		this.setIsSet_feduEmpNo(true);
	}
	
	@Override
	public SSMP1005A001InDto clone(){
		try{
			SSMP1005A001InDto object= (SSMP1005A001InDto)super.clone();
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
		
		result= prime * result + ((this.feduEmpNo==null)?0:this.feduEmpNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1005A001InDto other= (SSMP1005A001InDto)obj;
		{
			Object _feduEmpNo= getFeduEmpNo();
			Object __feduEmpNo= other.getFeduEmpNo();
			if ( _feduEmpNo== null ) { if ( __feduEmpNo!= null ) return false; }
			else if ( !_feduEmpNo.equals(__feduEmpNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1005A001InDto.class.getName()).append(":\n");
		sb.append("\tfeduEmpNo: ");
		sb.append(feduEmpNo==null?"null":getFeduEmpNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* feduEmpNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("feduEmpNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("feduEmpNo", get("feduEmpNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2068798215:/* feduEmpNo */
			return getFeduEmpNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2068798215:/* feduEmpNo */
			setFeduEmpNo((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
