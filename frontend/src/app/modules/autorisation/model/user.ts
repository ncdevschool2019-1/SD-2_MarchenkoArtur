export class User{
  id:number;
  login:string;
  password:string;
  role:number;

  static cloneUser(user: User): User {
    const clonedUser: User = new User();
    clonedUser.id = user.id;
    clonedUser.login = user.login;
    clonedUser.password = user.password;
    clonedUser.role = user.role;
    return clonedUser;
  }
}
