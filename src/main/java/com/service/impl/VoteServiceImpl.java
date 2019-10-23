package com.service.impl;

import com.entity.Vote;
import com.mapper.VoteMapper;
import com.service.IVoteService;
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
public class VoteServiceImpl extends ServiceImpl<VoteMapper, Vote> implements IVoteService {

}
