package com.baizhi.entity;

public class Person {


        private Integer id;
        private String name;
        private String acthor;



        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getActhor() {
            return acthor;
        }

        public void setActhor(String acthor) {
            this.acthor = acthor;
        }


    public Person() {
    }

    public Person(Integer id, String name, String acthor) {
        this.id = id;
        this.name = name;
        this.acthor = acthor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acthor='" + acthor + '\'' +
                '}';
    }
}

