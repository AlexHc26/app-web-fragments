package com.cibertec.appwebfragments.controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/proveedor")
public class ProveedorController {
    @GetMapping("/logro")
    public String index(){
        return "almacen/proveedor";
    }
}
