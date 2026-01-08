package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem";
    }


    // adicionar ninja (create)
    @PostMapping("/criar")
    public String criarNinja() {
        return "ninja criado";
    }
    //mostrar todos os ninjas (read)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.listarNinjas();
    }

    // procurar ninja po id (read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id)  {
        return ninjaService.listarNinjasPorId(id);
    }
    //alterar dados do ninja (update)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId() {
        return "Alterar ninja por Id";
    }
    // deletar ninja (delete
    @DeleteMapping("/deletarid")
    public String deletarNinjaPorId() {
         return "ninja deletado por id";
    }

}
