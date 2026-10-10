package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StudentInfo;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
public interface IStudentInfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public StudentInfo selectStudentInfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param studentInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<StudentInfo> selectStudentInfoList(StudentInfo studentInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param studentInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertStudentInfo(StudentInfo studentInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param studentInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateStudentInfo(StudentInfo studentInfo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteStudentInfoByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStudentInfoById(Long id);
}
