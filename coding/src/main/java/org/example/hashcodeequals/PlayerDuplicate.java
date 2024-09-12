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
public class PlayerDuplicate {

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
        final PlayerDuplicate playerDuplicate = (PlayerDuplicate) obj;
        if(this.id != playerDuplicate.id)
            return false;
        if(!Objects.equals(this.name, playerDuplicate.name))
            return false;
        return true;
    }
}
