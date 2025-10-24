package ma.emsi.springdataresttp.SpringDataRestTp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_etudiant", nullable = false)
    private String nom;

    @Column(name = "prenom_etudiant")
    private String prenom;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne
    private Centre centre;
}