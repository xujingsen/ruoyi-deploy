package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudentSignMapper;
import com.ruoyi.system.domain.StudentSign;
import com.ruoyi.system.service.IStudentSignService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
@Service
public class StudentSignServiceImpl implements IStudentSignService 
{
    @Autowired
    private StudentSignMapper studentSignMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public StudentSign selectStudentSignById(Long id)
    {
        return studentSignMapper.selectStudentSignById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param studentSign 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<StudentSign> selectStudentSignList(StudentSign studentSign)
    {
        return studentSignMapper.selectStudentSignList(studentSign);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param studentSign 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStudentSign(StudentSign studentSign)
    {
        studentSign.setCreateTime(DateUtils.getNowDate());
        return studentSignMapper.insertStudentSign(studentSign);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param studentSign 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStudentSign(StudentSign studentSign)
    {
        studentSign.setUpdateTime(DateUtils.getNowDate());
        return studentSignMapper.updateStudentSign(studentSign);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStudentSignByIds(Long[] ids)
    {
        return studentSignMapper.deleteStudentSignByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStudentSignById(Long id)
    {
        return studentSignMapper.deleteStudentSignById(id);
    }
}
