package io.hyperfoil.core.writer;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import io.hyperfoil.api.config.Benchmark;
import io.hyperfoil.core.session.BaseBenchmarkParserTest;

public class BenchmarkWriterTest extends BaseBenchmarkParserTest {

   @Test
   void testWrite() throws IOException {
      Benchmark benchmark = loadScenario("scenarios/simple.hf.yaml");
      new BenchmarkWriter().write(benchmark, new FileWriter("/tmp/BenchmarkWriterTest.yml"));
   }
}
