package ru.vlasova.task_2;

@Validate(value = String.class)
public class ValidateEx {
    private String group;
    private String nickname;

    public ValidateEx(String group, String nickname) {
        this.group = group;
        this.nickname = nickname;
    }

    public String getGroup() {
        return group;
    }

    public String getNickname() {
        return nickname;
    }
}
