package zasilkovysklad.dl.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Regal.class)
public abstract class Regal_ {

	public static volatile SingularAttribute<Regal, StavRegalu> stav;
	public static volatile SingularAttribute<Regal, Integer> regalID;
	public static volatile SingularAttribute<Regal, String> popis;
	public static volatile SingularAttribute<Regal, Double> nosnost;
	public static volatile SingularAttribute<Regal, String> oznaceni;
	public static volatile SingularAttribute<Regal, Sekce> sekce;

}

