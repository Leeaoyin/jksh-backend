package com.letgee.application.common.param.vo;


import com.letgee.infrastructure.repository.po.RhResume;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PositionVO {
    /**
     * id of the position
     */
    private Integer id;
    /**
     * name of the position
     */
    private String position_name;
    /**
     * name of the company
     */
    private String company_name;
    /**
     * 职能分类
     */
    private String functional_type;
    /**
     * 招聘人数
     */
    private Integer hire_count;
    /**
     * 工作城市
     */
    private String city_work;
    /**
     * 最低薪资
     */
    private Integer min_salary;
    /**
     * 最高薪资
     */
    private Integer max_salary;
    /**
     * 学历要求
     */
    private String education_certification;
    /**
     * 工作年限
     */
    private String years_of_working;
    /**
     * 职位状态 1-启用 0禁用
     */
    private Integer status;
    /**
     *  岗位职责
     */
    private String position_requirements;
    /**
     * 任职要求
     */
    private String job_requirements;
    /**
     * 职位备注
     */
    private String job_remarks;

    /**
     * 职级名称
     */
    private String rank_title;
    /**
     * 行业信息
     */
    private String industry_information;
    /**
     * 下属人数
     */
    private Integer number_of_subordinates;
    /**
     * 院校类别
     */
    private String institution_category;
    /**
     * 目标公司
     */
    private String target_company;
    /**
     * 技能证书
     */
    private String  skill_certificates;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 汇报对象
     */
    private String who_to_report;
    /**
     * 办公地址
     */
    private String office_address;
    /**
     * 部门组织架构
     */
    private String departmental_structure;
    /**
     * 面试轮次
     */
    private Integer interview_rounds;
    /**
     * 是否接受视频面试
     */
    private Integer accept_video;
    /**
     * 面试流程
     */
    private String interview_process;
    /**
     * 面试地点
     */
    private String interview_location;
    /**
     * 薪资结构
     */
    private String salary_structure;
    /**
     * 薪酬福利
     */
    private String benefits;
    
    private Integer ordered_count;
    
    private Date create_time;

    /**
     * 预计佣金
     */
    private Integer expect_salary;

    /**
     * 绑定的简历
     */
    private List<ResumeVO> resume_list;
}
