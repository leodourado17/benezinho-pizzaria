package br.com.benefrancis.domain.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "TB_OPCIONAL")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Opcional {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_OPCIONAL")
  @SequenceGenerator(name = "SQ_OPCIONAL")
    private Long id;

    private String nome;

    private Double preco;

}
