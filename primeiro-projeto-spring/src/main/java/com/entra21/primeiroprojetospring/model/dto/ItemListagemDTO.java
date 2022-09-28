package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.ETipoItem;
import lombok.Data;

@Data
public class ItemListagemDTO {
    public Long id;
    public String titulo;
    public Boolean emprestado;
    public ETipoItem tipo;
}