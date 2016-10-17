package com.ysreddy.shadi.service;

import com.ysreddy.shadi.beans.Person;
import com.ysreddy.shadi.beans.SearchCriteria;

public class MatchImpl implements IMatch{

	@Override
	public Person getRichMatch(SearchCriteria criteria) {
		System.out.println("Age::"+criteria.getAge());
		System.out.println("Salary::"+criteria.getSalary());
		System.out.println("Color::"+criteria.getColor());
		Person person=new Person();
		person.setCity("pune");
		person.setName("pitambar");
		return person;
	}

}
