package com.pasteleria.controller;

import com.pasteleria.domain.Pedidos;
import com.pasteleria.service.PedidosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class PrincipalController {
    @GetMapping("/principal")   
    public String getprincipalBySimplePath() {
        return "principal";
    }
}
