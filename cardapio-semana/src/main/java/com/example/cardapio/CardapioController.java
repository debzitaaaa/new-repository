
package com.example.cardapio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CardapioController {

    private final List<Prato> pratos = new ArrayList<>();
    private final List<PratoFeito> feitos = new ArrayList<>();

    private Long proximoId = 5L;

    public CardapioController() {

        pratos.add(new Prato(1L, "Lasanha à Bolonhesa",
                "Almoço", "Massa", 4,
                LocalDate.now().plusDays(1), "Com queijo"));

        pratos.add(new Prato(2L, "Salada de Grão-de-Bico",
                "Jantar", "Salada", 2,
                LocalDate.now().plusDays(3), ""));

        pratos.add(new Prato(3L, "Frango Xadrez",
                "Almoço", "Carne", 3,
                LocalDate.now().plusDays(5), ""));

        pratos.add(new Prato(4L, "Bolo de Cenoura",
                "Jantar", "Sobremesa", 8,
                LocalDate.now().plusDays(6), ""));

        feitos.add(new PratoFeito(
                "Escondidinho de Carne Seca", 5,
                LocalDate.now().minusDays(10)));

        feitos.add(new PratoFeito(
                "Macarrão de Panela de Pressão", 4,
                LocalDate.now().minusDays(6)));

        feitos.add(new PratoFeito(
                "Pudim de Leite", 5,
                LocalDate.now().minusDays(4)));
    }

    // Página inicial
    @GetMapping("/")
    public String inicio(Model model) {

        model.addAttribute("total", pratos.size());
        model.addAttribute("feitos", feitos.size());

        return "index";
    }

    // Lista de pratos
    @GetMapping("/pratos")
    public String listarPratos(Model model) {

        model.addAttribute("pratos", pratos);

        return "lista";
    }

    // Formulário
    @GetMapping("/pratos/novo")
    public String novoPrato() {

        return "formulario";
    }

    // Salvar prato
    @PostMapping("/pratos")
    public String salvarPrato(
            @RequestParam String nome,
            @RequestParam String tipo,
            @RequestParam String categoria,
            @RequestParam int porcoes,
            @RequestParam String dataPlanejada,
            @RequestParam(required = false) String observacao) {

        Prato prato = new Prato(
                proximoId++,
                nome,
                tipo,
                categoria,
                porcoes,
                LocalDate.parse(dataPlanejada),
                observacao
        );

        pratos.add(prato);

        return "redirect:/pratos";
    }

    // Marcar como feito
    @PostMapping("/pratos/{id}/feito")
    public String marcarFeito(
            @PathVariable Long id,
            @RequestParam(defaultValue = "5") int nota) {

        Prato prato = pratos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (prato != null) {
            feitos.add(new PratoFeito(
                    prato.getNome(),
                    Math.max(1, Math.min(5, nota)),
                    LocalDate.now()
            ));

            pratos.remove(prato);
        }

        return "redirect:/pratos";
    }

    // Página dos pratos feitos
    @GetMapping("/feitos")
    public String listarFeitos(Model model) {

        model.addAttribute("feitos", feitos);

        return "feitos";
    }
}
