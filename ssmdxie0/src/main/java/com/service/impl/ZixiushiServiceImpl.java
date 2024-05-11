package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZixiushiDao;
import com.entity.ZixiushiEntity;
import com.service.ZixiushiService;
import com.entity.vo.ZixiushiVO;
import com.entity.view.ZixiushiView;

@Service("zixiushiService")
public class ZixiushiServiceImpl extends ServiceImpl<ZixiushiDao, ZixiushiEntity> implements ZixiushiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixiushiEntity> page = this.selectPage(
                new Query<ZixiushiEntity>(params).getPage(),
                new EntityWrapper<ZixiushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixiushiEntity> wrapper) {
		  Page<ZixiushiView> page =new Query<ZixiushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixiushiVO> selectListVO(Wrapper<ZixiushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixiushiVO selectVO(Wrapper<ZixiushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixiushiView> selectListView(Wrapper<ZixiushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixiushiView selectView(Wrapper<ZixiushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
