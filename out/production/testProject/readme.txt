/* *****************************************************************************
 *  Name: Akbota Assan
 *
 *
 **************************************************************************** */

Programming Assignment 2: Deques and Randomized Queues


/* *****************************************************************************
 *  Explain briefly how you implemented the randomized queue and deque.
 *  Which data structure did you choose (array, linked list, etc.)
 *  and why?
 **************************************************************************** */
For the dequeue problem, I have implemented a linked list.
The key is to track both left and right links of a given node and shift the value of
start (the value that's on the left side if a linked list) and end (the value that is at the end of the list)

For the randomized queue, I used an array, which gets elongated (new array is created
with a size increment of a 100) whenever pushing a new object into the queue
leads to the array not having enough space to store it.


/* ****************************

*************************************************
 *  How much memory (in bytes) do your data types use to store n items
 *  in the worst case? Use the 64-bit memory cost model from Section
 *  1.4 of the textbook and use tilde notation to simplify your answer.
 *  Briefly justify your answers and show your work.
 *
 *  Do not include the memory for the items themselves (as this
 *  memory is allocated by the client and depends on the item type)
 *  or for any iterators, but do include the memory for the references
 *  to the items (in the underlying array or linked list).
 **************************************************************************** */

Randomized Queue:   ~  12n + 4  bytes

Deque:              ~  (12 + 16)*n + 16 + 4 = 28n + 20 bytes

Assuming that both classes take in the heaviest object type with a size of 12 bytes per item,
and n being the number of items within the container, we can conclude that the storage of the
container itself, in the worst-case scenario, can not be greater than 12n. Additionally,
the storage of the size of the container takes up 4 bytes (given that size is of type int).


However, in the case of deque, we also need to store the pointers to the right and left nodes of a
given item, which leads to the size of the container being (12 + 16)n. Additionally,
we need to consider pointers to the start and end of the queue, which takes up 16 bytes.
At last, the size of the container weighs 4 bytes (given that size is of type int).


/* *****************************************************************************
 *  Known bugs / limitations.
 **************************************************************************** */


/* *****************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 **************************************************************************** */




/* *****************************************************************************
 *  Describe any serious problems you encountered.
 **************************************************************************** */



/* *****************************************************************************
 *  List any other comments here. Feel free to provide any feedback
 *  on how much you learned from doing the assignment, and whether
 *  you enjoyed doing it.
 **************************************************************************** */