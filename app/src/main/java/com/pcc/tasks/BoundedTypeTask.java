package com.pcc.tasks;

import java.util.Collections;
import java.util.List;

public class BoundedTypeTask {

    /**
     * Restrict the type of the parameter list, so we are able to pass
     * List<Parent> as well as List<Child>
     */
    public void upperBound(List<Parent> list) {
        //empty
    }

    /**
     * Restrict the type of the parameter list, so we are able to pass
     * only List<Child> and its parent List<Parent>
     */
    public void lowerBound(List<Child> list) {
        //empty
    }

    public static void main(String[] args) {
        List<Parent> parentList = Collections.emptyList();
        List<Child> childList = Collections.emptyList();

        upperBound(childList);
        lowerBound(parentList);
    }

    public static class Parent {
    }

    public static class Child extends Parent {
    }
}
