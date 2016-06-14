package demo

class ProjectUser {

    User createdBy

    static mappedBy = [user: 'none', createdBy: 'none']

    static belongsTo = [user: User]
}
