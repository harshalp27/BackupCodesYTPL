package com.test;

public class EmployeeBean
{
    private String fullName;
      
    private DepartmentBean departmentBean;
  
    public DepartmentBean getDepartmentBean1() {
        return departmentBean;
    }
  
    public void setDepartmentBean1(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }
  
    public String getFullName() {
        return fullName;
    }
  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}