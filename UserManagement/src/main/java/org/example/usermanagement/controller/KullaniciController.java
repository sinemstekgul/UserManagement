package org.example.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.example.usermanagement.service.KullaniciService;

@Controller
@RequestMapping(value = "/kullanici")
public class KullaniciController {

   @Autowired
   private KullaniciService kullaniciService;

   @GetMapping("/list")
   public ResponseEntity getKullanicilar() {
      return ResponseEntity.ok(kullaniciService.getKullanicilar());
   }

   @PostMapping("/update/{kullaniciId}")
   public void getKullanicilar(@PathVariable Long kullaniciId, @RequestParam String isim, @RequestParam String mail,@RequestParam String meslek) {
      kullaniciService.updateKullanici(kullaniciId, isim, mail, meslek);
   }

}
