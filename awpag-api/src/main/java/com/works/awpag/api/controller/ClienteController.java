package com.works.awpag.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.works.awpag.doMain.model.Cliente;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Honycleytton");
        cliente1.setTelefone("88 99368-4729");
        cliente1.setEmail("hony@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Lavinia");
        cliente2.setTelefone("88 99999-9999");
        cliente2.setEmail("lavinia@gmail.com");

        return Arrays.asList(cliente1, cliente2);
    }

}
