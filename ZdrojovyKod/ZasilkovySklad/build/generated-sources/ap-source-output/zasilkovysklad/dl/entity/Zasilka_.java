package zasilkovysklad.dl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Zasilka.class)
public abstract class Zasilka_ {

	public static volatile SingularAttribute<Zasilka, Osoba> prijemce;
	public static volatile SingularAttribute<Zasilka, Osoba> odesilatel;
	public static volatile SingularAttribute<Zasilka, Krehkost> krehkost;
	public static volatile SingularAttribute<Zasilka, Integer> zasilkaID;
	public static volatile SingularAttribute<Zasilka, Double> hmotnost;
	public static volatile SingularAttribute<Zasilka, String> kodZasilky;
	public static volatile SingularAttribute<Zasilka, StavZasilky> stavZasilky;

}

