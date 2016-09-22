package ch.puzzle.groovy

class SimpleValue {

	def value;
	
	def create (val = value, Closure closure = { it }) {
		def newValue = closure(val)
		new SimpleValue(value: newValue)
	}

	def add (val) {
		this.value += val
	}

	def add (Object... values) {
		values.each { add it }
	}
	
	def apply(Closure closure) {
		value = closure(value)
	}

	void print() {
		println "Current value: $value"
	}

}
