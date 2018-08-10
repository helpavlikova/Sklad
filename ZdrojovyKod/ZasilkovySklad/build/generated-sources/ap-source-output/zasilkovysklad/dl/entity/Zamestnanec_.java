package zasilkovysklad.dl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Zamestnanec.class)
public abstract class Zamestnanec_ {

	public static volatile SingularAttribute<Zamestnanec, PoziceZamestnance> pozice;
	public static volatile SingularAttribute<Zamestnanec, Integer> zamestnanecID;
	public static volatile SingularAttribute<Zamestnanec, Integer> telcislo;
	public static volatile SingularAttribute<Zamestnanec, String> email;
	public static volatile SingularAttribute<Zamestnanec, Osoba> osobaID;
	public static volatile SingularAttribute<Zamestnanec, Login> username;

}

