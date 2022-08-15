import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class substance implements Serializable{

	private String rID;
	private int nodeID;
	private String casCode;
	private String euIndes;
	private String csCode;
	private Boolean isDeclare;
	private Boolean isUnwanted;
	private Boolean isProhibited;
	private Boolean isReach;
	private Boolean isDeleted;
	private Boolean isHidden;
	private List<synonym> subSynonym = new ArrayList<synonym>();
	
	public substance(String rID, int nodeID, String casCode, String euIndes, String csCode, Boolean isDeclare,
			Boolean isUnwanted, Boolean isProhibited, Boolean isReach, Boolean isDeleted, Boolean isHidden) {
		super();
		this.rID = rID;
		this.nodeID = nodeID;
		this.casCode = casCode;
		this.euIndes = euIndes;
		this.csCode = csCode;
		this.isDeclare = isDeclare;
		this.isUnwanted = isUnwanted;
		this.isProhibited = isProhibited;
		this.isReach = isReach;
		this.isDeleted = isDeleted;
		this.isHidden = isHidden;
	}
	


	public String getrID() {
		return rID;
	}
	public void setrID(String rID) {
		this.rID = rID;
	}
	public int getNodeID() {
		return nodeID;
	}
	public void setNodeID(int nodeID) {
		this.nodeID = nodeID;
	}
	public String getCasCode() {
		return casCode;
	}
	public void setCasCode(String casCode) {
		this.casCode = casCode;
	}
	public String getEuIndes() {
		return euIndes;
	}
	public void setEuIndes(String euIndes) {
		this.euIndes = euIndes;
	}
	public String getCsCode() {
		return csCode;
	}
	public void setCsCode(String csCode) {
		this.csCode = csCode;
	}
	public Boolean getIsDeclare() {
		return isDeclare;
	}
	public void setIsDeclare(Boolean isDeclare) {
		this.isDeclare = isDeclare;
	}
	public Boolean getIsUnwanted() {
		return isUnwanted;
	}
	public void setIsUnwanted(Boolean isUnwanted) {
		this.isUnwanted = isUnwanted;
	}
	public Boolean getIsProhibited() {
		return isProhibited;
	}
	public void setIsProhibited(Boolean isProhibited) {
		this.isProhibited = isProhibited;
	}
	public Boolean getIsReach() {
		return isReach;
	}
	public void setIsReach(Boolean isReach) {
		this.isReach = isReach;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Boolean getIsHidden() {
		return isHidden;
	}
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}
	
	public List<synonym> getSubSynonym() {
		return subSynonym;
	}

	public void setSubSynonym(synonym subSynonym) {
		this.subSynonym.add(subSynonym);
	}

	private int boolToInt(boolean b) {
	    return b ? 1 : 0;
	}

	@Override
	public String toString() {
		return rID + "\t" + nodeID + "\t" + casCode + "\t" + euIndes
					+ "\t" + csCode + "\t" + boolToInt(isDeclare) + "\t" + boolToInt(isUnwanted) + "\t" + boolToInt(isProhibited) + "\t" + boolToInt(isReach) + "\t" + boolToInt(isDeleted) + "\t" + boolToInt(isHidden);
		
	}

}
