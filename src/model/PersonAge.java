package model;

public class PersonAge {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length()<2){
            throw new IllegalArgumentException(
                    "Nome inválido, por favor tente novamente!"
            );
        }

        if (!name.trim().matches("^[a-zA-ZÀ-ÿ ]+$")){
            throw new IllegalArgumentException(
                    "O nome deve conter apenas letras, por favor tente novamente!"
            );
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age>=0){
            this.age = age;
        } else {
            throw new IllegalArgumentException(
              "Por favor! Digite um número maior que 0: "
            );
        }
    }
}
