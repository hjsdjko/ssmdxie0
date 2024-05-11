package com.dao;

import com.entity.ZixiushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixiushiVO;
import com.entity.view.ZixiushiView;


/**
 * 自修室
 * 
 * @author 
 * @email 
 * @date 2021-04-21 21:53:16
 */
public interface ZixiushiDao extends BaseMapper<ZixiushiEntity> {
	
	List<ZixiushiVO> selectListVO(@Param("ew") Wrapper<ZixiushiEntity> wrapper);
	
	ZixiushiVO selectVO(@Param("ew") Wrapper<ZixiushiEntity> wrapper);
	
	List<ZixiushiView> selectListView(@Param("ew") Wrapper<ZixiushiEntity> wrapper);

	List<ZixiushiView> selectListView(Pagination page,@Param("ew") Wrapper<ZixiushiEntity> wrapper);
	
	ZixiushiView selectView(@Param("ew") Wrapper<ZixiushiEntity> wrapper);
	
}
