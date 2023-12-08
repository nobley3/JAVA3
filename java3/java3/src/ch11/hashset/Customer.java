package ch11.hashset;

import java.util.HashSet;
import java.util.Objects;

public class Customer {

	String id;
	String name;
	
	
	//제너레이트 해쉬코드 and 이퀄스 누름
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
//		return Objects.hash(id, name);
//		상황봐서 내가 알아서 고치기 id,name 같으면 같은걸로 인식
	}
	
	public Customer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public static void main(String[] args) {
		
		Customer c = new Customer("dy","곽단야");
		Customer c2 = new Customer("dy","곽단야");
		
		HashSet set = new HashSet();
		
		set.add(c);
		set.add(c2);
		
		System.out.println(set);
		 
		
	}
}
