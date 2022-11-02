package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter 		//İlgili entity için getter leri oluşturur
@Setter 		//ilgili entity için setter leri oluşturur . @Data ise ikisini de oluşturur
@AllArgsConstructor // Parametreli constructor oluşturur
@NoArgsConstructor //Parametresiz constructor oluşturur
@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//id 1-1 artsın
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;	
	
}
