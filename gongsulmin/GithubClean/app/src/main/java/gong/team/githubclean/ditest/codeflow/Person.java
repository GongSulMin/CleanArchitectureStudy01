package gong.team.githubclean.ditest.codeflow;

import kotlin.jvm.internal.PropertyReference0Impl;

public class Person {
    private int age;
    private String name;

    public Person(Builder builder) {
        age = builder.age;
        name = builder.name;
    }

    static class Builder {
        private int age;
        private String name;

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person.Builder personBuilder = new Person.Builder();

        personBuilder
                .setAge(11)
                .setName("gonG")
                .build();
    }

}
