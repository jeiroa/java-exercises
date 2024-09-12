package es.jeiroa.exercises.reverse;

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
 * Benchmark                 Mode  Cnt    Score   Error  Units
 * BenchmarkRunner.reverse1  avgt   25   50,766 ± 0,721  ns/op
 * BenchmarkRunner.reverse2  avgt   25   21,219 ± 0,644  ns/op
 * BenchmarkRunner.reverse3  avgt   25   22,948 ± 0,381  ns/op
 * BenchmarkRunner.reverse4  avgt   25  224,600 ± 2,957  ns/op
 */
public class BenchmarkRunner {

	private Reverse unit = null;

	private String word = "stressed";

	@Setup
	public void prepare() {
		unit = new Reverse();
	}

	@Benchmark
	public void reverse1(Blackhole bh) {
		bh.consume(unit.reverse1(word));
	}

	@Benchmark
	public void reverse2(Blackhole bh) {
		bh.consume(unit.reverse2(word));
	}

	@Benchmark
	public void reverse3(Blackhole bh) {
		bh.consume(unit.reverse3(word));
	}

	@Benchmark
	public void reverse4(Blackhole bh) {
		bh.consume(unit.reverse4(word));
	}

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(BenchmarkRunner.class.getSimpleName())
				.forks(1)
				.build();

		new Runner(opt).run();
	}

}
