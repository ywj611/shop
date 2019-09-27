package cn.ywj611.shop.adminController;

import cn.ywj611.shop.entity.Category;
import cn.ywj611.shop.service.CategoryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("admin")
public class CategoryContrller {

    @Autowired
    CategoryService categoryService;

    //显示分类页面
    @GetMapping("/category")
    public String category(Model model){
        return "admin/product-category";
    }

    //获得分类数据
    @GetMapping("/getCategory")
    @ResponseBody
    public List<Category> getCategoryAll(){
        List<Category> categories = categoryService.selectAllCategory();
        return categories;
    }

    @PostMapping("/category")
    public String categoryAdd(){
        return "admin/product-category-add";
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<Category> test(){
        return categoryService.selectAllCategory();
    }

}
