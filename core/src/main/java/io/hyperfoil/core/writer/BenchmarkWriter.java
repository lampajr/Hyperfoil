package io.hyperfoil.core.writer;

import java.io.OutputStreamWriter;

import org.yaml.snakeyaml.Yaml;

import io.hyperfoil.api.config.Benchmark;

public class BenchmarkWriter implements Writer<Benchmark> {

   @Override
   public void write(Benchmark target, OutputStreamWriter writer) {
      Yaml yaml = new Yaml();

      yaml.dump(target, writer);
   }
}
