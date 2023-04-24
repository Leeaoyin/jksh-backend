package com.jksh.infrastructure.repository.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rh_resume")
public class RhResume {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 基础信息-姓名
     */
    private String name;

    /**
     * 基础信息-性别
     */
    private String sex;

    /**
     * 基础信息-手机号
     */
    private String phone;

    /**
     * 基础信息-邮箱
     */
    private String email;

    /**
     * 基础信息-出生日期
     */
    @Column(name = "bron_date")
    private String bronDate;

    /**
     * 基础信息-工作年限
     */
    @Column(name = "year_of_work")
    private String yearOfWork;

    /**
     * 基础信息-期望职位
     */
    @Column(name = "desired_position")
    private String desiredPosition;

    /**
     * 基础信息-所在城市
     */
    @Column(name = "base_city")
    private String baseCity;

    /**
     * 基础信息-婚姻状态
     */
    private String marriage;

    /**
     * 求职意向-期望行业
     */
    @Column(name = "desired_industry")
    private String desiredIndustry;

    /**
     * 求职意向-期望职能
     */
    @Column(name = "desired_functions")
    private String desiredFunctions;

    /**
     * 求职意向-期望城市
     */
    @Column(name = "desired_city")
    private String desiredCity;

    /**
     * 求职意向-求职状态
     */
    @Column(name = "individual_state")
    private String individualState;

    /**
     * 求职意向-当前年薪
     */
    @Column(name = "current_annual_salary")
    private Integer currentAnnualSalary;

    /**
     * 求职意向-薪资结构
     */
    @Column(name = "salary_struct")
    private Integer salaryStruct;

    /**
     * 求职意向-期望最低年薪/万
     */
    @Column(name = "desried_annual_min")
    private Integer desriedAnnualMin;

    /**
     * 求职意向-期望最高年薪/万
     */
    @Column(name = "desried_annual_max")
    private Integer desriedAnnualMax;

    /**
     * cos-简历上传路径
     */
    @Column(name = "cos_of_resume")
    private String cosOfResume;

    /**
     * 上传简历生成的唯一code
     */
    @Column(name = "resume_file_code")
    private String resumeFileCode;

    /**
     * 教育经历-学校名称
     */
    @Column(name = "institution_name")
    private String institutionName;

    /**
     * 教育经历-是否统招（1是0否）
     */
    @Column(name = "unified_recruitment")
    private Integer unifiedRecruitment;

    /**
     * 教育经历-专业名称
     */
    private String major;

    /**
     * 教育经历-学历
     */
    private String degree;

    /**
     * 教育经历-就读时间（开始）
     */
    @Column(name = "begin_degree")
    private String beginDegree;

    /**
     * 教育经历-就读时间（结束）
     */
    @Column(name = "end_degree")
    private String endDegree;

    /**
     * （1正常 0停用）
     */
    private Integer status;

    /**
     * 创建者
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @Column(name = "update_user")
    private Integer updateUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 求职意向-勿推企业
     */
    @Column(name = "ignore_company")
    private String ignoreCompany;

    /**
     * 个人技能
     */
    @Column(name = "personal_skill")
    private String personalSkill;

    /**
     * 个人荣誉证书
     */
    @Column(name = "personal_certificate")
    private String personalCertificate;

    /**
     * 个人评价
     */
    @Column(name = "personal_comment")
    private String personalComment;

    /**
     * 工作经历json配置
     */
    @Column(name = "work_undergoing_config")
    private String workUndergoingConfig;

    /**
     * 项目经验json配置
     */
    @Column(name = "project_config")
    private String projectConfig;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取基础信息-姓名
     *
     * @return name - 基础信息-姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置基础信息-姓名
     *
     * @param name 基础信息-姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取基础信息-性别
     *
     * @return sex - 基础信息-性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置基础信息-性别
     *
     * @param sex 基础信息-性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取基础信息-手机号
     *
     * @return phone - 基础信息-手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置基础信息-手机号
     *
     * @param phone 基础信息-手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取基础信息-邮箱
     *
     * @return email - 基础信息-邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置基础信息-邮箱
     *
     * @param email 基础信息-邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取基础信息-出生日期
     *
     * @return bron_date - 基础信息-出生日期
     */
    public String getBronDate() {
        return bronDate;
    }

    /**
     * 设置基础信息-出生日期
     *
     * @param bronDate 基础信息-出生日期
     */
    public void setBronDate(String bronDate) {
        this.bronDate = bronDate;
    }

    /**
     * 获取基础信息-工作年限
     *
     * @return year_of_work - 基础信息-工作年限
     */
    public String getYearOfWork() {
        return yearOfWork;
    }

    /**
     * 设置基础信息-工作年限
     *
     * @param yearOfWork 基础信息-工作年限
     */
    public void setYearOfWork(String yearOfWork) {
        this.yearOfWork = yearOfWork;
    }

    /**
     * 获取基础信息-期望职位
     *
     * @return desired_position - 基础信息-期望职位
     */
    public String getDesiredPosition() {
        return desiredPosition;
    }

    /**
     * 设置基础信息-期望职位
     *
     * @param desiredPosition 基础信息-期望职位
     */
    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition;
    }

    /**
     * 获取基础信息-所在城市
     *
     * @return base_city - 基础信息-所在城市
     */
    public String getBaseCity() {
        return baseCity;
    }

    /**
     * 设置基础信息-所在城市
     *
     * @param baseCity 基础信息-所在城市
     */
    public void setBaseCity(String baseCity) {
        this.baseCity = baseCity;
    }

    /**
     * 获取基础信息-婚姻状态
     *
     * @return marriage - 基础信息-婚姻状态
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * 设置基础信息-婚姻状态
     *
     * @param marriage 基础信息-婚姻状态
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    /**
     * 获取求职意向-期望行业
     *
     * @return desired_industry - 求职意向-期望行业
     */
    public String getDesiredIndustry() {
        return desiredIndustry;
    }

    /**
     * 设置求职意向-期望行业
     *
     * @param desiredIndustry 求职意向-期望行业
     */
    public void setDesiredIndustry(String desiredIndustry) {
        this.desiredIndustry = desiredIndustry;
    }

    /**
     * 获取求职意向-期望职能
     *
     * @return desired_functions - 求职意向-期望职能
     */
    public String getDesiredFunctions() {
        return desiredFunctions;
    }

    /**
     * 设置求职意向-期望职能
     *
     * @param desiredFunctions 求职意向-期望职能
     */
    public void setDesiredFunctions(String desiredFunctions) {
        this.desiredFunctions = desiredFunctions;
    }

    /**
     * 获取求职意向-期望城市
     *
     * @return desired_city - 求职意向-期望城市
     */
    public String getDesiredCity() {
        return desiredCity;
    }

    /**
     * 设置求职意向-期望城市
     *
     * @param desiredCity 求职意向-期望城市
     */
    public void setDesiredCity(String desiredCity) {
        this.desiredCity = desiredCity;
    }

    /**
     * 获取求职意向-求职状态
     *
     * @return individual_state - 求职意向-求职状态
     */
    public String getIndividualState() {
        return individualState;
    }

    /**
     * 设置求职意向-求职状态
     *
     * @param individualState 求职意向-求职状态
     */
    public void setIndividualState(String individualState) {
        this.individualState = individualState;
    }

    /**
     * 获取求职意向-当前年薪
     *
     * @return current_annual_salary - 求职意向-当前年薪
     */
    public Integer getCurrentAnnualSalary() {
        return currentAnnualSalary;
    }

    /**
     * 设置求职意向-当前年薪
     *
     * @param currentAnnualSalary 求职意向-当前年薪
     */
    public void setCurrentAnnualSalary(Integer currentAnnualSalary) {
        this.currentAnnualSalary = currentAnnualSalary;
    }

    /**
     * 获取求职意向-薪资结构
     *
     * @return salary_struct - 求职意向-薪资结构
     */
    public Integer getSalaryStruct() {
        return salaryStruct;
    }

    /**
     * 设置求职意向-薪资结构
     *
     * @param salaryStruct 求职意向-薪资结构
     */
    public void setSalaryStruct(Integer salaryStruct) {
        this.salaryStruct = salaryStruct;
    }

    /**
     * 获取求职意向-期望最低年薪/万
     *
     * @return desried_annual_min - 求职意向-期望最低年薪/万
     */
    public Integer getDesriedAnnualMin() {
        return desriedAnnualMin;
    }

    /**
     * 设置求职意向-期望最低年薪/万
     *
     * @param desriedAnnualMin 求职意向-期望最低年薪/万
     */
    public void setDesriedAnnualMin(Integer desriedAnnualMin) {
        this.desriedAnnualMin = desriedAnnualMin;
    }

    /**
     * 获取求职意向-期望最高年薪/万
     *
     * @return desried_annual_max - 求职意向-期望最高年薪/万
     */
    public Integer getDesriedAnnualMax() {
        return desriedAnnualMax;
    }

    /**
     * 设置求职意向-期望最高年薪/万
     *
     * @param desriedAnnualMax 求职意向-期望最高年薪/万
     */
    public void setDesriedAnnualMax(Integer desriedAnnualMax) {
        this.desriedAnnualMax = desriedAnnualMax;
    }

    /**
     * 获取cos-简历上传路径
     *
     * @return cos_of_resume - cos-简历上传路径
     */
    public String getCosOfResume() {
        return cosOfResume;
    }

    /**
     * 设置cos-简历上传路径
     *
     * @param cosOfResume cos-简历上传路径
     */
    public void setCosOfResume(String cosOfResume) {
        this.cosOfResume = cosOfResume;
    }

    /**
     * 获取上传简历生成的唯一code
     *
     * @return resume_file_code - 上传简历生成的唯一code
     */
    public String getResumeFileCode() {
        return resumeFileCode;
    }

    /**
     * 设置上传简历生成的唯一code
     *
     * @param resumeFileCode 上传简历生成的唯一code
     */
    public void setResumeFileCode(String resumeFileCode) {
        this.resumeFileCode = resumeFileCode;
    }

    /**
     * 获取教育经历-学校名称
     *
     * @return institution_name - 教育经历-学校名称
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * 设置教育经历-学校名称
     *
     * @param institutionName 教育经历-学校名称
     */
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    /**
     * 获取教育经历-是否统招（1是0否）
     *
     * @return unified_recruitment - 教育经历-是否统招（1是0否）
     */
    public Integer getUnifiedRecruitment() {
        return unifiedRecruitment;
    }

    /**
     * 设置教育经历-是否统招（1是0否）
     *
     * @param unifiedRecruitment 教育经历-是否统招（1是0否）
     */
    public void setUnifiedRecruitment(Integer unifiedRecruitment) {
        this.unifiedRecruitment = unifiedRecruitment;
    }

    /**
     * 获取教育经历-专业名称
     *
     * @return major - 教育经历-专业名称
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置教育经历-专业名称
     *
     * @param major 教育经历-专业名称
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取教育经历-学历
     *
     * @return degree - 教育经历-学历
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置教育经历-学历
     *
     * @param degree 教育经历-学历
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取教育经历-就读时间（开始）
     *
     * @return begin_degree - 教育经历-就读时间（开始）
     */
    public String getBeginDegree() {
        return beginDegree;
    }

    /**
     * 设置教育经历-就读时间（开始）
     *
     * @param beginDegree 教育经历-就读时间（开始）
     */
    public void setBeginDegree(String beginDegree) {
        this.beginDegree = beginDegree;
    }

    /**
     * 获取教育经历-就读时间（结束）
     *
     * @return end_degree - 教育经历-就读时间（结束）
     */
    public String getEndDegree() {
        return endDegree;
    }

    /**
     * 设置教育经历-就读时间（结束）
     *
     * @param endDegree 教育经历-就读时间（结束）
     */
    public void setEndDegree(String endDegree) {
        this.endDegree = endDegree;
    }

    /**
     * 获取（1正常 0停用）
     *
     * @return status - （1正常 0停用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置（1正常 0停用）
     *
     * @param status （1正常 0停用）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建者
     *
     * @return create_user - 创建者
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建者
     *
     * @param createUser 创建者
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
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
     * 获取更新者
     *
     * @return update_user - 更新者
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新者
     *
     * @param updateUser 更新者
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
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
     * 获取求职意向-勿推企业
     *
     * @return ignore_company - 求职意向-勿推企业
     */
    public String getIgnoreCompany() {
        return ignoreCompany;
    }

    /**
     * 设置求职意向-勿推企业
     *
     * @param ignoreCompany 求职意向-勿推企业
     */
    public void setIgnoreCompany(String ignoreCompany) {
        this.ignoreCompany = ignoreCompany;
    }

    /**
     * 获取个人技能
     *
     * @return personal_skill - 个人技能
     */
    public String getPersonalSkill() {
        return personalSkill;
    }

    /**
     * 设置个人技能
     *
     * @param personalSkill 个人技能
     */
    public void setPersonalSkill(String personalSkill) {
        this.personalSkill = personalSkill;
    }

    /**
     * 获取个人荣誉证书
     *
     * @return personal_certificate - 个人荣誉证书
     */
    public String getPersonalCertificate() {
        return personalCertificate;
    }

    /**
     * 设置个人荣誉证书
     *
     * @param personalCertificate 个人荣誉证书
     */
    public void setPersonalCertificate(String personalCertificate) {
        this.personalCertificate = personalCertificate;
    }

    /**
     * 获取个人评价
     *
     * @return personal_comment - 个人评价
     */
    public String getPersonalComment() {
        return personalComment;
    }

    /**
     * 设置个人评价
     *
     * @param personalComment 个人评价
     */
    public void setPersonalComment(String personalComment) {
        this.personalComment = personalComment;
    }

    /**
     * 获取工作经历json配置
     *
     * @return work_undergoing_config - 工作经历json配置
     */
    public String getWorkUndergoingConfig() {
        return workUndergoingConfig;
    }

    /**
     * 设置工作经历json配置
     *
     * @param workUndergoingConfig 工作经历json配置
     */
    public void setWorkUndergoingConfig(String workUndergoingConfig) {
        this.workUndergoingConfig = workUndergoingConfig;
    }

    /**
     * 获取项目经验json配置
     *
     * @return project_config - 项目经验json配置
     */
    public String getProjectConfig() {
        return projectConfig;
    }

    /**
     * 设置项目经验json配置
     *
     * @param projectConfig 项目经验json配置
     */
    public void setProjectConfig(String projectConfig) {
        this.projectConfig = projectConfig;
    }
}