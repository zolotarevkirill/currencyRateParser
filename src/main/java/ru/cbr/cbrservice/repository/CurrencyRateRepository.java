package ru.cbr.cbrservice.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import ru.cbr.cbrservice.model.CurrencyRate;

public interface CurrencyRateRepository extends CassandraRepository<CurrencyRate, String> {
}