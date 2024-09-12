package org.example.immutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MutableMelon {

    private String name;
    private int weight;

//    @Override
//    public boolean equals(MutableMelon melon){
//        return (this.name.equals(melon.name) && this.weight == melon.weight);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableMelon melon = (MutableMelon) o;
        return weight == melon.weight && Objects.equals(name, melon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "MutableMelon{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
