package org.example.designpatterns.executearound;

import java.util.function.Consumer;

public class ExecuteAroundResource {

    public static void main(String[] args) {
        Resource.useResource(resource ->
                resource
                        .operationOne()
                        .operationTwo()
                );
    }
}

class Resource{
    private Resource(){

    }

    public Resource operationOne(){
        System.out.println("Operation One is executed...");
        return this;
    }

    public Resource operationTwo(){
        System.out.println("Operation Two is executed...");
        return this;
    }

    public void cleanUp(){
        System.out.println("Cleaned up resources...");
    }

    public static void useResource(Consumer<Resource> resourceConsumer){
        Resource resource = new Resource();
        try{
            resourceConsumer.accept(resource);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            resource.cleanUp();
        }
    }
}