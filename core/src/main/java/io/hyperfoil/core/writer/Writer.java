package io.hyperfoil.core.writer;

import java.io.OutputStreamWriter;

public interface Writer<T> {
   void write(T target, OutputStreamWriter writer);
}
