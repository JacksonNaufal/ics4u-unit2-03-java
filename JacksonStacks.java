/*
* This is a program that calculates the pop
* from JacksonStack
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-10-08
*/

import java.util.ArrayList;
/**
 * This is the class for JacksonStacks.
 * Make class JacksonStacks.
 */

public class JacksonStacks {

    /**
    * This is an array that is private in this class
    * and can not be modified elsewhere, it only
    * takes number inputted in Main.
    */
    private ArrayList<Integer> stackNum = new ArrayList<Integer>();

    /**
    * This is getter
    * ShowStack().
    *
    * @param userInt this is the userInput.
    *
    */
    public void push(int userInt) {
        stackNum.add(userInt);
    }

    /**
    * This is the pop stack.
    *
    * @return stackNum this is the new popped number.
    *
    */
    public int pop() {
        return stackNum.remove(stackNum.size() - 1);
    }

    /**
    * This is the final stack.
    */
    public void finishedStack() {
        System.out.println(stackNum);
    }
}
