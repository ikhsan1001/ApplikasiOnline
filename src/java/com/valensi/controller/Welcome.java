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
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome") // ini url nya
public class Welcome {

    List<Produk> keranjang=new ArrayList<>();
    @RequestMapping
    public String tampilkan(Model model, HttpSession session) {
        
        model.addAttribute("Title", "Iglo Cinema");
        List<Produk> list = new ArrayList<>();
        list.add(new Produk("Spiderman: Homecoming", "Spider-Man: Homecoming adalah film pahlawan super Amerika berdasarkan karakter Marvel Comics, Spider-Man, yang diproduksi oleh Columbia Pictures dan Marvel Studios serta didistribusikan oleh Sony Pictures Releasing.", 3500000.0, "http://cinemaxx.cinemaxxtheater.com/Gallery/Movies/Thumbnail/Spider-Man-Homecoming%20(2)", 1));
        list.add(new Produk("The Avenger", "Ketika musuh yang tak terduga muncul, mengancam keselamatan dan keamanan dunia, Nick Fury, direktur Badan Perdamaian Internasional, dikenal sebagai S.H.I.E.L.D. , membutuhkan tim untuk menyelamatkan dunia dari bencana. Usaha perekrutan pun dimulai Iron Man, Captain America, Hulk, Thor, Black Widow dan Hawkeye dikumpulkan untuk menaklukkan Dewa Kehancuran, Loki, dalam usahanya menghancurkan bumi. Dengan semua gabungan kekuatan, tugas nampak lebih mudah. Namun kenyatannya tidak demikian! Para pahlawan super justru saling melawan satu sama lain Hulk melawan Captain America, siapa yang akan menang? Apakah Iron Man dapat mengalahkan kekuatan super milik Thor? Bagaimana para pahlawan super ini secara bersama-sama menghadapi bencana, melindungi masyarakat dan yang terpenting, bertahan hidup?", 5500000.0, "https://upload.wikimedia.org/wikipedia/en/f/f9/TheAvengers2012Poster", 2));
        list.add(new Produk("Batman", "The Dark Knight adalah film superhero tahun 2008, disutradarai, diproduksi, dan ditulis oleh Christopher Nolan. Berdasarkan karakter Batman dalam Komik, film ini adalah bagian kedua dari film seri Batman karya Nolan setelah Batman Begins pada tahun 2005. Christian Bale reprises peran utama Bruce Wayne / Batman, dengan pemain sebeumnya Michael Caine sebagai Alfred Pennyworth, Gary Oldman sebagai James Gordon dan Morgan Freeman sebagai Lucius Fox. Film ini memperkenalkan karakter Harvey Dent (Aaron Eckhart), Gotham yang baru dipilih Kejaksaan dan teman masa kecil Bruce Wayne, Rachel Dawes (Maggie Gyllenhaal menggantikan Katie Holmes dari film pertama), yang bergabung dengan Batman dan polisi dalam memerangi ancaman dalang kriminal yang menyebut dirinya \"The Joker\" (Heath Ledger).", 7500000.0, "http://is4.mzstatic.com/image/thumb/Video18/v4/ec/95/94/ec959447-9c30-730b-75e7-8cbd160bc283/source/1200x630bb", 3));
        list.add(new Produk("X-Men", "Seri filmThe X-Men adalah serangkaian film-film superhero yang berasal dari Amerika dan berdasarkan cerita fiksi kumpulan superhero dengan nama yang sama, yang awalnya muncul dalam serial buku komik yang diciptakan oleh Stan Lee dan Jack Kirby dan diterbitkan oleh Marvel Comics. 20th Century Fox memperoleh hak pembuatan film untuk seluruh karakter pada tahun 1994, dan setelah banyak pemilihan konsep, Bryan Singer terpilih untuk menyutradarai X-Men (2000) dan sekuelnya, X2 (2003), sementara Brett Ratner yang menyutradarai X-Men: The Last Stand (2006).", 2500000.0, "https://upload.wikimedia.org/wikipedia/en/8/81/X-MenfilmPoster", 4));
//        list.add(new Produk("Wii U", "", 2500000.0, "handled-wiiu", 5));
//        list.add(new Produk("XBOX 360", "", 2500000.0, "console-xbox360", 6));
//        list.add(new Produk("XBOX One", "", 6750000.0, "console-xboxone", 7));
        session.setAttribute("produk", list);
        session.setAttribute("keranjang", keranjang);
        return "welcome";
    }


}
