package InheritanceExample;

public class AC extends ElectronicDevices {
	private int length,width,weight;
	private String state;
	public AC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AC(int power) {
		super(power);
		// TODO Auto-generated constructor stub
	}
	public AC(int power, int length, int width, int weight, String state) {
		super(power);
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.state = state;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
