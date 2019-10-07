package com.company.project.web.search;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.company.project.common.HttpUtils;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping(value = "/mini")
public class SearchController {


    @GetMapping("/search")
    public Result getSearch(@RequestParam String vname) throws UnsupportedEncodingException {
        vname = URLEncoder.encode(vname, "UTF-8");
        String Url = "http://vodapp.360anquan.stream/vodsearch/?vname=" + vname;
        String data = HttpUtils.Get(Url);
        //System.out.println(data);
        JSONArray json = JSONArray.parseArray(data);
        return ResultGenerator.genSuccessResult(json);
    }

    @GetMapping("/get_info")
    public Result getInfo(@RequestParam Integer vid) {
        String Url = "http://vodapp.360anquan.stream/vodvidinfo/?vid=" + vid;
        String data = HttpUtils.Get(Url);
        //System.out.println(data);
        JSONObject json = JSONObject.parseObject(data);
        return ResultGenerator.genSuccessResult(json);
    }

    @GetMapping("/get_all")
    public Result getInfoAll(@RequestParam String abc) {
        String Url = "http://vodapp.360anquan.stream/vodtypeall?abc="+abc;
        String data = HttpUtils.Get(Url);
        //System.out.println(data);
        JSONObject json = JSONObject.parseObject(data);
        return ResultGenerator.genSuccessResult(json);
    }
}
