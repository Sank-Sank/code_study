package sank.builder_pattern;

/**
 * 类描述: 方法链调用的建造者模式
 * 作者: by Sank
 * 时间: 2019-01-07 14:47
 */
public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(BuildPerson buildPerson){
        this.name = buildPerson.name;
        this.age = buildPerson.age;
        this.sex = buildPerson.sex;
    }

    static class BuildPerson{
        private String name;
        private int age;
        private char sex;
        public BuildPerson buildName(String name){
            this.name = name;
            return this;
        }
        public BuildPerson buildAge(int age){
            this.age = age;
            return this;
        }
        public BuildPerson buildSex(char sex){
            this.sex = sex;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
