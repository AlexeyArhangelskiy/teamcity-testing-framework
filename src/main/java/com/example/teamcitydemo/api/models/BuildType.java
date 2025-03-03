package com.example.teamcitydemo.api.models;

import com.example.teamcitydemo.api.annotations.Optional;
import com.example.teamcitydemo.api.annotations.Parameterizable;
import com.example.teamcitydemo.api.annotations.Random;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuildType extends BaseModel {
    private String id;
    private String name;
    private Project project;
    private Steps steps;
}
