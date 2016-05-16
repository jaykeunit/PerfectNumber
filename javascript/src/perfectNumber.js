var underscore = require("underscore");


exports.PerfectNumberImperative = {
  getFactors: function(number) {
    var factors = [];
    for(i = 0; i < number; i++) {
      if (number % i === 0)
        factors.push(i);
    }
    return factors;
  },

  getSum: function(numbers) {
    var sum = 0;
    for(var i in numbers){
      sum += numbers[i];
    }
    return sum;
  },

  isPerfect: function(number) {
    return number > 0 && this.getSum(this.getFactors(number)) === number;
  }
}

exports.PerfectNumberFunctional = {

  isPerfect: function(number) {
    return number > 0 && underscore.range(1, number).filter(function(n){return number % n === 0})
                                                    .reduce(function(j, k){return j + k}, 0) === number;
  }
}