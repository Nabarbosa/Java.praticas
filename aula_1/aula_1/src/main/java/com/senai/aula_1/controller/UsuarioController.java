package com.senai.aula_1.controller;

import com.senai.aula_1.model.Usuario;
import com.senai.aula_1.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/save")
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        usuarioService.saveUsuario(usuario);
        return ResponseEntity.ok(usuario);
    }

   @GetMapping("/find/{email}")
    public ResponseEntity<Usuario> findByEmail(@PathVariable String email){
        Usuario usuario = usuarioService.findByEmail(email);
        return ResponseEntity.ok(usuario);
   }

   @PutMapping("/update")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
        return ResponseEntity.ok(usuario);
   }

   @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
   }
}
