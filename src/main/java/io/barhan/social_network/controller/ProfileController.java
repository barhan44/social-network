package io.barhan.social_network.controller;

import io.barhan.social_network.service.NameService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private final NameService nameService;

    @Autowired
    public ProfileController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("")
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("name");
        if (StringUtils.isNotBlank(param)) {
            request.setAttribute("name", this.nameService.convertName(param));
        }
        request.getRequestDispatcher("/WEB-INF/JSP/profile.jsp").forward(request, response);
    }
}
