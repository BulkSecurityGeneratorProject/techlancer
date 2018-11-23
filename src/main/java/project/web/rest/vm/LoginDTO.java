package project.web.rest.vm;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginDTO {

    @NotNull
    @Size(min = 1, max = 50)
    private String email;

    @NotNull
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
