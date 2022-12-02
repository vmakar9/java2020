package hw4.zooclub;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> map = new LinkedHashMap<>();

    public void addPersonToClub(Person person){
        map.put(person,new ArrayList<>());
    }

    public void addPetToPerson(int personID,Pet pet){
        Set<Person> people = map.keySet();
        for(Person person : people){
            if(person.getId() ==  personID){
                List<Pet> pets = map.get(person);
                pets.add(pet);
            }
        }
    }

    public void deletePetFromPerson(Pet pet,Person person){
        List<Pet> pets = map.get(person);
        pets.removeIf(p ->  p.equals(pet));
    }

    public void deleteFromClub(Person person){
        map.remove(person);
    }

    public void deletePet(Pet pet){
      map.entrySet()
              .forEach(personListEntry -> {personListEntry.setValue(personListEntry.getValue().stream().filter(pet1 -> !pet1.equals(pet)).toList());});

    }

    public void showAll(){
        System.out.println(this.map);
    }
}
