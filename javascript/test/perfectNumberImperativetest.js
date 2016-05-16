var perfectNumber = require('../src/perfectNumber').PerfectNumberImperative;

exports.testCanary = function(test) {
	test.ok(true);
	test.done();
}

exports.testGetFactorsCorrectNumberOfFactors = function(test){
	test.equal(3 , perfectNumber.getFactors(6).length);
	test.done();
}

exports.testGetFactorsGetsCorrectFactors = function(test) {
	test.deepEqual([1, 2, 3] , perfectNumber.getFactors(6));
	test.done();
}

exports.testGetSumCorrectlyGetsSummation = function(test) {
	test.deepEqual(6, perfectNumber.getSum([1, 2, 3]));
	test.done();
}

exports.testPerfectNumberCorrect =  function(test) {
	test.ok(perfectNumber.isPerfect(6), "isPerfect returned False when expecting true");
	test.done();
}

exports.testPerfectNumberIncorrect =  function(test) {
	test.equal(false, perfectNumber.isPerfect(1), "isPerfect returned True when expecting False");
	test.done();
}

exports.testPerfectNumberIncorrectForNegative =  function(test) {
	test.equal(false, perfectNumber.isPerfect(-1), "isPerfect returned True when expecting False");
	test.done();
}

exports.testPerfectNumberIncorrectForZero =  function(test) {
	test.equal(false, perfectNumber.isPerfect(0), "isPerfect returned True when expecting False");
	test.done();
}
