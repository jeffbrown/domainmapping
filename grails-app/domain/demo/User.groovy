package demo

class User {
    String firstName

    static hasMany = [projectUsers: ProjectUser]
}
