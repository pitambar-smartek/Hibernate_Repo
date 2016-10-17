package com.ysreddy.ws.recruit.service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.ysreddy.ws.recruit.beans.Resume;
import com.ysreddy.ws.recruit.beans.ResumeSearchCriteria;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ResumeFinder {
	@WebMethod
	Resume findBestResume(ResumeSearchCriteria criteria);

}
