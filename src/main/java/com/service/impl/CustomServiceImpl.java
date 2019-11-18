package com.service.impl;

import com.entity.Custom;
import com.mapper.CustomMapper;
import com.service.CustomService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ouchujian
 * @since 2019-10-23
 */
@Service
public class CustomServiceImpl extends ServiceImpl<CustomMapper, Custom> implements CustomService {

}
