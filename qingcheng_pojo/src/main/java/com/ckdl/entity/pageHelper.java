package com.ckdl.entity;

import java.io.Serializable;
import java.util.List;

public class pageHelper<T> implements Serializable {
    public Long page; //页数
    public List<T> size;  //每页所显示的记录数

    public pageHelper(Long page, List<T> size) {
        this.page = page;
        this.size = size;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public List<T> getSize() {
        return size;
    }

    public void setSize(List<T> size) {
        this.size = size;
    }
}
