package com.byteblogs.helloblog.posts.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;
import us.codecraft.webmagic.model.annotation.ExtractBy;

import java.util.List;

/**
 * @author: zsg
 * @description:
 * @date: 2019/8/3 13:15
 * @modified:
 */

@Data
@Accessors(chain = true)
public class SegmentFaultVO {

    @ExtractBy("//*[@id='articleTitle']/a/text()")
    private String title;

    @ExtractBy("/html/body/div[3]/div[2]/div/div[1]/div[3]//*")
    private List<String> content;

}
