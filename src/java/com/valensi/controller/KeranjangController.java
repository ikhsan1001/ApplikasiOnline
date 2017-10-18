/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Produk;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/isiKeranjang") // ini url nya
public class KeranjangController {

    @RequestMapping
    public String isiKeranjang() {
        return "keranjang";
    }

    @RequestMapping(value = "/hapus/{id}")
    public String isiKeranjang(HttpSession session, @PathVariable("id") Integer id) {
        List<Produk> list = (List<Produk>) session.getAttribute("keranjang");
        int penampung = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                penampung = i;
            }
        }
        list.remove(penampung);
        return "pindahkanKeKeranjang";
    }
}
