var perfectNumber = require('../src/perfectNumber').PerfectNumberFunctional;

exports.testCanary = function(test) {
	test.ok(true);
	test.done();
}

exports.testGetFactorsCorrectNumberOfFactors = function(test){
	test.ok(perfectNumber.isPerfect(6));
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