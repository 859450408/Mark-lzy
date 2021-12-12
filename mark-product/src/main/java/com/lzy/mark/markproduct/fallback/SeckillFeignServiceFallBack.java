//package com.lzy.mark.markproduct.fallback;
//
//import com.lzy.common.exception.BizCodeEnum;
//import com.lzy.common.utils.R;
//import com.lzy.mark.markproduct.feign.SeckillFeignService;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class SeckillFeignServiceFallBack implements SeckillFeignService {
//    @Override
//    public R getSkuSeckilInfo(Long skuId) {
//        return R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(),BizCodeEnum.TO_MANY_REQUEST.getMessage());
//    }
//}
