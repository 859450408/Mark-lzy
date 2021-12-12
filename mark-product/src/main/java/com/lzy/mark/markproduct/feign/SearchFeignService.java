//package com.lzy.mark.markproduct.feign;
//
//import com.lzy.common.es.SkuEsModel;
//import com.lzy.common.utils.R;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//
//
//@FeignClient("mark-search")
//public interface SearchFeignService {
//
//    @PostMapping(value = "/search/save/product")
//    public R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels);
//
//}
