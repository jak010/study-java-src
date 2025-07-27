package grammer.Notepads;

class MemberDTO {
    String name;
    Integer age;


    public MemberDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

interface MemberManager {
    public boolean addMember(MemberDTO member);

    public boolean removeMember(String name, String phone);

    public boolean updateMember(MemberDTO member);
}

class MemberManagerImpl implements MemberManager {


    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }
}


public class Notepads02 {

    public static void main(String[] args) {

        MemberManager manager = new MemberManagerImpl();

    }
}
