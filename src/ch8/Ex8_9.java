package ch8;

public class Ex8_9 {
    public static void main(String[] args) throws Exception {

        throw new UnsupportedOperationException("지원하지 않는 기능입니다.");
    }
}

class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg) {
        this(msg, 100);
    }


    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }

}
