package me.dio.sacola.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sacola-api/sacolas")
public class SacolaResource {

    private final SacolaService SacolaService;

@PostMapping
public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
    return SacolaService.incluirItemNaSacola(itemDto);

    
}
@GetMapping("/{id}")
public Sacola verSacola(@PathVariable("id") long id){
    return SacolaService.verSacola(id);
}
@PatchMapping("/fecharSacola/{sacolaId}")
  public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                             @RequestParam("formaPagamento") int formaPagamento) {
    return SacolaService.fecharSacola(sacolaId, formaPagamento);
  }

}