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
 * 
 */
@XmlType(propOrder={
	"errorYn"
}, name="SSMP1012A002InDto")
@XmlRootElement(name="SSMP1012A002InDto")
@BxmCategory(logicalName="파일 다운로드 입력 DTO", description="") 
public class SSMP1012A002InDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -869685906L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 에러여부
	 */
	@XmlElement
	@JsonProperty("errorYn")
	@BxmOmm_Field(length=1, decimal=0, description="에러여부", align="left", fill="")
	private String errorYn= null;
	
	
	
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
	public SSMP1012A002InDto clone(){
		try{
			SSMP1012A002InDto object= (SSMP1012A002InDto)super.clone();
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
		
		result= prime * result + ((this.errorYn==null)?0:this.errorYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1012A002InDto other= (SSMP1012A002InDto)obj;
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
	
		sb.append("\n[").append(SSMP1012A002InDto.class.getName()).append(":\n");
		sb.append("\terrorYn: ");
		sb.append(errorYn==null?"null":getErrorYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* errorYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("errorYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("errorYn", get("errorYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1478984899:/* errorYn */
			return getErrorYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1478984899:/* errorYn */
			setErrorYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
