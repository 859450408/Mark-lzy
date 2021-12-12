//package com.lzy.mark.markproduct.feign;
//
//import com.lzy.common.utils.R;
//import com.lzy.mark.markproduct.fallback.SeckillFeignServiceFallBack;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//
//@FeignClient(value = "mark-seckill",fallback = SeckillFeignServiceFallBack.class)
//public interface SeckillFeignService {
//
//    /**
//     * 根据skuId查询商品是否参加秒杀活动
//     * @param skuId
//     * @return
//     */
//    @GetMapping(value = "/sku/seckill/{skuId}")
//    R getSkuSeckilInfo(@PathVariable("skuId") Long skuId);
//
//}
