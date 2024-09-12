package org.example.hashcodeequals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerWithHashCode {

    private int id;
    private String name;

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass()){
            return false;
        }
        if(this == obj)
            return true;
        final PlayerWithHashCode playerDuplicate = (PlayerWithHashCode) obj;
        if(this.id != playerDuplicate.id)
            return false;
        if(!Objects.equals(this.name, playerDuplicate.name))
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
