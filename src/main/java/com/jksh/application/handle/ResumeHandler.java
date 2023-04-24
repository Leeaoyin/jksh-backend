package com.jksh.application.handle;import com.jksh.application.common.param.dto.ResumeDTO;import com.jksh.application.common.param.vo.ResumeVO;import com.jksh.infrastructure.repository.po.RhResume;import java.text.SimpleDateFormat;import java.util.Date;public class ResumeHandler {    /**     * cosOfResume resumeFileCode status createUser createTime updateUser     * @param resumeDTO     * @return     */    public static RhResume convertDTO2PO(ResumeDTO resumeDTO){        RhResume rhResume = new RhResume();        rhResume.setId(resumeDTO.getId());        rhResume.setName(resumeDTO.getName().trim());        rhResume.setSex(resumeDTO.getSex());        rhResume.setPhone(resumeDTO.getPhone().trim());        rhResume.setEmail(resumeDTO.getEmail().trim());        rhResume.setBronDate(resumeDTO.getBron_date());        rhResume.setYearOfWork(resumeDTO.getYear_of_work());        rhResume.setDesiredPosition(resumeDTO.getDesired_position());        rhResume.setBaseCity(resumeDTO.getBase_city());        rhResume.setMarriage(resumeDTO.getMarriage());        rhResume.setDesiredIndustry(resumeDTO.getDesired_industry());        rhResume.setDesiredFunctions(resumeDTO.getDesired_functions());        rhResume.setDesiredCity(resumeDTO.getDesired_city());        rhResume.setIndividualState(resumeDTO.getIndividual_state());        rhResume.setCurrentAnnualSalary(resumeDTO.getCurrent_annual_salary());        rhResume.setSalaryStruct(resumeDTO.getSalary_struct());        rhResume.setDesriedAnnualMin(resumeDTO.getDesried_annual_min());        rhResume.setDesriedAnnualMax(resumeDTO.getDesried_annual_max());        rhResume.setIgnoreCompany(resumeDTO.getIgnore_company());        rhResume.setPersonalSkill(resumeDTO.getPersonal_skill());        rhResume.setPersonalComment(resumeDTO.getPersonal_comment());        rhResume.setWorkUndergoingConfig(resumeDTO.getWork_undergoing_config());        rhResume.setProjectConfig(resumeDTO.getProject_config());        rhResume.setInstitutionName(resumeDTO.getInstitution_name());        rhResume.setUnifiedRecruitment(resumeDTO.getUnified_recruitment());        rhResume.setMajor(resumeDTO.getMajor());        rhResume.setDegree(resumeDTO.getDegree());        rhResume.setBeginDegree(resumeDTO.getBegin_degree());        rhResume.setEndDegree(resumeDTO.getEnd_degree());        return rhResume;    }        public static ResumeVO convertPO2VO(RhResume rhResume){        return ResumeVO.builder()                .id(rhResume.getId())                .name(rhResume.getName())                .sex(rhResume.getSex())                .phone(rhResume.getPhone())                .email(rhResume.getEmail())                .bron_date(rhResume.getBronDate())                .year_of_work(rhResume.getYearOfWork())                .desired_position(rhResume.getDesiredPosition())                .base_city(rhResume.getBaseCity())                .marriage(rhResume.getMarriage())                .desired_industry(rhResume.getDesiredIndustry())                .desired_functions(rhResume.getDesiredFunctions())                .desired_city(rhResume.getDesiredCity())                .individual_state(rhResume.getIndividualState())                .current_annual_salary(rhResume.getCurrentAnnualSalary())                .salary_struct(rhResume.getSalaryStruct())                .desried_annual_min(rhResume.getDesriedAnnualMin())                .desried_annual_max(rhResume.getDesriedAnnualMax())                .ignore_company(rhResume.getIgnoreCompany())                .cos_of_resume(rhResume.getCosOfResume())                .personal_skill(rhResume.getPersonalSkill())                .personal_comment(rhResume.getPersonalComment())                .personal_certificate(rhResume.getPersonalCertificate())                .work_undergoing_config(rhResume.getWorkUndergoingConfig())                .project_config(rhResume.getProjectConfig())                .institution_name(rhResume.getInstitutionName())                .unified_recruitment(rhResume.getUnifiedRecruitment())                .major(rhResume.getMajor())                .degree(rhResume.getDegree())                .begin_degree(rhResume.getBeginDegree())                .end_degree(rhResume.getEndDegree())                .create_time(getDateString(rhResume.getCreateTime()))                .update_time(getDateString(rhResume.getUpdateTime()))                .build();    }        private static String getDateString(Date date){//        DateFormat instance = DateFormat.getInstance();        SimpleDateFormat instance = new SimpleDateFormat("yyyy-MM-dd");        return instance.format(date);            }    }