package com.cibertec.appwebfragments.controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/reporte")
public class ReporteController {
    @GetMapping("/resultado")
    public String index(){
        return "almacen/reporte";
    }
}
