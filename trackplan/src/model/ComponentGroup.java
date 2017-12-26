package model;

import java.util.HashSet;
import java.util.Set;

public class ComponentGroup<T> {
	
	private Set<T> members;
	private String name;
	
	public ComponentGroup(String name) {
		members = new HashSet<T>();
		this.name = name;
	}
	
	public void addMember(T newMember) {
		members.add(newMember);
	}
	
	public void addMembers(Set<T> newMembers) {
		members.addAll(newMembers);
	}
	
	public void removeMember(T oldMemeber) {
		members.remove(oldMemeber);
	}
	
	public Set<T> getMembers() {
		return members;
	}
	
	public String getName() {
		return name;
	}

}
