package com.ysreddy.shadi.service;

import com.ysreddy.shadi.beans.Person;
import com.ysreddy.shadi.beans.SearchCriteria;

public interface IMatch {
	public Person getRichMatch(SearchCriteria criteria);

}
