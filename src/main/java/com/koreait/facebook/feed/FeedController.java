package com.koreait.facebook.feed;

import com.koreait.facebook.common.MyConst;
import com.koreait.facebook.feed.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/feed")
public class  FeedController {

    @Autowired private FeedService feedService;
    @Autowired private MyConst myConst;

    @GetMapping("/home")
    public void home() {}

    @GetMapping("/reg")
    public void reg(FeedEntity obj) {}

    @ResponseBody
    @PostMapping("/reg")
    public Map<String, Integer> reg(MultipartFile[] imgArr, FeedEntity param) {
        Map<String, Integer> res = new HashMap();
        res.put(myConst.RESULT, feedService.reg(imgArr, param));
        return res;
    }

    @ResponseBody
    @GetMapping("/list")
    public List<FeedDomain> selFeedList() {
        return feedService.selFeedList();
    }

    @ResponseBody
    @GetMapping("/list2")
    public List<FeedDomain2> selFeedList2(FeedDTO param) {
        return feedService.selFeedList2(param);
    }

    @ResponseBody
    @GetMapping("/fav")
    public int feedFavProc(FeedFavEntity param, int type) { // type : 1 insert / type : 0 delete
        System.out.println("param : " + param);
        System.out.println("type : " + type);
        return feedService.feedFavProc(param,type);
    }

    @ResponseBody
    @PostMapping("/cmt")
    public int insFeedCmt(@RequestBody FeedCmtEntity param) {
        return feedService.insFeedCmt(param);
    }

    @ResponseBody
    @GetMapping("/cmt")
    public List<FeedCmtDomain> cmtList(FeedCmtEntity param) {
        return feedService.selFeedCmtList(param);
    }
}
