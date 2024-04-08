package es.jeiroa.exercises.palindrome;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
/**
 * Benchmark                      Mode  Cnt   Score   Error  Units
 * BenchmarkRunner.isPalindrome1  avgt   25   7,551 ± 0,038  ns/op
 * BenchmarkRunner.isPalindrome2  avgt   25  25,435 ± 0,162  ns/op
 */
public class BenchmarkRunner {

	private Palindrome unit =  null;

	@Setup
	public void prepare() {
		unit = new Palindrome();
	}
	
	@Benchmark
	public void isPalindrome1(Blackhole bh) {
		bh.consume(unit.isPalindrome1("racecar"));
	}
	
	@Benchmark
	public void isPalindrome2(Blackhole bh) {
		bh.consume(unit.isPalindrome2("racecar"));
	}
	
	public static void main(String[] args) throws RunnerException, IOException {
		Options opt = new OptionsBuilder()
				.include(BenchmarkRunner.class.getSimpleName())
				.forks(1)
				.build();

		new Runner(opt).run();
	}

}
