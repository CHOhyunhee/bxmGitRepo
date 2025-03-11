/**
 * BXM V5 - IO Java Source Generator
 */

package bxm.dft.smp.online.dbio.dto;

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
	"domainId", "trxGuid", "logData"
}, name="DBxmLogTestIO3")
@XmlRootElement(name="DBxmLogTestIO3")
@BxmCategory(logicalName="", description="") 
public class DBxmLogTestIO3 implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 829752723L;
	
	@XmlTransient
	public static final String OMM_DESCRIPTION= "";
	@XmlTransient
	public static final String OMM_VERSION= "";
	
	
	
	/**
	 * 
	 */
	@XmlElement
	@JsonProperty("domainId")
	@BxmOmm_Field(length=14, decimal=0, align="left", fill="")
	private String domainId= null;
	
	
	/**
	 * 
	 */
	@XmlElement
	@JsonProperty("trxGuid")
	@BxmOmm_Field(length=40, decimal=0, align="left", fill="")
	private String trxGuid= null;
	
	
	/**
	 * 
	 */
	@XmlElement
	@JsonProperty("logData")
	@BxmOmm_Field(length=1000, decimal=0, align="left", fill="")
	private String logData= null;
	
	
	
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
	 * 
	 */
	@XmlTransient
	public String getDomainId(){
		return this.domainId;
	}
	
	/**
	 * 
	 * 
	 * @param domainId 
	 */
	public void setDomainId(String domainId){
		this.domainId= domainId;
		this.setIsSet_domainId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trxGuid= false;
	protected final boolean isSet_trxGuid(){
		return this.isSet_trxGuid;
	}
	private void setIsSet_trxGuid(boolean value){
		this.isSet_trxGuid= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public String getTrxGuid(){
		return this.trxGuid;
	}
	
	/**
	 * 
	 * 
	 * @param trxGuid 
	 */
	public void setTrxGuid(String trxGuid){
		this.trxGuid= trxGuid;
		this.setIsSet_trxGuid(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_logData= false;
	protected final boolean isSet_logData(){
		return this.isSet_logData;
	}
	private void setIsSet_logData(boolean value){
		this.isSet_logData= value;
	}
	/**
	 * 
	 */
	@XmlTransient
	public String getLogData(){
		return this.logData;
	}
	
	/**
	 * 
	 * 
	 * @param logData 
	 */
	public void setLogData(String logData){
		this.logData= logData;
		this.setIsSet_logData(true);
	}
	
	@Override
	public DBxmLogTestIO3 clone(){
		try{
			DBxmLogTestIO3 object= (DBxmLogTestIO3)super.clone();
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
		result= prime * result + ((this.trxGuid==null)?0:this.trxGuid.hashCode());
		result= prime * result + ((this.logData==null)?0:this.logData.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final DBxmLogTestIO3 other= (DBxmLogTestIO3)obj;
		{
			Object _domainId= getDomainId();
			Object __domainId= other.getDomainId();
			if ( _domainId== null ) { if ( __domainId!= null ) return false; }
			else if ( !_domainId.equals(__domainId) ) return false;
		}
		{
			Object _trxGuid= getTrxGuid();
			Object __trxGuid= other.getTrxGuid();
			if ( _trxGuid== null ) { if ( __trxGuid!= null ) return false; }
			else if ( !_trxGuid.equals(__trxGuid) ) return false;
		}
		{
			Object _logData= getLogData();
			Object __logData= other.getLogData();
			if ( _logData== null ) { if ( __logData!= null ) return false; }
			else if ( !_logData.equals(__logData) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(DBxmLogTestIO3.class.getName()).append(":\n");
		sb.append("\tdomainId: ");
		sb.append(domainId==null?"null":getDomainId());
		sb.append("\n");
		sb.append("\ttrxGuid: ");
		sb.append(trxGuid==null?"null":getTrxGuid());
		sb.append("\n");
		sb.append("\tlogData: ");
		sb.append(logData==null?"null":getLogData());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 14; /* domainId */
		messageLen+= 40; /* trxGuid */
		messageLen+= 1000; /* logData */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("domainId");
		list.add("trxGuid");
		list.add("logData");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("domainId", get("domainId"));
		map.put("trxGuid", get("trxGuid"));
		map.put("logData", get("logData"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1129430271:/* domainId */
			return getDomainId();
		case -1046978717:/* trxGuid */
			return getTrxGuid();
		case 341230862:/* logData */
			return getLogData();
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
		case -1046978717:/* trxGuid */
			setTrxGuid((String)value);
			break;
		case 341230862:/* logData */
			setLogData((String)value);
			break;
		default:
			break;
		}
	}
	
}
