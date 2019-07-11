package cn.jack.memory;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Person temp = (Person) obj;
        if (name.equals(temp.name) && age.equals(temp.age)) return true;
        return false;
        //return super.equals(obj);
    }
}
