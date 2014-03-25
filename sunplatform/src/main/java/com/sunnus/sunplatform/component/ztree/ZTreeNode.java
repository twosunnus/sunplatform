package com.sunnus.sunplatform.component.ztree;

/**
 * Created with IntelliJ IDEA.
 * 
 * @author: sunqichang
 * @Date: 14-3-18
 * @Time: 下午5:00
 */
public class ZTreeNode {

    /**
     * 节点的id
     */
    private boolean id;

    /**
     * 节点的 checkBox / radio 的 勾选状态
     */
    private boolean checked;

    /**
     * 设置节点的 checkbox / radio 是否禁用
     */
    private boolean chkDisabled;

    /**
     * 最简单的 click 事件操作。相当于 onclick="..." 的内容
     */
    private String click;

    /**
     * 强制节点的 checkBox / radio 的 半勾选状态
     */
    private boolean halfCheck;

    /**
     * 节点自定义图标的 URL 路径
     */
    private String icon;

    /**
     * 父节点自定义折叠时图标的 URL 路径。
     */
    private String iconClose;

    /**
     * 父节点自定义展开时图标的 URL 路径。
     */
    private String iconOpen;

    /**
     * 节点自定义图标的 className
     */
    private String iconSkin;

    /**
     * 判断 treeNode 节点是否被隐藏
     */
    private String isHidden;

    /**
     * 记录 treeNode 节点是否为父节点
     */
    private String isParent;

    /**
     * 节点名称。
     */
    private String name;

    /**
     * 设置节点是否隐藏 checkbox / radio [setting.check.enable = true 时有效]
     */
    private boolean nocheck;

    /**
     * 记录 treeNode 节点的 展开 / 折叠 状态。
     */
    private boolean open;

    /**
     * 设置点击节点后在何处打开 url。[treeNode.url 存在时有效]
     */
    private String targer;

    /**
     * 节点链接的目标 URL
     */
    private String url;

    /**
     * 用于保存节点的其他自定义数据信息，不要与 zTree 使用的属性相同即可，用户可随意设定。
     */
    private String diy;

    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isChkDisabled() {
        return chkDisabled;
    }

    public void setChkDisabled(boolean chkDisabled) {
        this.chkDisabled = chkDisabled;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public boolean isHalfCheck() {
        return halfCheck;
    }

    public void setHalfCheck(boolean halfCheck) {
        this.halfCheck = halfCheck;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconClose() {
        return iconClose;
    }

    public void setIconClose(String iconClose) {
        this.iconClose = iconClose;
    }

    public String getIconOpen() {
        return iconOpen;
    }

    public void setIconOpen(String iconOpen) {
        this.iconOpen = iconOpen;
    }

    public String getIconSkin() {
        return iconSkin;
    }

    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    public String getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNocheck() {
        return nocheck;
    }

    public void setNocheck(boolean nocheck) {
        this.nocheck = nocheck;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getTarger() {
        return targer;
    }

    public void setTarger(String targer) {
        this.targer = targer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDiy() {
        return diy;
    }

    public void setDiy(String diy) {
        this.diy = diy;
    }
}
