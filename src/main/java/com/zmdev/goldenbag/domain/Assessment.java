package com.zmdev.goldenbag.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * 考核記錄
 */
@Entity
public class Assessment {
    @CreatedDate
    private Date createdAt;

    @Id
    @GeneratedValue
    private Long id;
    @LastModifiedDate
    private Date updatedAt;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "assessment")
    private Set<AssessmentProjectScore> assessmentProjectScores;

    @OneToMany(mappedBy = "assessment")
    private Set<AssessmentInputContent> assessmentInputContents;

    @ManyToOne
    private AssessmentTemplate assessmentTemplate;
    // 間接經理審核意見
    private String indirectManagerAuditComments;
    // 直接經理評價
    private String directManagerEvaluation;

    public Date getCreatedAt() {
        return createdAt;
    }

    // 职级系数
    private Double rankCoefficient;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<AssessmentProjectScore> getAssessmentProjectScores() {
        return assessmentProjectScores;
    }

    public void setAssessmentProjectScores(Set<AssessmentProjectScore> assessmentProjectScores) {
        this.assessmentProjectScores = assessmentProjectScores;
    }

    public Set<AssessmentInputContent> getAssessmentInputContents() {
        return assessmentInputContents;
    }

    public void setAssessmentInputContents(Set<AssessmentInputContent> assessmentInputContents) {
        this.assessmentInputContents = assessmentInputContents;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDirectManagerEvaluation() {
        return directManagerEvaluation;
    }

    public AssessmentTemplate getAssessmentTemplate() {
        return assessmentTemplate;
    }

    public void setAssessmentTemplate(AssessmentTemplate assessmentTemplate) {
        this.assessmentTemplate = assessmentTemplate;
    }

    public String getIndirectManagerAuditComments() {
        return indirectManagerAuditComments;
    }

    public void setIndirectManagerAuditComments(String indirectManagerAuditComments) {
        this.indirectManagerAuditComments = indirectManagerAuditComments;
    }

    public void setDirectManagerEvaluation(String directManagerEvaluation) {
        this.directManagerEvaluation = directManagerEvaluation;
    }

    public Status getStatus() {
        return status;
    }

    public Double getRankCoefficient() {
        return rankCoefficient;
    }

    public void setRankCoefficient(Double rankCoefficient) {
        this.rankCoefficient = rankCoefficient;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        SUBMITTED, // 已提交
        DIRECT_MANAGER_EVALUATED, //直接經理已經評價
        INDIRECT_MANAGER_RECHECK, // 間接經理已經複核
        FINISHED // 已完成
    }
}
