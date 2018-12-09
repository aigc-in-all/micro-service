namespace java com.imooc.thrift.user

struct UserInfo {
    1:i32 id,
    2:string name,
    3:string password,
    4:string readName,
    5:string mobile,
    6:string email
}

service UserService {
    UserInfo getUserById(1:i32 id);
    UserInfo getUserByName(1:string name);
    void registerUser(1:UserInfo userInfo);
}