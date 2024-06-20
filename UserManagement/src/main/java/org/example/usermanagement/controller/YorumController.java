package org.example.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.example.usermanagement.service.YorumService;

@Controller
@RequestMapping(value = "/yorum")
public class YorumController {

   @Autowired
   private YorumService yorumService;

   @GetMapping("/list/{gonderiId}")
   public ResponseEntity getYorumlar(@PathVariable Long gonderiId) {
      return ResponseEntity.ok(yorumService.getYorumlarByGonderi(gonderiId));
   }

   @PostMapping("/save/{gonderiId}")
   public void saveGonderi(@PathVariable Long gonderiId, @RequestParam String icerik) {
      yorumService.saveYorumForGonderi(gonderiId,icerik);
   }


}
