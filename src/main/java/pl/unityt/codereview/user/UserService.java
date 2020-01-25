package pl.unityt.codereview.user;

import pl.unityt.codereview.user.domain.User;

public interface UserService {

    User getById(long id);
    User getLoggedUser();

}
