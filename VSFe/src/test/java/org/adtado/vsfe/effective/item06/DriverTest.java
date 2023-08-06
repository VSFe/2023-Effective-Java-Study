package org.adtado.vsfe.effective.item06;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class DriverTest {
	@Test
	@DisplayName("벤치마크")
	public void test1() throws RunnerException {
		var options = new OptionsBuilder()
			.include(this.getClass().getName() + ".*")
			.mode(Mode.AverageTime)
			.warmupTime(TimeValue.seconds(1))
			.warmupIterations(3)
			.threads(1)
			.measurementIterations(3)
			.forks(1)
			.shouldFailOnError(true)
			.shouldDoGC(true)
			.build();

		new Runner(options).run();
	}

	@Benchmark
	@BenchmarkMode(Mode.All)
	@OutputTimeUnit(TimeUnit.MILLISECONDS)
	public void testBadCase() throws Exception {
		Driver.testCase(50000000, UserBadCase.class.getSimpleName());
	}

	@Benchmark
	@BenchmarkMode(Mode.All)
	@OutputTimeUnit(TimeUnit.MILLISECONDS)
	public void testGoodCase() throws Exception {
		Driver.testCase(50000000, UserGoodCase.class.getSimpleName());
	}
}
