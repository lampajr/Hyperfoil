package io.sailrocket.core.extractors;

import io.netty.buffer.ByteBuf;
import io.sailrocket.api.Session;
import io.sailrocket.core.machine.ResourceUtilizer;

public class CountRecorder implements Session.Processor, ResourceUtilizer {
   private final String var;

   public CountRecorder(String var) {
      this.var = var;
   }

   @Override
   public void before(Session session) {
      session.setInt(var, 0);
   }

   @Override
   public void process(Session session, ByteBuf data, int offset, int length, boolean isLastPart) {
      if (isLastPart) {
         session.addToInt(var, 1);
      }
   }

   @Override
   public void reserve(io.sailrocket.core.machine.Session session) {
      session.declareInt(var);
   }
}