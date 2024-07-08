package com.ruoyi.project.domain;

import lombok.*;

@Builder
@Data
public class ProjectInfo {

    private String id;
    private String project_type;
    private String project_code;
    private String project_name;
    private String single_evaluation_cycle;
    private String build_start_time;
    private String build_end_time;
    private String eval_start_time;
    private String eval_end_time;
    private String create_time;
    private String update_time;
    private String delete_time;


}