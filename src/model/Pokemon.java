package model;

public class Pokemon {

    private String name;
    private String type;
    private String ability;

    public Pokemon(String name, String type, String ability) {
        this.name = name;
        this.type = type;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    

}
