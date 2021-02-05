package tn.iit.storemanagement.qdsl;

import tn.iit.storemanagement.domain.Medicament;

import java.util.Collection;

public interface IQMedicamentRepo {

    Collection<Medicament> findMedicamentByNameAndCategory(String name );
}
