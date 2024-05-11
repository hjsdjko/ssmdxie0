package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixiushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixiushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixiushiView;


/**
 * 自修室
 *
 * @author 
 * @email 
 * @date 2021-04-21 21:53:16
 */
public interface ZixiushiService extends IService<ZixiushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixiushiVO> selectListVO(Wrapper<ZixiushiEntity> wrapper);
   	
   	ZixiushiVO selectVO(@Param("ew") Wrapper<ZixiushiEntity> wrapper);
   	
   	List<ZixiushiView> selectListView(Wrapper<ZixiushiEntity> wrapper);
   	
   	ZixiushiView selectView(@Param("ew") Wrapper<ZixiushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixiushiEntity> wrapper);
   	
}

