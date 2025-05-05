package com.example.restapi.repository.custom;

import com.example.restapi.config.SqlQueries;
import com.example.restapi.dto.InvoiceDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomInvoiceRepositoryImpl implements CustomInvoiceRepository {

    private final EntityManager entityManager;
    private final SqlQueries sqlQueries;

    public CustomInvoiceRepositoryImpl(EntityManager entityManager, SqlQueries sqlQueries) {
        this.entityManager = entityManager;
        this.sqlQueries = sqlQueries;
    }

    @Override
    public List<InvoiceDTO> findInvoices(UUID clientId, LocalDate startDate) {
        Query query = entityManager.createNativeQuery(sqlQueries.getInvoiceQuery());
        query.setParameter("clientId", clientId);
        query.setParameter("startDate", startDate);

        @SuppressWarnings("unchecked")
        List<Object[]> rows = query.getResultList();
        List<InvoiceDTO> results = new ArrayList<>();

        for (Object[] row : rows) {
            results.add(new InvoiceDTO(
                (String) row[0],
                (String) row[1],
                ((Date) row[2]).toLocalDate(),
                row[3] != null ? ((Number) row[3]).doubleValue() : null,
                row[4] != null ? ((Number) row[4]).doubleValue() : null,
                row[5] != null ? ((Number) row[5]).doubleValue() : null
            ));
        }

        return results;
    }
}
