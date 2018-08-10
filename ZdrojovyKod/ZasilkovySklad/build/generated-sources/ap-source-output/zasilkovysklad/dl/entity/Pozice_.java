package zasilkovysklad.dl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pozice.class)
public abstract class Pozice_ {

	public static volatile SingularAttribute<Pozice, String> sektor;
	public static volatile SingularAttribute<Pozice, Zasilka> zasilka;
	public static volatile SingularAttribute<Pozice, String> poziceID;
	public static volatile SingularAttribute<Pozice, String> patro;
	public static volatile SingularAttribute<Pozice, Regal> regal;

}

