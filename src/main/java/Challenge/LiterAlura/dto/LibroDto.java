package Challenge.LiterAlura.dto;

import Challenge.LiterAlura.models.Autor;

public record LibroDto(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       int numeroDeDescargas
) {
}
