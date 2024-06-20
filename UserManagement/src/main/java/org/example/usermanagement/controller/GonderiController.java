package org.example.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.example.usermanagement.service.GonderiService;

@Controller
@RequestMapping(value = "/gonderi")
public class GonderiController {

   @Autowired
   private GonderiService gonderiService;

   @GetMapping("/list/{kullaniciId}")
   public ResponseEntity getGonderiler(@PathVariable Long kullaniciId) {
      return ResponseEntity.ok(gonderiService.getGonderilerByKullanici(kullaniciId));
   }

   @PostMapping("/save/{kullaniciId}")
   public void saveGonderi(@PathVariable Long kullaniciId, @RequestParam String baslik, @RequestParam String aciklama) {
      gonderiService.saveGonderiForKullanici(kullaniciId, baslik, aciklama);
   }

   @DeleteMapping("/delete/{gonderiId}")
   public void deleteGonderi(@PathVariable Long gonderiId) {
      gonderiService.deleteGonderi(gonderiId);
   }

}
