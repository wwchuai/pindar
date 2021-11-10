package com.hnguigu.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnguigu.domain.CacheLine;
import com.hnguigu.service.CacheLineService;
import com.hnguigu.mapper.CacheLineMapper;
import org.springframework.stereotype.Service;

/**
* @author hua
* @description 针对表【pd_cache_line(缓冲路线表)】的数据库操作Service实现
* @createDate 2021-11-09 20:02:11
*/
@Service
public class CacheLineServiceImpl extends ServiceImpl<CacheLineMapper, CacheLine>
    implements CacheLineService{

}




