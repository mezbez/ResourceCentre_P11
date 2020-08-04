
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String descriptions, String os) {
		super(assetTag, descriptions);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String info = super.toString();
		return String.format("%-63s %-20s", info, getOs());
	}
}


