

public class Project {
    private String name;
    private String description;
    private Double initialCost;
    // public Project(){
    //     this("No Name","Description Here");
    // }
    public Project(){
        this.name = "No Name";
        this.description = "Description Here";
        this.initialCost = 0.0;
    }
    
    public Project(String name){
        this.name = name;
        this.description = "Description Here";
        this.initialCost = 0.0;
    }

    public Project(String name, String description, Double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String initialCost) {
        this.description = description;
    }
    public Double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch(){
        String result = this.getName() + " ( " + "$ " + this.getInitialCost()+ " ) " + " : " + this.getDescription();
        return result;
    }
}