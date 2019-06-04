function(array, samePredicate) {
    var result = true;
    for(var i = 0; i < array.length && result ; i++) {
      for(var j = i + 1 ; j < array.length && result ; j++) {
        if(samePredicate(array[i],array[j])) {
          result = false;
        }
      }
    }
    return result;
}