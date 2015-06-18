package com.songda.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by tangld on 2015/6/18.
 */
@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "userid")
    private int userid;
    @Column(name = "alias")
    private String alias;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "passwd")
    private String passwd;
    @Column(name = "url")
    private String url;
    @Column(name = "autologin")
    private int autologin;
    @Column(name = "autologout")
    private int autologout;
    @Column(name = "lang")
    private String lang;
    @Column(name = "refresh")
    private int refresh;
    @Column(name = "type")
    private int type;
    @Column(name = "theme")
    private String theme;
    @Column(name = "attempt_failed")
    private int attempt_failed;
    @Column(name = "attempt_ip")
    private String attempt_ip;
    @Column(name = "attempt_clock")
    private int attempt_clock;
    @Column(name = "rows_per_page")
    private int rows_per_page;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAutologin() {
        return autologin;
    }

    public void setAutologin(int autologin) {
        this.autologin = autologin;
    }

    public int getAutologout() {
        return autologout;
    }

    public void setAutologout(int autologout) {
        this.autologout = autologout;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getAttempt_failed() {
        return attempt_failed;
    }

    public void setAttempt_failed(int attempt_failed) {
        this.attempt_failed = attempt_failed;
    }

    public String getAttempt_ip() {
        return attempt_ip;
    }

    public void setAttempt_ip(String attempt_ip) {
        this.attempt_ip = attempt_ip;
    }

    public int getAttempt_clock() {
        return attempt_clock;
    }

    public void setAttempt_clock(int attempt_clock) {
        this.attempt_clock = attempt_clock;
    }

    public int getRows_per_page() {
        return rows_per_page;
    }

    public void setRows_per_page(int rows_per_page) {
        this.rows_per_page = rows_per_page;
    }
}
