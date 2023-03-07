package com.porto.web.model;

import java.io.Serializable;

import com.porto.web.model.enums.Status;
import com.porto.web.model.enums.TipoContainer;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Container implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    private String cliente;

    @Pattern(regexp = "^[A-Za-z]{4}[0-9]{7}$", message = "Boa tentativa, mas você deve seguir o padrão exigido.")
    private String numero_container;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private TipoContainer tipo_container;

    @Enumerated(EnumType.STRING)
    private CategoriaContainer categoria;
}
