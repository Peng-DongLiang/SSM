package com.pdl.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//获取浏览器输入的日期,转化为Date数据类型
public class StringToDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        //获取的值不能为空
        if (source==null){
            throw new RuntimeException("参数不能为空");
        }
        try {
            //转化固定格式的日期
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //将获取的值进行数据类型转换
            Date date = format.parse(source);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换错误");
        }
    }
}
