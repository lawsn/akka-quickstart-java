package com.toy.functional.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LoginUserServiceTest {

    private LoginUserService testService = new LoginUserService();

    private void validate(List<LoginUser> allUsers) {
        Consumer<LoginUser> printOutUser = System.out::println;
        allUsers.stream().forEach(printOutUser);

        Predicate<LoginUser> foundMary = e -> e.getUserName().equalsIgnoreCase("bzheng");
        List<LoginUser> foundUsers = allUsers.stream().filter(foundMary).collect(Collectors.toList());
        assertTrue(foundUsers.size() == 1);
    }

    @Test
    public void getAllUser_java8Style_lambda_1() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_lambda_1();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_java8Style_lambda_2() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_lambda_2();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_java8Style_lambda_3() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_lambda_3();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_java8Style_methodReference_1() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_methodReference_1();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_java8Style_methodReference_2() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_methodReference_2();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_java8Style_methodReference_best() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_methodReference_best();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_java8Style_namedLambda() {
        List<LoginUser> allUsers = testService.getAllUser_java8Style_namesLambda();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }

    @Test
    public void getAllUser_loopStyle() {
        List<LoginUser> allUsers = testService.getAllUser_loopStyle();
        assertTrue(allUsers.size() == 3);

        validate(allUsers);
    }
}
