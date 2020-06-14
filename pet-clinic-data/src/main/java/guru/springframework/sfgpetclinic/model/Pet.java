package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
