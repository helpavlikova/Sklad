package zasilkovysklad.dl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Zakaznik.class)
public abstract class Zakaznik_ {

	public static volatile SingularAttribute<Zakaznik, Integer> zakaznikID;
	public static volatile SingularAttribute<Zakaznik, Integer> telcislo;
	public static volatile SingularAttribute<Zakaznik, Integer> ic;
	public static volatile SingularAttribute<Zakaznik, Benefit> benefit;
	public static volatile SingularAttribute<Zakaznik, String> email;
	public static volatile SingularAttribute<Zakaznik, Osoba> osobaID;

}

