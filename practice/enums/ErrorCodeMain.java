package practice.enums;

public class ErrorCodeMain {

    public static void main(String[] args) {

        ErrorCode err = ErrorCode.BadRequest;

        System.out.println(err);
        System.out.println(err.name());
        System.out.println(err.valueOf("BadRequest"));
//        System.out.println(err.getErrorCode());
//        System.out.println(err.getErrorMessage());

    }

}
