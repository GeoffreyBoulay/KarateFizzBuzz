function(array, comparator) {
    var result = true;
    for(var i = 1; i < array.length  && result ; i++) {
        if(! comparator(array[i - 1], array[i])) {
          result = false;
      }
    }
    return result;
}