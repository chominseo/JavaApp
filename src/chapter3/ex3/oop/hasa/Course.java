package chapter3.ex3.oop.hasa;

public class Course {
	private int id;
	private String name;
	private int capacity;
	private int groupCount;
	private String [] members;
	private int[] shake;
	
	public Course() {
		this(0, null, null,0);
	}
	
	public Course(int id,String name,String [] members,int capacity) {
		this.id=id;
		this.name=name;
		this.members=members;
		this.capacity=capacity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getGroupCount() {
		return groupCount;
	}
	public void setGroupCount(int groupCount) {
		this.groupCount = groupCount;
	}
	public String[] getMembers() {
		return members;
	}
	public void setMembers(String[] members) {
		this.members = members;
	}
	
}
