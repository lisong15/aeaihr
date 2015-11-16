package com.agileai.hr.module.information.service;

import com.agileai.domain.DataParam;
import com.agileai.hotweb.bizmoduler.core.MasterSubService;

public interface HrEmployeeManage
        extends MasterSubService {
	void approveRecord(DataParam param);
	void revokeApprovalRecords(String empId);

}
