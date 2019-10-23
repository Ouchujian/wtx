package com.service.impl;

import com.entity.Activity;
import com.mapper.ActivityMapper;
import com.service.IActivityService;
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
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

}
