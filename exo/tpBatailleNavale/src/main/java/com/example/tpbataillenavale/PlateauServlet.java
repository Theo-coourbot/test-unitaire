package com.example.tpbataillenavale;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.tpbataillenavale.entity.Case;
import com.example.tpbataillenavale.service.PlateauService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import static com.example.tpbataillenavale.util.Definition.VIEW_PATH;

@WebServlet(name = "plateauServlet", value = "/")
public class PlateauServlet extends HttpServlet {


    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PlateauService plateauService = new PlateauService();
        List<Case> plateauPlayerOne = new ArrayList<>();
        plateauPlayerOne= plateauService.createGame();
        request.setAttribute("plateauPlayerOne",plateauPlayerOne);
        request.getRequestDispatcher(VIEW_PATH + "/plateau.jsp").forward(request, response);



    }

    public void destroy() {
    }
}