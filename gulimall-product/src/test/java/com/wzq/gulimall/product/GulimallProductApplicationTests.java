package com.wzq.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wzq.gulimall.product.entity.BrandEntity;
import com.wzq.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        //增
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("饮料");
//        brandEntity.setName("可乐");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        //改
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("雪碧");
//        brandService.updateById(brandEntity);
//        System.out.println("修改成功");

        //查
//        brandService.getById();
//        brandService.getOne();
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach((item)->{
            System.out.println(item.toString());
        });
        //删
    }
}
