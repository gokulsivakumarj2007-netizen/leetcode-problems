/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    // If obj is null/undefined or classFunction is not a valid function/class
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }

    // Get the prototype chain starting point
    // Using Object(obj) handles primitive values by wrapping/boxing them
    let currPrototype = Object.getPrototypeOf(Object(obj));
    const targetPrototype = classFunction.prototype;

    // Traverse up the prototype chain
    while (currPrototype !== null) {
        if (currPrototype === targetPrototype) {
            return true;
        }
        currPrototype = Object.getPrototypeOf(currPrototype);
    }

    return false;
};
