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
	"testRst"
}, name="SSMP1012A001OutDto")
@XmlRootElement(name="SSMP1012A001OutDto")
@BxmCategory(logicalName="파일 업로드 출력 DTO", description="") 
public class SSMP1012A001OutDto implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1898339332L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 테스트결과
	 */
	@XmlElement
	@JsonProperty("testRst")
	@BxmOmm_Field(length=100, decimal=0, description="테스트결과", align="left", fill="")
	private String testRst= null;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_testRst= false;
	protected final boolean isSet_testRst(){
		return this.isSet_testRst;
	}
	private void setIsSet_testRst(boolean value){
		this.isSet_testRst= value;
	}
	/**
	 * 테스트결과
	 */
	@XmlTransient
	public String getTestRst(){
		return this.testRst;
	}
	
	/**
	 * 테스트결과
	 * 
	 * @param testRst 테스트결과
	 */
	public void setTestRst(String testRst){
		this.testRst= testRst;
		this.setIsSet_testRst(true);
	}
	
	@Override
	public SSMP1012A001OutDto clone(){
		try{
			SSMP1012A001OutDto object= (SSMP1012A001OutDto)super.clone();
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
		
		result= prime * result + ((this.testRst==null)?0:this.testRst.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SSMP1012A001OutDto other= (SSMP1012A001OutDto)obj;
		{
			Object _testRst= getTestRst();
			Object __testRst= other.getTestRst();
			if ( _testRst== null ) { if ( __testRst!= null ) return false; }
			else if ( !_testRst.equals(__testRst) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SSMP1012A001OutDto.class.getName()).append(":\n");
		sb.append("\ttestRst: ");
		sb.append(testRst==null?"null":getTestRst());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 100; /* testRst */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("testRst");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("testRst", get("testRst"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1422467999:/* testRst */
			return getTestRst();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1422467999:/* testRst */
			setTestRst((String)value);
			break;
		default:
			break;
		}
	}
	
}
