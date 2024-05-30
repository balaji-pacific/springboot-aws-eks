package com.aws.example.eks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAwsEksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAwsEksApplication.class, args);
    }
//069631898237.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest
// eksctl create cluster --name balajisn-cluster --version 1.28 --nodes=1 --node-type=t2.small --region us-east-2
}
