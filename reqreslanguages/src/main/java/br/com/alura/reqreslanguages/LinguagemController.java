package br.com.alura.reqreslanguages;

import java.util.List;

@RestController
public class LinguagemController {

 @Autowired
 private LinguagemRepository repositorio;
 
@GetMapping("/linguagens")
  public List<Linguagem>obterLinguagens() {
    List<Linguagem> linguagens = repositorio.findAll();
    return linguagens;
  }
  
  @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
      Linguagem linguagemSalva = (Linguagem) repositorio.save(linguagem);
      return linguagemSalva;
    }
}
