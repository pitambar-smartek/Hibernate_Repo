package com.bt.tadds.model;

import javax.xml.transform.stream.StreamSource;

import com.bt.nat.capabilities.xsd.managenetworkandservicediagnostics._2007._08._01.ccm.gettestresultbymortidresponse.operationalanalysis.TestInstance;
import com.bt.tadds.dao.GetTestResultServiceDAO;
import com.bt.tadds.util.GenericXSLT;

public class GetTestResultServiceModel {
	GetTestResultServiceDAO dao=null;
	GenericXSLT genericXSLT=null;
	public GetTestResultServiceModel() {
		dao=new GetTestResultServiceDAO();
		genericXSLT=new GenericXSLT();
		
	}

	public TestInstance[] getTestInstancesForTestId(
			String testId,String tarrId) {
		//String message=dao.getTestResults(testId, tarrId);
		//call the GenericXslt
		genericXSLT.getStreamResult(dao.getTestResults(testId, tarrId), new StreamSource("give the path of xslt"));
		//convert corresponding class means TestInstance class by using un marshaling technique
		
		return null;
	}

	public TestInstance[] getTestInstancesForMortId(
			String serviceId) {
		//String message=dao.getTestResults(testId, tarrId);
				//call the GenericXslt
		String messageString[]=dao.getTestResults(serviceId);
		for(String messageSr)
				genericXSLT.getStreamResult(, new StreamSource("give the path of xslt"));
				//convert corresponding class means TestInstance class by using un marshaling technique
		return null;
	}
	

}
