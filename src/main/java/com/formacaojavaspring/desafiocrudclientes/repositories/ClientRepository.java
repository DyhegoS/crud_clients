package com.formacaojavaspring.desafiocrudclientes.repositories;

import com.formacaojavaspring.desafiocrudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
