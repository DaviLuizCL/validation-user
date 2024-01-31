package br.com.validation.ValidationPassword.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class ClienteModel {
    private Integer id;
    @NotBlank
    private String nome;
    @Email
    private String email;
    @CPF
    private String cpf;
    @NotBlank
    private String placaCarro;
    @Min(value = 1900)
    private int anoNascimento;
}
