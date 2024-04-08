package es.jeiroa.exercises.factorial;

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
 * Benchmark                   Mode  Cnt    Score   Error  Units
 * BenchmarkRunner.factorial1  avgt   25    7,041 ± 0,047  ns/op
 * BenchmarkRunner.factorial2  avgt   25   11,109 ± 0,271  ns/op
 * BenchmarkRunner.factorial3  avgt   25   47,474 ± 2,681  ns/op
 * BenchmarkRunner.factorial4  avgt   25  200,742 ± 3,572  ns/op
 */
public class BenchmarkRunner {

	private Factorial unit = null;

	@Setup
	public void prepare() {
		unit = new Factorial();
	}

	@Benchmark
	public void factorial1(Blackhole bh) {
		bh.consume(unit.factorial1(8));
	}

	@Benchmark
	public void factorial2(Blackhole bh) {
		bh.consume(unit.factorial2(8));
	}

	@Benchmark
	public void factorial3(Blackhole bh) {
		bh.consume(unit.factorial3(8));
	}

	@Benchmark
	public void factorial4(Blackhole bh) {
		bh.consume(unit.factorial4(8));
	}

	public static void main(String[] args) throws RunnerException, IOException {
		Options opt = new OptionsBuilder()
				.include(BenchmarkRunner.class.getSimpleName())
				.forks(1)
				.build();

		new Runner(opt).run();
	}

}
