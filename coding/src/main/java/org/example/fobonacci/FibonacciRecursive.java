package org.example.fobonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class FibonacciRecursive extends RecursiveAction {

    private static final long THRESHOLD = 5;
    private long nr;

    public FibonacciRecursive(long nr){
        this.nr = nr;
    }
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive(12);
        forkJoinPool.invoke(fibonacciRecursive);
        System.out.println(fibonacciRecursive.fibonacciNumber());
    }

    @Override
    protected void   compute() {
        final long n = nr;
        if(n <= THRESHOLD){
            nr = fibonacci(n);
        } else {
            nr = ForkJoinTask.invokeAll(createSubTask(n))
                    .stream()
                    .mapToLong(FibonacciRecursive::fibonacciNumber)
                    .sum();
        }
    }

    private long fibonacciNumber() {
        return nr;
    }

    private long fibonacci(long n) {
        if(n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private List<FibonacciRecursive> createSubTask(long n) {
        List<FibonacciRecursive> subTasks = new ArrayList<>();
        FibonacciRecursive fiboMinusOne = new FibonacciRecursive(n -1);
        FibonacciRecursive fiboMinusTwo = new FibonacciRecursive(n -2);
        subTasks.add(fiboMinusOne);
        subTasks.add(fiboMinusTwo);
        return subTasks;
    }
}

