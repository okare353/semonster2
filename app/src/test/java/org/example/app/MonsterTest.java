package org.example.app;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testToString() {
    Monster monster = new Monster(3, 0);
    Assert.assertEquals("デュラハン:レア度[0]\n", monster.toString());
  }
}
