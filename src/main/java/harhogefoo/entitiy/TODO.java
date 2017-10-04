package harhogefoo.entitiy;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * author shinocchi.
 * Created on 2017/10/04.
 */
@Entity
@Data
public class TODO {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  private String content;

  @NotNull
  private Integer status;

}
