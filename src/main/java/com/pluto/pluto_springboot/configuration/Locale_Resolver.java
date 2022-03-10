package com.pluto.pluto_springboot.configuration;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Hoaer
 * @version 1.0
 */
public class Locale_Resolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的语言参数
        final String language = request.getParameter("language");
        Locale locale = Locale.getDefault();
        if (!(StringUtils.isEmpty(language))){
            final String[] split = language.split("-");
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
