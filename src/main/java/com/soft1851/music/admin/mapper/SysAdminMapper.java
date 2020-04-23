package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.music.admin.entity.SysAdmin;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yjy
 * @since 2020-04-21
 */
public interface SysAdminMapper extends BaseMapper<SysAdmin> {
    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    SysAdmin selectByName(String name);

}
