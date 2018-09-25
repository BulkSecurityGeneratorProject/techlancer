package project;

public enum TypeUser {

    USER_PROVIDER(1L),
    USER_CUSTUMER(2L);

    private Long code;
    private Long name;

    TypeUser(Long code) {
        this.code = code;
    }


    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

}
