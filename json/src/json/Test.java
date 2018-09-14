package json;

public class Test {

	private String dinum;
	private String diname;
	private String dicode;
	private String didesc;

	@Override
	public String toString() {
		return "Test [dinum=" + dinum + ", diname=" + diname + ", dicode=" + dicode + ", didesc=" + didesc + "]";
	}

	public String getDinum() {
		return dinum;
	}

	public void setDinum(String dinum) {
		this.dinum = dinum;
	}

	public String getDiname() {
		return diname;
	}

	public void setDiname(String diname) {
		this.diname = diname;
	}

	public String getDicode() {
		return dicode;
	}

	public void setDicode(String dicode) {
		this.dicode = dicode;
	}

	public String getDidesc() {
		return didesc;
	}

	public void setDidesc(String didesc) {
		this.didesc = didesc;
	}

}
