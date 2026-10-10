package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StudentSign;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-11
 */
public interface StudentSignMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public StudentSign selectStudentSignById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param studentSign 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<StudentSign> selectStudentSignList(StudentSign studentSign);

    /**
     * 新增【请填写功能名称】
     * 
     * @param studentSign 【请填写功能名称】
     * @return 结果
     */
    public int insertStudentSign(StudentSign studentSign);

    /**
     * 修改【请填写功能名称】
     * 
     * @param studentSign 【请填写功能名称】
     * @return 结果
     */
    public int updateStudentSign(StudentSign studentSign);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStudentSignById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentSignByIds(Long[] ids);
}
