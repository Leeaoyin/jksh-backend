package com.letgee.infrastructure.utils;import com.qcloud.cos.COSClient;import com.qcloud.cos.exception.CosClientException;import com.qcloud.cos.exception.CosServiceException;import com.qcloud.cos.model.PutObjectRequest;import org.springframework.beans.factory.annotation.Value;import org.springframework.stereotype.Component;import javax.annotation.Resource;import java.io.File;import java.util.ArrayList;import java.util.List;@Componentpublic class CosUtils {//    @Value("${COS.bucketName:}")//    private  String bucketName;//    @Value("${COS.url:}")//    private  String url;//    @Value("${COS.prefix:}")//    private  String prefix;//    //    //    @Resource//    private  COSClient cosClient;    public  String uploadFile( File file){        // 指定文件上传到 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示将文件 picture.jpg 上传到 folder 路径下//        String key ="resume/" + file.getName();//        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);//        cosClient.putObject(putObjectRequest);//        return url + key;        return null;    }        public void delete(List<String> keys){//        try {//            keys.forEach(key ->cosClient.deleteObject(bucketName, key));//        } catch (CosServiceException e) {//            e.printStackTrace();//        } catch (CosClientException e) {//            e.printStackTrace();//        }    }    }