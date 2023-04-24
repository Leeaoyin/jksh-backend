package com.jksh.application.handle;import com.jksh.application.common.param.dto.PositionDTO;import com.jksh.application.common.param.vo.PositionVO;import com.jksh.infrastructure.repository.po.RhPosition;public class PositionHandler {    public static RhPosition convertDTO2PO(PositionDTO positionDTO){        RhPosition rhPosition = new RhPosition();        rhPosition.setPostionName(positionDTO.getPosition_name().trim());        rhPosition.setCompanyName(positionDTO.getCompany_name().trim());        rhPosition.setFunctionalType(positionDTO.getFunctional_type());        rhPosition.setCityWork(positionDTO.getCity_work());        rhPosition.setHireCount(positionDTO.getHire_count());        rhPosition.setMinSalary(positionDTO.getMin_salary());        rhPosition.setMaxSalary(positionDTO.getMax_salary());        rhPosition.setEducationCertification(positionDTO.getEducation_certification());        rhPosition.setYearsOfWorking(positionDTO.getYears_of_working());        rhPosition.setJobRequirements(positionDTO.getJob_requirements());        rhPosition.setJobRemarks(positionDTO.getJob_remarks());        rhPosition.setPositionRequirements(positionDTO.getPosition_requirements());        rhPosition.setRankTitle(positionDTO.getRank_title());        rhPosition.setIndustryInformation(positionDTO.getIndustry_information());        rhPosition.setNumberOfSubordinates(positionDTO.getNumber_of_subordinates());        rhPosition.setInstitutionCategory(positionDTO.getInstitution_category());        rhPosition.setTargetCompany(positionDTO.getTarget_company().trim());        rhPosition.setSkillCertificates(positionDTO.getSkill_certificates());        rhPosition.setDepartment(positionDTO.getDepartment());        rhPosition.setWhoToReport(positionDTO.getWho_to_report());        rhPosition.setOfficeAddress(positionDTO.getOffice_address());        rhPosition.setDepartmentalStructure(positionDTO.getDepartmental_structure());        rhPosition.setInterviewRounds(positionDTO.getInterview_rounds());        rhPosition.setInterviewProcess(positionDTO.getInterview_process());        rhPosition.setAcceptVideo(positionDTO.getAccept_video());        rhPosition.setInterviewLocation(positionDTO.getInterview_location());        rhPosition.setSalaryStructure(positionDTO.getSalary_structure());        rhPosition.setBenefits(positionDTO.getBenefits());        rhPosition.setExpectSalary(positionDTO.getExpect_salary());        return rhPosition;            }    //need to change    public static PositionVO convertPO2VO(RhPosition rhPosition){        return PositionVO.builder()                .id(rhPosition.getId())                .position_name(rhPosition.getPostionName())                .company_name(rhPosition.getCompanyName())                .city_work(rhPosition.getCityWork())                .functional_type(rhPosition.getFunctionalType())                .hire_count(rhPosition.getHireCount())                .ordered_count(rhPosition.getOrderCount())                .job_remarks(rhPosition.getJobRemarks())                .max_salary(rhPosition.getMaxSalary())                .min_salary(rhPosition.getMinSalary())                .position_requirements(rhPosition.getPositionRequirements())                .job_requirements(rhPosition.getJobRequirements())                .status(rhPosition.getStatus())                .education_certification(rhPosition.getEducationCertification())                .years_of_working(rhPosition.getYearsOfWorking())                .industry_information(rhPosition.getIndustryInformation())                .rank_title(rhPosition.getRankTitle())                .number_of_subordinates(rhPosition.getNumberOfSubordinates())                .target_company(rhPosition.getTargetCompany())                .skill_certificates(rhPosition.getSkillCertificates())                .department(rhPosition.getDepartment())                .who_to_report(rhPosition.getWhoToReport())                .office_address(rhPosition.getOfficeAddress())                .departmental_structure(rhPosition.getDepartmentalStructure())                .interview_rounds(rhPosition.getInterviewRounds())                .accept_video(rhPosition.getAcceptVideo())                .interview_process(rhPosition.getInterviewProcess())                .interview_location(rhPosition.getInterviewLocation())                .salary_structure(rhPosition.getSalaryStructure())                .benefits(rhPosition.getBenefits())                .create_time(rhPosition.getCreateTime())                .expect_salary(rhPosition.getExpectSalary())                .build();    }}