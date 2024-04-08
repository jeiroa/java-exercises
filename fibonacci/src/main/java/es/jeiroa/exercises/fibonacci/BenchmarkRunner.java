package es.jeiroa.exercises.fibonacci;

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
 * Benchmark                   Mode  Cnt      Score      Error  Units
 * BenchmarkRunner.fibonacci1  avgt   25  48272,353 ± 1195,199  ns/op
 * BenchmarkRunner.fibonacci2  avgt   25  49927,866 ± 1134,263  ns/op
 */
public class BenchmarkRunner {

	private Fibonacci unit = null;

	@Setup
	public void prepare() {
		unit = new Fibonacci();
	}

	@Benchmark
	public void fibonacci1(Blackhole bh) {
		bh.consume(unit.fibonacci1(6));
	}

	@Benchmark
	public void fibonacci2(Blackhole bh) {
		bh.consume(unit.fibonacci2(6));
	}

	public static void main(String[] args) throws RunnerException, IOException {
		Options opt = new OptionsBuilder()
				.include(BenchmarkRunner.class.getSimpleName())
				.forks(1)
				.build();

		new Runner(opt).run();
	}

}
