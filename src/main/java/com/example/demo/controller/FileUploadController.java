package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 文件上传 Controller
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2019/4/30 17:02
 */
@RestController
public class FileUploadController {

    /**
     * 上传单个文件
     * @param uploadFile 文件
     * @param request 请求
     * @return 文件路径
     */
    @PostMapping(path = "/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request) {

        String realPath = "E:\\Project_Zheng\\springboot-demo\\src\\main\\resources\\static\\uploadFile\\";
        String localDate = LocalDate.now().toString();

        // 根据日期创建文件路径
        File folder = new File(realPath + localDate);
        // 路径不存在时创建目录
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        // 获取原文件名
        String oldName = uploadFile.getOriginalFilename();
        // 重命名文件名
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            // 保存文件
            uploadFile.transferTo(new File(folder, newName));
            // 返回文件存储路径
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/static/uploadFile/" + localDate + "/" + newName;
            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    /**
     * 上传多个文件
     * @param uploadFiles 文件集合
     * @param request 请求
     * @return 文件路径
     */
    @PostMapping(path = "/uploads")
    public String uploads(MultipartFile[] uploadFiles, HttpServletRequest request) {

        List<String> paths = new ArrayList<>();

        // 遍历文件集合
        for (MultipartFile file : uploadFiles) {
            String filePath = upload(file, request);
            paths.add(filePath);
        }
        return paths.toString();
    }
}
