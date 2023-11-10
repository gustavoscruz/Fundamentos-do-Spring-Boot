package br.com.gustavoscruz.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponente {
    
    public String chamarMeuComponente(){
        return "Chamando meu componente";
    }
}
