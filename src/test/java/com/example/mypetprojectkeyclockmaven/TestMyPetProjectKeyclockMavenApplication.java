package com.example.mypetprojectkeyclockmaven;

import org.springframework.boot.SpringApplication;

public class TestMyPetProjectKeyclockMavenApplication {

    public static void main(String[] args) {
        SpringApplication.from(MyPetProjectKeyclockMavenApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
