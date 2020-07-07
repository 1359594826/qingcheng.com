package com.ckdl.pojo;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_category")
public class goods implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer goods_num;

    private String is_show;

    private String is_menu;

    private Integer seq;

    private Integer parent_id;
    private Integer template_id;

    public goods() {
    }

    public goods(Integer id, String name, Integer goods_num, String is_show, String is_menu, Integer seq, Integer parent_id, Integer template_id) {
        this.id = id;
        this.name = name;
        this.goods_num = goods_num;
        this.is_show = is_show;
        this.is_menu = is_menu;
        this.seq = seq;
        this.parent_id = parent_id;
        this.template_id = template_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(Integer goods_num) {
        this.goods_num = goods_num;
    }

    public String getIs_show() {
        return is_show;
    }

    public void setIs_show(String is_show) {
        this.is_show = is_show;
    }

    public String getIs_menu() {
        return is_menu;
    }

    public void setIs_menu(String is_menu) {
        this.is_menu = is_menu;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(Integer template_id) {
        this.template_id = template_id;
    }

    @Override
    public String toString() {
        return "goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", goods_num=" + goods_num +
                ", is_show='" + is_show + '\'' +
                ", is_menu='" + is_menu + '\'' +
                ", seq=" + seq +
                ", parent_id=" + parent_id +
                ", template_id=" + template_id +
                '}';
    }
}
