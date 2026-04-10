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
	"binaryData"
}, name="SSMP1012A002OutDto")
@XmlRootElement(name="SSMP1012A002OutDto")
@BxmCategory(logicalName="파일 다운로드 출력 DTO", description="") 
public class SSMP1012A002OutDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1010835651L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * binaryData
	 */
	@XmlElement
	@JsonProperty("binaryData")
	@BxmOmm_Field(length=1, decimal=0, description="binaryData", align="left", fill="")
	private byte[] binaryData= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_binaryData= false;
	protected final boolean isSet_binaryData(){
		return this.isSet_binaryData;
	}
	private void setIsSet_binaryData(boolean value){
		this.isSet_binaryData= value;
	}
	/**
	 * binaryData
	 */
	@XmlTransient
	public byte[] getBinaryData(){
		return this.binaryData;
	}
	
	/**
	 * binaryData
	 * 
	 * @param binaryData binaryData
	 */
	public void setBinaryData(byte[] binaryData){
		this.binaryData= binaryData;
		this.setIsSet_binaryData(true);
	}
	
	@Override
	public SSMP1012A002OutDto clone(){
		try{
			SSMP1012A002OutDto object= (SSMP1012A002OutDto)super.clone();
			if ( this.binaryData== null ) object.binaryData= null;
			else object.binaryData= Arrays.copyOf(this.binaryData, this.binaryData.length);
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
		
		result= prime * result + ((this.binaryData==null)?0:this.binaryData.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1012A002OutDto other= (SSMP1012A002OutDto)obj;
		{
			Object _binaryData= getBinaryData();
			Object __binaryData= other.getBinaryData();
			if ( _binaryData== null ) { if ( __binaryData!= null ) return false; }
			else if ( !_binaryData.equals(__binaryData) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1012A002OutDto.class.getName()).append(":\n");
		sb.append("\tbinaryData: ");
		sb.append(binaryData==null?"null":getBinaryData());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* binaryData */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("binaryData");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("binaryData", get("binaryData"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -880900277:/* binaryData */
			return getBinaryData();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -880900277:/* binaryData */
			setBinaryData((byte[])value);
			break;
		default:
			break;
		}
	}
	
}
