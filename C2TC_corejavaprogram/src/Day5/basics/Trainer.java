package Day5.basics;

public class Trainer extends Person {
	
	private String session;
	private String design;
	private String batchNo;
	
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Trainer(int pid, String name, String city, String session, String design, String batchNo) {
		super();
		this.session = session;
		this.design = design;
		this.batchNo = batchNo;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	@Override
	public String toString() {
		return "Trainer [ Trainer id:"+super.getPid()+" Trainer Name:"+super.getName()+" Trainer City:"+super.getCity() + session + ", design=" + design + ", batchNo=" + batchNo + "]";
	}
	

}
