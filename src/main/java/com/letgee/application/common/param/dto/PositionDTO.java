package com.letgee.application.common.param.dto;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.NoArgsConstructor;import javax.validation.constraints.NotBlank;import javax.validation.constraints.NotNull;import java.io.Serializable;@Builder@AllArgsConstructor@NoArgsConstructor@NotNull(message = "position info cannot be null")public class PositionDTO implements Serializable {    /**     * for update position     */    private Integer id;        @NotBlank(message = "position_name cannot be null")    private String position_name;    @NotBlank(message = "company_name cannot be null")    private String company_name;    @NotBlank(message = "functional_type cannot be null")    private String functional_type;    @NotNull(message = "hire_count cannot be null")    private Integer hire_count;    @NotBlank(message = "city_work cannot be null")    private String city_work;    @NotNull(message = "min_salary cannot be null")    private Integer min_salary;    @NotNull(message = "max_salary cannot be null")    private Integer max_salary;    @NotBlank(message = "education_certification cannot be null")    private String education_certification;    @NotBlank(message = "years_of_working cannot be null")    private String years_of_working;        private String position_requirements;    /**     * 任职要求     */    private String job_requirements;    /**     * 职位备注     */    private String job_remarks;    /**     * 职级名称     */    private String rank_title;    /**     * 行业信息     */    private String industry_information;    /**     * 下属人数     */    private Integer number_of_subordinates;    /**     * 院校类别     */    private String institution_category;    /**     * 目标公司     */    private String target_company;    /**     * 技能证书     */    private String  skill_certificates;    /**     * 所属部门     */    private String department;    /**     * 汇报对象     */    private String who_to_report;    /**     * 办公地址     */    private String office_address;    /**     * 部门组织架构     */    private String departmental_structure;    /**     * 面试轮次     */    private Integer interview_rounds;    /**     * 是否接受视频面试     */    @NotNull(message = "accept_video cannot be null")    private Integer accept_video;    /**     * 面试流程     */    private String interview_process;    /**     * 面试地点     */    private String interview_location;    /**     * 薪资结构     */    private String salary_structure;    /**     * 薪酬福利     */    private String benefits;        private Integer expect_salary;    public Integer getExpect_salary() {        return expect_salary;    }    public void setExpect_salary(Integer expect_salary) {        this.expect_salary = expect_salary;    }    public String getPosition_requirements() {        return position_requirements;    }    public void setPosition_requirements(String position_requirements) {        this.position_requirements = position_requirements;    }    public void setJob_remarks(String job_remarks) {        this.job_remarks = job_remarks;    }    public String getRank_title() {        return rank_title;    }    public void setRank_title(String rank_title) {        this.rank_title = rank_title;    }    public String getIndustry_information() {        return industry_information;    }    public void setIndustry_information(String industry_information) {        this.industry_information = industry_information;    }    public Integer getNumber_of_subordinates() {        return number_of_subordinates;    }    public void setNumber_of_subordinates(Integer number_of_subordinates) {        this.number_of_subordinates = number_of_subordinates;    }    public String getInstitution_category() {        return institution_category;    }    public void setInstitution_category(String institution_category) {        this.institution_category = institution_category;    }    public String getTarget_company() {        return target_company;    }    public void setTarget_company(String target_company) {        this.target_company = target_company;    }    public String getSkill_certificates() {        return skill_certificates;    }    public void setSkill_certificates(String skill_certificates) {        this.skill_certificates = skill_certificates;    }    public String getDepartment() {        return department;    }    public void setDepartment(String department) {        this.department = department;    }    public String getWho_to_report() {        return who_to_report;    }    public void setWho_to_report(String who_to_report) {        this.who_to_report = who_to_report;    }    public String getOffice_address() {        return office_address;    }    public void setOffice_address(String office_address) {        this.office_address = office_address;    }    public String getDepartmental_structure() {        return departmental_structure;    }    public void setDepartmental_structure(String departmental_structure) {        this.departmental_structure = departmental_structure;    }    public Integer getInterview_rounds() {        return interview_rounds;    }    public void setInterview_rounds(Integer interview_rounds) {        this.interview_rounds = interview_rounds;    }    public Integer getAccept_video() {        return accept_video;    }    public void setAccept_video(Integer accept_video) {        this.accept_video = accept_video;    }    public String getInterview_process() {        return interview_process;    }    public void setInterview_process(String interview_process) {        this.interview_process = interview_process;    }    public String getInterview_location() {        return interview_location;    }    public void setInterview_location(String interview_location) {        this.interview_location = interview_location;    }    public String getSalary_structure() {        return salary_structure;    }    public void setSalary_structure(String salary_structure) {        this.salary_structure = salary_structure;    }    public String getBenefits() {        return benefits;    }    public void setBenefits(String benefits) {        this.benefits = benefits;    }    public Integer getId() {        return id;    }    public void setId(Integer id) {        this.id = id;    }    public String getPosition_name() {        return position_name;    }    public void setPosition_name(String position_name) {        this.position_name = position_name;    }    public String getCompany_name() {        return company_name;    }    public void setCompany_name(String company_name) {        this.company_name = company_name;    }    public String getFunctional_type() {        return functional_type;    }    public void setFunctional_type(String functional_type) {        this.functional_type = functional_type;    }    public Integer getHire_count() {        return hire_count;    }    public void setHire_count(Integer hire_count) {        this.hire_count = hire_count;    }    public String getCity_work() {        return city_work;    }    public void setCity_work(String city_work) {        this.city_work = city_work;    }    public Integer getMin_salary() {        return min_salary;    }    public void setMin_salary(Integer min_salary) {        this.min_salary = min_salary;    }    public Integer getMax_salary() {        return max_salary;    }    public void setMax_salary(Integer max_salary) {        this.max_salary = max_salary;    }    public String getEducation_certification() {        return education_certification;    }    public void setEducation_certification(String education_certification) {        this.education_certification = education_certification;    }    public String getYears_of_working() {        return years_of_working;    }    public void setYears_of_working(String years_of_working) {        this.years_of_working = years_of_working;    }        public String getJob_requirements() {        return job_requirements;    }    public void setJob_requirements(String job_requirements) {        this.job_requirements = job_requirements;    }    public String getJob_remarks() {        return job_remarks;    }    public void setJob_description(String job_remarks) {        this.job_remarks = job_remarks;    }        }