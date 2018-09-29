package com.pdl.controller;

import com.sun.deploy.util.SessionState;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller("fileUpload")
public class FileUploadController {
    //跨服务器上传
//    @RequestMapping("/file")
//public String file(HttpServletRequest request,MultipartFile upload) throws FileUploadException, IOException {
//    //获取上传文件的目录
//    String path = "http://localhost:8090/day1/upload/";
//    //获取源上传文件名
//    String filename = upload.getOriginalFilename();
//    //获取唯一标识
//    String uuid= UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
//    //拼接字符串获取唯一文件上传名
//    filename=uuid+"_"+filename;
//    //创建客户端服务器
//        Client client = Client.create();
//        //连接图片服务器
//        WebResource resource = client.resource(path + filename);
//        resource.put(upload.getBytes());
//        return "success";
//
//    }
@RequestMapping("/file")
public String file(HttpServletRequest request,MultipartFile upload) throws FileUploadException, IOException {
    //获取上传文件的目录
    String path = request.getSession().getServletContext().getRealPath("upload");
    //创建File对象,并作为文件上传的路径
    File file = new File(path);
    //判断路径是否存在,不存在则创建该文件路径
    if (!file.exists()){
        file.mkdirs();
    }
    String absolutePath = file.getAbsolutePath();
    System.out.println(absolutePath);
    //获取源上传文件名
    String filename = upload.getOriginalFilename();
    //获取唯一标识
    String uuid= UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    //拼接字符串获取唯一文件上传名
    filename=filename+"-"+uuid;
    //上传文件
    upload.transferTo(new File(file,filename));
    return "success";
}

}
