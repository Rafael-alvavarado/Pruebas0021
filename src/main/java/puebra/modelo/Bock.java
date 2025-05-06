package puebra.modelo;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bock {

    private Long id;
    private String title;
    private String author;
    private String genre;
    private String address;


}
