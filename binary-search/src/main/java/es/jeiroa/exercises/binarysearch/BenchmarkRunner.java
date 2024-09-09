package es.jeiroa.exercises.binarysearch;

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
 * > mvn clean package
 * > java -jar factorial/target/benchmarks.jar
 *
 * Benchmark               Mode  Cnt  Score   Error  Units
 * BenchmarkRunner.search  avgt   25  7,483 ± 0,524  ns/op
 */
public class BenchmarkRunner {

	private BinarySearch unit = null;

	@Setup
	public void prepare() {
		unit = new BinarySearch();
	}

	@Benchmark
	public void search(Blackhole bh) {
		bh.consume(unit.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
	}

	public static void main(String[] args) throws RunnerException, IOException {
		Options opt = new OptionsBuilder()
				.include(BenchmarkRunner.class.getSimpleName())
				.forks(1)
				.build();

		new Runner(opt).run();
	}

}
