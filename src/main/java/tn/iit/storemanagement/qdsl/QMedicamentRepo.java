package tn.iit.storemanagement.qdsl;

import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;
import tn.iit.storemanagement.domain.Medicament;
import tn.iit.storemanagement.domain.QMedicament;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class QMedicamentRepo implements IQMedicamentRepo{

    @PersistenceContext
    private EntityManager em;


    @Override
    public Collection<Medicament> findMedicamentByNameAndCategory(String name) {
            final JPAQuery<Medicament> query=new JPAQuery (em);
      final QMedicament medicament=QMedicament.medicament;
      return query.from (medicament).where (medicament.name.eq(name)).fetch();


    }
}
