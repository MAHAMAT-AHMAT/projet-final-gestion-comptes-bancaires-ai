package fr.zenabkissir.ebankingbackend.repositories;

import fr.zenabkissir.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
