package com.ysreddy.ws.recruit.service;

import javax.ejb.CreateException;
import javax.jws.WebService;

import com.ysreddy.ws.recruit.beans.Resume;
import com.ysreddy.ws.recruit.beans.ResumeSearchCriteria;

@WebService(endpointInterface="com.ysreddy.ws.recruit.service.ResumeFinder")
public class ResumeFinderImpl implements ResumeFinder{

	@Override
	public Resume findBestResume(ResumeSearchCriteria criteria) {
		System.out.println("...Resume Search Parameters...");
		System.out.println("Total Experience="+criteria.getYearOfExperience());
		System.out.println("Technology="+criteria.getTechnology());
		System.out.println("Current CTC="+criteria.getCurrentCTC());
		System.out.println("Excepted CTC="+criteria.getExpectedCTC());
		System.out.println("Is certified="+criteria.isCertified());
		Resume resume=new Resume();
		resume.setAddress("Hinjewadi phase-1");
		resume.setCurrentCompany("Symphony Teleca");
		resume.setDescription("Looking for better opportunity,to present my best");
		resume.setTitle("Having 5 + years of experience");
		return resume;
	}

}
