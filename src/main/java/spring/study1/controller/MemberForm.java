
package spring.study1.controller;

public class MemberForm {
    // createMemberForm의 input의 name 속성 값인 name과 같아야 함
    private String name;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}