/**
Write a function that checks if a given value is an instance of a given class or superclass. 
For this problem, an object is considered an instance of a given class if that object has 
access to that class's methods.
*/

/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
  while (obj != null){
    /**if the object's constructor is apart of the class than 
    the object is an instance of that class*/
    if (obj.constructor === classFunction){
        return true;
    }
    /**stores the protype of obj and if it's the same as class it's an instance */
    obj = Object.getPrototypeOf(obj)
  }
  /**returns false if object is null or if the conditions are not met*/
  return false;
};

/**
notes: 
-inheritance is achieved with the prototype chain 
-object.getPrototypeOf(obj) can get the prototype of an object
-first test gave a false positive for test three 
 */
