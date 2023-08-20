/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasteleria.controller;
import com.pasteleria.service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/reportes")
public class ReportesController {
  @Autowired
    ReporteService reporteService;
    
    @GetMapping("/principal")
    public String principal(Model model){
        return "/reportes/principal";
    }
     @GetMapping("/pedidos")
    public ResponseEntity<Resource> pedidos (@RequestParam String tipo) throws IOException{
        var reporte="pedidos";
        return reporteService.generareporte(reporte, null, tipo);
    }  
}
