package com.lzy.mark.markproduct;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.lzy.mark.markproduct.entity.BrandEntity;
import com.lzy.mark.markproduct.entity.SpuInfoEntity;
import com.lzy.mark.markproduct.service.BrandService;
import com.lzy.mark.markproduct.service.SpuInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarkProductApplication.class)
class MarkProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("很贵");
//        brandEntity.setName("IPhone 13 pro max");
//        brandService.save(brandEntity);
//        System.out.println("success");
        brandService.updateById(brandEntity);
    }

    @Test
    void OSSTest(){
        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "LTAI5t7KmmhEaW4fSCDfTRHB";
        String accessKeySecret = "UBzFSLPUT78EfFfMl9JYmAl1orureP";
// 填写Bucket名称，例如examplebucket。
        String bucketName = "mark-lzy";
// 填写文件名。文件名包含路径，不包含Bucket名称。例如exampledir/exampleobject.txt。
        String objectName = "D:\\微信图片.jpg";

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        String content = "Hello OSS";
        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));

// 关闭OSSClient。
        ossClient.shutdown();

    }

}
