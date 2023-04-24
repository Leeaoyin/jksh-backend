package com.letgee.infrastructure.repository.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rh_position")
public class RhPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 职位名称
     */
    @Column(name = "postion_name")
    private String postionName;

    /**
     * 公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 职能分类
     */
    @Column(name = "functional_type")
    private String functionalType;

    /**
     * 招聘人数
     */
    @Column(name = "hire_count")
    private Integer hireCount;

    /**
     * 工作城市
     */
    @Column(name = "city_work")
    private String cityWork;

    /**
     * 最低薪资
     */
    @Column(name = "min_salary")
    private Integer minSalary;

    /**
     * 最高薪资
     */
    @Column(name = "max_salary")
    private Integer maxSalary;

    /**
     * 学历要求
     */
    @Column(name = "education_certification")
    private String educationCertification;

    /**
     * 工作年限
     */
    @Column(name = "years_of_working")
    private String yearsOfWorking;

    /**
     * 接单数
     */
    @Column(name = "order_count")
    private Integer orderCount;

    /**
     * 删除 1：是 0：否
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 职位状态 1-启用 0禁用
     */
    private Integer status;

    /**
     * 创建者Id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者Id
     */
    @Column(name = "update_user_id")
    private Integer updateUserId;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 职级职称
     */
    @Column(name = "rank_title")
    private String rankTitle;

    /**
     * 行业信息
     */
    @Column(name = "industry_information")
    private String industryInformation;

    /**
     * 下属人数
     */
    @Column(name = "number_of_subordinates")
    private Integer numberOfSubordinates;

    /**
     * 院校类别
     */
    @Column(name = "Institution_category")
    private String institutionCategory;

    /**
     * 目标公司
     */
    @Column(name = "target_company")
    private String targetCompany;

    /**
     * 技能证书
     */
    @Column(name = "skill_certificates")
    private String skillCertificates;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 汇报对象
     */
    @Column(name = "who_to_report")
    private String whoToReport;

    /**
     * 办公地点
     */
    @Column(name = "office_address")
    private String officeAddress;

    /**
     * 部门架构
     */
    @Column(name = "departmental_structure")
    private String departmentalStructure;

    /**
     * 面试轮次
     */
    @Column(name = "interview_rounds")
    private Integer interviewRounds;

    /**
     * 是否接受视频面试：1是/0否
     */
    @Column(name = "accept_video")
    private Integer acceptVideo;

    /**
     * 面试流程
     */
    @Column(name = "interview_process")
    private String interviewProcess;

    /**
     * 面试地点
     */
    @Column(name = "interview_location")
    private String interviewLocation;

    /**
     * 薪资结构
     */
    @Column(name = "salary_structure")
    private String salaryStructure;

    /**
     * 薪酬福利
     */
    private String benefits;

    /**
     * 预计佣金
     */
    @Column(name = "expect_salary")
    private Integer expectSalary;

    /**
     * 岗位职责
     */
    @Column(name = "position_requirements")
    private String positionRequirements;

    /**
     * 任职要求
     */
    @Column(name = "job_requirements")
    private String jobRequirements;

    /**
     * 职位备注
     */
    @Column(name = "job_remarks")
    private String jobRemarks;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取职位名称
     *
     * @return postion_name - 职位名称
     */
    public String getPostionName() {
        return postionName;
    }

    /**
     * 设置职位名称
     *
     * @param postionName 职位名称
     */
    public void setPostionName(String postionName) {
        this.postionName = postionName;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取职能分类
     *
     * @return functional_type - 职能分类
     */
    public String getFunctionalType() {
        return functionalType;
    }

    /**
     * 设置职能分类
     *
     * @param functionalType 职能分类
     */
    public void setFunctionalType(String functionalType) {
        this.functionalType = functionalType;
    }

    /**
     * 获取招聘人数
     *
     * @return hire_count - 招聘人数
     */
    public Integer getHireCount() {
        return hireCount;
    }

    /**
     * 设置招聘人数
     *
     * @param hireCount 招聘人数
     */
    public void setHireCount(Integer hireCount) {
        this.hireCount = hireCount;
    }

    /**
     * 获取工作城市
     *
     * @return city_work - 工作城市
     */
    public String getCityWork() {
        return cityWork;
    }

    /**
     * 设置工作城市
     *
     * @param cityWork 工作城市
     */
    public void setCityWork(String cityWork) {
        this.cityWork = cityWork;
    }

    /**
     * 获取最低薪资
     *
     * @return min_salary - 最低薪资
     */
    public Integer getMinSalary() {
        return minSalary;
    }

    /**
     * 设置最低薪资
     *
     * @param minSalary 最低薪资
     */
    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    /**
     * 获取最高薪资
     *
     * @return max_salary - 最高薪资
     */
    public Integer getMaxSalary() {
        return maxSalary;
    }

    /**
     * 设置最高薪资
     *
     * @param maxSalary 最高薪资
     */
    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    /**
     * 获取学历要求
     *
     * @return education_certification - 学历要求
     */
    public String getEducationCertification() {
        return educationCertification;
    }

    /**
     * 设置学历要求
     *
     * @param educationCertification 学历要求
     */
    public void setEducationCertification(String educationCertification) {
        this.educationCertification = educationCertification;
    }

    /**
     * 获取工作年限
     *
     * @return years_of_working - 工作年限
     */
    public String getYearsOfWorking() {
        return yearsOfWorking;
    }

    /**
     * 设置工作年限
     *
     * @param yearsOfWorking 工作年限
     */
    public void setYearsOfWorking(String yearsOfWorking) {
        this.yearsOfWorking = yearsOfWorking;
    }

    /**
     * 获取接单数
     *
     * @return order_count - 接单数
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * 设置接单数
     *
     * @param orderCount 接单数
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 获取删除 1：是 0：否
     *
     * @return is_deleted - 删除 1：是 0：否
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置删除 1：是 0：否
     *
     * @param isDeleted 删除 1：是 0：否
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取职位状态 1-启用 0禁用
     *
     * @return status - 职位状态 1-启用 0禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置职位状态 1-启用 0禁用
     *
     * @param status 职位状态 1-启用 0禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建者Id
     *
     * @return create_user_id - 创建者Id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建者Id
     *
     * @param createUserId 创建者Id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新者Id
     *
     * @return update_user_id - 更新者Id
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新者Id
     *
     * @param updateUserId 更新者Id
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取职级职称
     *
     * @return rank_title - 职级职称
     */
    public String getRankTitle() {
        return rankTitle;
    }

    /**
     * 设置职级职称
     *
     * @param rankTitle 职级职称
     */
    public void setRankTitle(String rankTitle) {
        this.rankTitle = rankTitle;
    }

    /**
     * 获取行业信息
     *
     * @return industry_information - 行业信息
     */
    public String getIndustryInformation() {
        return industryInformation;
    }

    /**
     * 设置行业信息
     *
     * @param industryInformation 行业信息
     */
    public void setIndustryInformation(String industryInformation) {
        this.industryInformation = industryInformation;
    }

    /**
     * 获取下属人数
     *
     * @return number_of_subordinates - 下属人数
     */
    public Integer getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    /**
     * 设置下属人数
     *
     * @param numberOfSubordinates 下属人数
     */
    public void setNumberOfSubordinates(Integer numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    /**
     * 获取院校类别
     *
     * @return Institution_category - 院校类别
     */
    public String getInstitutionCategory() {
        return institutionCategory;
    }

    /**
     * 设置院校类别
     *
     * @param institutionCategory 院校类别
     */
    public void setInstitutionCategory(String institutionCategory) {
        this.institutionCategory = institutionCategory;
    }

    /**
     * 获取目标公司
     *
     * @return target_company - 目标公司
     */
    public String getTargetCompany() {
        return targetCompany;
    }

    /**
     * 设置目标公司
     *
     * @param targetCompany 目标公司
     */
    public void setTargetCompany(String targetCompany) {
        this.targetCompany = targetCompany;
    }

    /**
     * 获取技能证书
     *
     * @return skill_certificates - 技能证书
     */
    public String getSkillCertificates() {
        return skillCertificates;
    }

    /**
     * 设置技能证书
     *
     * @param skillCertificates 技能证书
     */
    public void setSkillCertificates(String skillCertificates) {
        this.skillCertificates = skillCertificates;
    }

    /**
     * 获取所属部门
     *
     * @return department - 所属部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置所属部门
     *
     * @param department 所属部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取汇报对象
     *
     * @return who_to_report - 汇报对象
     */
    public String getWhoToReport() {
        return whoToReport;
    }

    /**
     * 设置汇报对象
     *
     * @param whoToReport 汇报对象
     */
    public void setWhoToReport(String whoToReport) {
        this.whoToReport = whoToReport;
    }

    /**
     * 获取办公地点
     *
     * @return office_address - 办公地点
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * 设置办公地点
     *
     * @param officeAddress 办公地点
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    /**
     * 获取部门架构
     *
     * @return departmental_structure - 部门架构
     */
    public String getDepartmentalStructure() {
        return departmentalStructure;
    }

    /**
     * 设置部门架构
     *
     * @param departmentalStructure 部门架构
     */
    public void setDepartmentalStructure(String departmentalStructure) {
        this.departmentalStructure = departmentalStructure;
    }

    /**
     * 获取面试轮次
     *
     * @return interview_rounds - 面试轮次
     */
    public Integer getInterviewRounds() {
        return interviewRounds;
    }

    /**
     * 设置面试轮次
     *
     * @param interviewRounds 面试轮次
     */
    public void setInterviewRounds(Integer interviewRounds) {
        this.interviewRounds = interviewRounds;
    }

    /**
     * 获取是否接受视频面试：1是/0否
     *
     * @return accept_video - 是否接受视频面试：1是/0否
     */
    public Integer getAcceptVideo() {
        return acceptVideo;
    }

    /**
     * 设置是否接受视频面试：1是/0否
     *
     * @param acceptVideo 是否接受视频面试：1是/0否
     */
    public void setAcceptVideo(Integer acceptVideo) {
        this.acceptVideo = acceptVideo;
    }

    /**
     * 获取面试流程
     *
     * @return interview_process - 面试流程
     */
    public String getInterviewProcess() {
        return interviewProcess;
    }

    /**
     * 设置面试流程
     *
     * @param interviewProcess 面试流程
     */
    public void setInterviewProcess(String interviewProcess) {
        this.interviewProcess = interviewProcess;
    }

    /**
     * 获取面试地点
     *
     * @return interview_location - 面试地点
     */
    public String getInterviewLocation() {
        return interviewLocation;
    }

    /**
     * 设置面试地点
     *
     * @param interviewLocation 面试地点
     */
    public void setInterviewLocation(String interviewLocation) {
        this.interviewLocation = interviewLocation;
    }

    /**
     * 获取薪资结构
     *
     * @return salary_structure - 薪资结构
     */
    public String getSalaryStructure() {
        return salaryStructure;
    }

    /**
     * 设置薪资结构
     *
     * @param salaryStructure 薪资结构
     */
    public void setSalaryStructure(String salaryStructure) {
        this.salaryStructure = salaryStructure;
    }

    /**
     * 获取薪酬福利
     *
     * @return benefits - 薪酬福利
     */
    public String getBenefits() {
        return benefits;
    }

    /**
     * 设置薪酬福利
     *
     * @param benefits 薪酬福利
     */
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    /**
     * 获取预计佣金
     *
     * @return expect_salary - 预计佣金
     */
    public Integer getExpectSalary() {
        return expectSalary;
    }

    /**
     * 设置预计佣金
     *
     * @param expectSalary 预计佣金
     */
    public void setExpectSalary(Integer expectSalary) {
        this.expectSalary = expectSalary;
    }

    /**
     * 获取岗位职责
     *
     * @return position_requirements - 岗位职责
     */
    public String getPositionRequirements() {
        return positionRequirements;
    }

    /**
     * 设置岗位职责
     *
     * @param positionRequirements 岗位职责
     */
    public void setPositionRequirements(String positionRequirements) {
        this.positionRequirements = positionRequirements;
    }

    /**
     * 获取任职要求
     *
     * @return job_requirements - 任职要求
     */
    public String getJobRequirements() {
        return jobRequirements;
    }

    /**
     * 设置任职要求
     *
     * @param jobRequirements 任职要求
     */
    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    /**
     * 获取职位备注
     *
     * @return job_remarks - 职位备注
     */
    public String getJobRemarks() {
        return jobRemarks;
    }

    /**
     * 设置职位备注
     *
     * @param jobRemarks 职位备注
     */
    public void setJobRemarks(String jobRemarks) {
        this.jobRemarks = jobRemarks;
    }
}