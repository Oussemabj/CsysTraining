package tn.iit.storemanagement.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMedicament is a Querydsl query type for Medicament
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMedicament extends EntityPathBase<Medicament> {

    private static final long serialVersionUID = -1599613813L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMedicament medicament = new QMedicament("medicament");

    public final QCategory category;

    public final NumberPath<Float> dosage = createNumber("dosage", Float.class);

    public final DateTimePath<java.util.Date> expiredDate = createDateTime("expiredDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Float> price = createNumber("price", Float.class);

    public QMedicament(String variable) {
        this(Medicament.class, forVariable(variable), INITS);
    }

    public QMedicament(Path<? extends Medicament> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMedicament(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMedicament(PathMetadata metadata, PathInits inits) {
        this(Medicament.class, metadata, inits);
    }

    public QMedicament(Class<? extends Medicament> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category")) : null;
    }

}

