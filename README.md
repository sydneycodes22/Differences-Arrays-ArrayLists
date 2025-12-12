Arrays and Array Lists have similarities but also have differences. Below I will go into the specifics of those differences. Each portion mentioned is also referenced in my code attached below and found at https://github.com/sydneycodes22/Differences-Arrays-ArrayLists
Array vs ArrayList
    -	Fixed Size vs Dynamic Sizing
        o	If an array is declared as size 10 then it will always be size 10. No more no less.
        o	An ArrayList does not need to be declared with a size and can constantly add and/or remove elements from the list.
    -	Faster Access vs Slower Access
        o	Since the array is a fixed size, the developer can access any element at anytime from the array through 
            indexing which the value. There will always be 10 elements to access if the array is declared as having size 10.
        o	A developer can technically access any element from an ArrayList at any time, but since the size of the array is
            dynamic it is best practice to access multiple elements through a for-loop. Also since elements can be added 
            or removed in the middle of an ArrayList it takes more time to shift every element.
    -	Limited Functionality vs Built-In Methods
        o   There are no built-in methods that are specific to java arrays. 
            Since the size is constant there are no built-in methods to add or remove values.
        o	ArrayLists utilize an imported library that provides an array of functionality specific to the ArrayList. 
            The imported library essentially provides a class of functions to help access/edit/remove elements from the ArrayList.
    -	Syntax Differences
        o	As mentioned above there a no built-in methods, so the syntax to access and update elements is very basic. 
            Accessing and/or setting elements in an Array utilize simple indexing
                	Ex. arr[0], arr[0] = 10
        o	Since the ArrayList utilizes functions from the import library they access and set 
            elements utilizing specific functions
                	Ex. list.set(1,10), list.get(0)
