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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/detail") // ini url nya
public class DetailController {

    @RequestMapping(value = "/{id}") // pake kurung kalo detail
    public String detailProduk(Model model, HttpSession session, @PathVariable("id") Integer id) {
        Produk produk = null;
        List<Produk> list = (List<Produk>) session.getAttribute("produk");
        for (Produk produk1 : list) {
            if (produk1.getId().compareTo(id) == 0) {
                produk = produk1;
            }
        }
        session.setAttribute("produkDetail", produk);
        return "detail";
    }

    @RequestMapping(value = "/tambahkan") // pake kurung kalo detail
    public String detailProduk(Model model, HttpSession session) {
        List<Produk> list = (List<Produk>) session.getAttribute("keranjang");
        list.add((Produk) session.getAttribute("produkDetail"));
        session.removeAttribute("produkDetail");
        return "pindahkanKeWelcome";
    }
}
