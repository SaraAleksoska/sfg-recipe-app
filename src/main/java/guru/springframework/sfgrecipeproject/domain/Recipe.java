package guru.springframework.sfgrecipeproject.domain;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();
    //ako izbriseme ingredient nema da se izbrise receptot zatoa Recipe e owning side

    @Lob
    private Byte[] image;

    @Enumerated(value = EnumType.STRING)
    private Difficalty difficalty;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    //one-to-one property to notes
    //ova cascade znaci deka ako izbriseme eden recept ke se izbrisat i site notes za toj recept,
    // ama ako izbriseme eden note ne se brisi cel recept, zatoa cascade odi samo na stranata na
    // Recipe Entity i toj e owning side entity

    @ManyToMany
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

}
