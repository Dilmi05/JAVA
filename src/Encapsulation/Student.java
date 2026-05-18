package Encapsulation;



class Student {

    // private data (hidden)
    private String name;
    private int age;

    // setter methods (to set values)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

