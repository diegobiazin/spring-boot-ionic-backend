package com.diegobiazin.cursomc;

import com.diegobiazin.cursomc.domain.*;
import com.diegobiazin.cursomc.domain.enums.EstadoPagamento;
import com.diegobiazin.cursomc.domain.enums.TipoCliente;
import com.diegobiazin.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;

import static java.util.Arrays.asList;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
