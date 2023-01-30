package edu.escuelait.tienda.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import edu.escuelait.tienda.validators.CUIT;
import edu.escuelait.tienda.validators.groups.OnCreated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@JsonPropertyOrder({"id","name","address"})
@Schema(description = "Esta es una Persona...")
@Data
public class Persona {



    @NonNull
    @Schema(description = "Identificador único de persona.",example = "1")
    private Long id;

    @JsonProperty("nombre")
    @NonNull
    private String name;

    @NotNull(groups = OnCreated.class)
    private String lastName;

    @NotBlank(groups = OnCreated.class)
    @Size(min = 3,max = 5)
    private String address;

    @JsonIgnore
    @Min(value = 18,groups = OnCreated.class)
    @Max(value = 80,groups = OnCreated.class)
    private int age;

    @AssertTrue(groups = OnCreated.class)
    private boolean active;

    @FutureOrPresent(groups = OnCreated.class)
    private LocalDate register;

    @Email(groups = OnCreated.class)
    private String email;

    @CUIT(groups = OnCreated.class)
    private String cuit;

}
