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

  

}
