package com.demo.view;

import com.demo.model.User;
import com.demo.service.UserService;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import java.util.List;

import static java.util.Objects.isNull;


public class UserView {

    @WireVariable
    private UserService userService;

    private User selected;

    private List<User> users;

    @Init
    public void init() {
    }

    public List<User> getUsers() {
        if (isNull(users)) {
            users = userService.findAll();
        }
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getSelected() {
        return selected;
    }

    public void setSelected(User selected) {
        this.selected = selected;
    }
}
