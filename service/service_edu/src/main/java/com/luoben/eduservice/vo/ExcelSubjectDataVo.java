package com.luoben.eduservice.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class ExcelSubjectDataVo {

    @ExcelProperty(index=0)
    private String oneSubjectName;  //一级分类

    @ExcelProperty(index=1)
    private String twoSubjectName;  //二级分类


}
