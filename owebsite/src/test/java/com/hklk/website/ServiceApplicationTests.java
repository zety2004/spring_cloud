package com.hklk.website;

import com.hklk.website.cache.RedisCache;
import com.hklk.website.entity.table.Content;
import com.hklk.website.entity.vo.MenuVo;
import com.hklk.website.entity.vo.PageTableForm;
import com.hklk.website.entity.vo.RolePage;
import com.hklk.website.entity.vo.SearchVo;
import com.hklk.website.service.ContentService;
import com.hklk.website.service.MenuService;
import com.hklk.website.service.OpPersonService;
import com.hklk.website.service.TurnImageService;
import com.hklk.website.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(value = false)
@Transactional(transactionManager = "transactionManager")
public class ServiceApplicationTests {
    @Autowired
    MenuService menuService;
    @Autowired
    TurnImageService turnImageService;
    @Autowired
    ContentService contentService;
    @Autowired
    OpPersonService opPersonService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getMenuList() {
        List roles = new ArrayList();
        roles.add(2);
        roles.add(3);
        List<MenuVo> menuVos = menuService.queryMenuListForOss(roles);
        System.out.println(menuVos);
    }

    @Test
    public void getTurnImage() {
        List<Map<String, Object>> menuVos = turnImageService.queryTurnImageByStatus(1);
        System.out.println(menuVos);
    }

    @Test
    public void queryContentList() {
        List categoryList = new ArrayList();
        categoryList.add(1);
        categoryList.add(2);
        PageTableForm<Map<String, Object>> menuVos = contentService.queryContentList(1, null, 1, categoryList, 1, 10);
        System.out.println(menuVos);
    }

    @Test
    public void addContent() {
        Content content = new Content();
        content.setCategory(1);
        content.setContent("我是谁".getBytes());
        content.setTitle("12341234像首歌");
        content.setTwoMenuId(1);
        int result = contentService.insertSelective(content);
        System.out.println(result);
    }

    @Test
    public void getRolePage() {
        List<RolePage> result = opPersonService.queryRoleForPage();
        System.out.println(result);
    }

    @Test
    public void getSearchVo() {
        List<SearchVo> result = contentService.searchContentList("我");
        System.out.println(JsonUtil.toJson(result));
    }

    @Test
    public void removeCache() {
        RedisCache.remove("userToken:6b897743c5ec4ebf");
    }
}
