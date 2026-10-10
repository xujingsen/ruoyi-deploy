package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 student_info
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
public class StudentInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 班级 */
    @Excel(name = "班级")
    private Long grade;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 学号 */
    @Excel(name = "学号")
    private Long stuNum;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private Long phone;

    /** 爱好 */
    @Excel(name = "爱好")
    private String hobby;

    /** 理想 */
    @Excel(name = "理想")
    private String ideal;

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

    public void setStuNum(Long stuNum) 
    {
        this.stuNum = stuNum;
    }

    public Long getStuNum() 
    {
        return stuNum;
    }

    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }

    public void setPhone(Long phone) 
    {
        this.phone = phone;
    }

    public Long getPhone() 
    {
        return phone;
    }

    public void setHobby(String hobby) 
    {
        this.hobby = hobby;
    }

    public String getHobby() 
    {
        return hobby;
    }

    public void setIdeal(String ideal) 
    {
        this.ideal = ideal;
    }

    public String getIdeal() 
    {
        return ideal;
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
            .append("grade", getGrade())
            .append("name", getName())
            .append("stuNum", getStuNum())
            .append("sex", getSex())
            .append("phone", getPhone())
            .append("hobby", getHobby())
            .append("ideal", getIdeal())
            .append("createdBy", getCreatedBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
