
public class synonym {

	private String rID;
	private int nodeID;
	private int synonymID;
	private String synonymName;
	private String isoLanguage;
	
	public synonym(String rID, int nodeID, int synonymID, String isoLanguage, String synonymName) {
		super();
		this.rID = rID;
		this.nodeID = nodeID;
		this.synonymID = synonymID;
		this.isoLanguage = isoLanguage;
		this.synonymName = synonymName;
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
	public int getSynonymID() {
		return synonymID;
	}
	public void setSynonymID(int synonymID) {
		this.synonymID = synonymID;
	}
	public String getSynonymName() {
		return synonymName;
	}
	public void setSynonymName(String synonymName) {
		this.synonymName = synonymName;
	}
	public String getIsoLanguage() {
		return isoLanguage;
	}
	public void setIsoLanguage(String isoLanguage) {
		this.isoLanguage = isoLanguage;
	}
	@Override
	public String toString() {
		return rID + "\t" + nodeID + "\t" + synonymID + "\t" + isoLanguage + "\t" + synonymName;
	}
	
}
