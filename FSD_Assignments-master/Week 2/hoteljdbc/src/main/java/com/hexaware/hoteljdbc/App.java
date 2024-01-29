package com.hexaware.hoteljdbc;

/**
 * Hello world!
 *
 */


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.hoteljdbc.config.AppConfig;
import com.hexaware.hoteljdbc.model.User;
import com.hexaware.hoteljdbc.service.IUserService;
import com.hexaware.hoteljdbc.service.UserServiceImp;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        IUserService userService = context.getBean(UserServiceImp.class);

        boolean flag = true;

        while (flag) {
            System.out.println("****WELCOME User Management System ***");
            System.out.println("1. CREATE");
            System.out.println("2. UPDATE");
            System.out.println("3. DELETE");
            System.out.println("4. SELECT BY Name");
            System.out.println("5. SELECT ALL");
            System.out.println("6. EXIT");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    User user = readUserData();
                    boolean isInserted = userService.createUser(user);
                    if (isInserted) {
                        System.out.println("Record inserted successfully...");
                    } else {
                        System.err.println("Insert fail");
                    }
                    break;

                case 2:
                    User updatedUser = readUserData();
                    boolean isUpdated = userService.updateUser(updatedUser);
                    if (isUpdated) {
                        System.out.println("Record Updated successfully...");
                    } else {
                        System.err.println("Update fail");
                    }
                    break;

                case 3:
                    System.out.println("Enter User Id");
                    int userId = scanner.nextInt();
                    boolean isDeleted = userService.deleteUserById(userId);
                    if (isDeleted) {
                        System.out.println("Record Deleted successfully...");
                    } else {
                        System.err.println("Delete fail");
                    }
                    break;

                case 4:
                	 System.out.println("Enter User Name");
                     String userName = scanner.next();
                     User userByName = userService.selectUserByName(userName);
                     if (userByName != null) {
                         System.out.println(userByName);
                     } else {
                         System.err.println("User Not Found");
                     }
                     break;
                case 5:
                    List<User> userList = userService.selectAllUsers();
                    for (User usr : userList) {
                        System.out.println(usr);
                    }
                    break;

                case 6:
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static User readUserData() {
        User user = new User();
        System.out.println("Enter User Id");
        user.setUserId(scanner.nextInt());
        System.out.println("Enter User Name");
        user.setUserName(scanner.next());
        System.out.println("Enter Password");
        user.setPassword(scanner.next());
        System.out.println("Enter Email");
        user.setEmail(scanner.next());
        System.out.println("Enter First Name");
        user.setFirstName(scanner.next());
        System.out.println("Enter Last Name");
        user.setLastName(scanner.next());
        System.out.println("Enter Contact Number");
        user.setContactNumber(scanner.next());
        System.out.println("Enter Address");
        user.setAddress(scanner.next());
        return user;
    }
}

