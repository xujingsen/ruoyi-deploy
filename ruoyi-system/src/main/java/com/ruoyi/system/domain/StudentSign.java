package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 student_sign
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
public class StudentSign extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 学号 */
    @Excel(name = "学号")
    private Long stuNum;

    /** 班级 */
    @Excel(name = "班级")
    private Long grade;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 上课日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上课日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date classDate;

    /** 上课时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date classTime;

    /** 实际到教室时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际到教室时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualTime;

    /** 迟到多少分钟 */
    @Excel(name = "迟到多少分钟")
    private Long lateMinute;

    /** 迟到等级 */
    @Excel(name = "迟到等级")
    private String lateLevel;

    /** 课程 */
    @Excel(name = "课程")
    private String course;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setStuNum(Long stuNum) 
    {
        this.stuNum = stuNum;
    }

    public Long getStuNum() 
    {
        return stuNum;
    }

    public void setGrade(Long grade) 
    {
        this.grade = grade;
    }

    public Long getGrade() 
    {
        return grade;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setClassDate(Date classDate) 
    {
        this.classDate = classDate;
    }

    public Date getClassDate() 
    {
        return classDate;
    }

    public void setClassTime(Date classTime) 
    {
        this.classTime = classTime;
    }

    public Date getClassTime() 
    {
        return classTime;
    }

    public void setActualTime(Date actualTime) 
    {
        this.actualTime = actualTime;
    }

    public Date getActualTime() 
    {
        return actualTime;
    }

    public void setLateMinute(Long lateMinute) 
    {
        this.lateMinute = lateMinute;
    }

    public Long getLateMinute() 
    {
        return lateMinute;
    }

    public void setLateLevel(String lateLevel) 
    {
        this.lateLevel = lateLevel;
    }

    public String getLateLevel() 
    {
        return lateLevel;
    }

    public void setCourse(String course) 
    {
        this.course = course;
    }

    public String getCourse() 
    {
        return course;
    }

    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuNum", getStuNum())
            .append("grade", getGrade())
            .append("name", getName())
            .append("classDate", getClassDate())
            .append("classTime", getClassTime())
            .append("actualTime", getActualTime())
            .append("lateMinute", getLateMinute())
            .append("lateLevel", getLateLevel())
            .append("course", getCourse())
            .append("createdBy", getCreatedBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
