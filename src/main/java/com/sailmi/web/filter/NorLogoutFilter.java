package com.sailmi.web.filter;


import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import com.sailmi.sailplat.foundation.domain.SysLog;
import com.sailmi.sailplat.foundation.domain.User;
import com.sailmi.sailplat.foundation.service.ISysLogService;
import com.sailmi.sailplat.foundation.service.IUserService;
import com.sailmi.tools.CommUtil;

public class NorLogoutFilter extends LogoutFilter
{

  @Autowired
  private ISysLogService sysLogService;

  @Autowired
  private IUserService userService;

  public void saveLog(HttpServletRequest request)
  {
    HttpSession session = request.getSession(false);
    User u = (User)session.getAttribute("user");
    if (u != null) {
      User user = this.userService.getObjById(u.getId());
      user.setLastLoginDate((Date)session.getAttribute("lastLoginDate"));
      user.setLastLoginIp((String)session.getAttribute("loginIp"));
      this.userService.update(user);
      SysLog log = new SysLog();
      log.setAddTime(new Date());
      log.setContent(user.getTrueName() + "于" + 
        CommUtil.formatTime("yyyy-MM-dd HH:mm:ss", new Date()) + 
        "登录");
      log.setTitle("用户登录");
      log.setType(0);
      log.setUser(user);
      log.setIp(CommUtil.getIpAddr(request));
      this.sysLogService.save(log);
    }
  }

  public NorLogoutFilter(String logoutSuccessUrl, LogoutHandler[] handlers) {
    super(logoutSuccessUrl, handlers);
    System.out.println("NorLogoutFilter:............................");
  }

  public void doFilterHttp(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
    throws IOException, ServletException
  {
	    System.out.println("NorLogoutFilter:............................");
    if (requiresLogout(request, response)) {
      HttpSession session = request.getSession(false);
      if (session != null) {
        saveLog(request);
      }
    }
    super.doFilter(request, response, chain);
  }

  protected boolean requiresLogout(HttpServletRequest request, HttpServletResponse response)
  {
    return super.requiresLogout(request, response);
  }


  public void setFilterProcessesUrl(String filterProcessesUrl)
  {
    super.setFilterProcessesUrl(filterProcessesUrl);
  }
}