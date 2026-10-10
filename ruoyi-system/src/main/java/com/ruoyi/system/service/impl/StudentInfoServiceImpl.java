package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudentInfoMapper;
import com.ruoyi.system.domain.StudentInfo;
import com.ruoyi.system.service.IStudentInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
@Service
public class StudentInfoServiceImpl implements IStudentInfoService 
{
    @Autowired
    private StudentInfoMapper studentInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public StudentInfo selectStudentInfoById(Long id)
    {
        return studentInfoMapper.selectStudentInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param studentInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<StudentInfo> selectStudentInfoList(StudentInfo studentInfo)
    {
        return studentInfoMapper.selectStudentInfoList(studentInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param studentInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStudentInfo(StudentInfo studentInfo)
    {
        studentInfo.setCreateTime(DateUtils.getNowDate());
        return studentInfoMapper.insertStudentInfo(studentInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param studentInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStudentInfo(StudentInfo studentInfo)
    {
        studentInfo.setUpdateTime(DateUtils.getNowDate());
        return studentInfoMapper.updateStudentInfo(studentInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStudentInfoByIds(Long[] ids)
    {
        return studentInfoMapper.deleteStudentInfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStudentInfoById(Long id)
    {
        return studentInfoMapper.deleteStudentInfoById(id);
    }
}
