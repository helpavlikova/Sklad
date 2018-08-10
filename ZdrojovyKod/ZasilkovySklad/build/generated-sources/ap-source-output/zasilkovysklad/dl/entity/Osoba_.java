package zasilkovysklad.dl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Osoba.class)
public abstract class Osoba_ {

	public static volatile SingularAttribute<Osoba, Integer> rodnecislo;
	public static volatile SingularAttribute<Osoba, Adresa> adresa;
	public static volatile SingularAttribute<Osoba, String> prijmeni;
	public static volatile SingularAttribute<Osoba, String> jmeno;
	public static volatile SingularAttribute<Osoba, Integer> osobaID;

}

