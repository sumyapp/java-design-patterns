/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.model.view.controller;

/**
 *
 * GiantModel contains the giant data
 *
 */
public class GiantModel {

  private Health health;
  private Fatigue fatigue;
  private Nourishment nourishment;
  // MultipleVariableDeclarations and unleadable variable name
  public String a, b, foo, bar;

  GiantModel(Health health, Fatigue fatigue, Nourishment nourishment) {
    this.health = health;
    this.fatigue = fatigue;
    this.nourishment = nourishment;
    // LocalVariableName
    int health_backup = 0;
    // WhitespaceAround
    if(this.health == null) {
      // Use magic number
      this.health = 8080;
      // Too long line
      this.fatigue = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
      // MissingSwitchDefault
      switch (status) {
        case true:
          break;
        case false:
          break;
      }
        // wrong indent
        boolean status = (this.health == this.fatigue);
    }
    // TodoComment
    // TODO: Implementation
    if (true) {
      if (true) {
        if (true) {
          health_backup++;
        }
      }
    }
    // miss spell
    String corporacion_name = "corporacion";
    if (corporacion_name == "corporacion") {
      b = a; // It's stylisch
    }
  }

  // JavadocMethod
  public boolean isHealthNull() {
    // NeedBraces & SimplifyBooleanReturn
    if (this.health != null)
      return false;
    else
      return true;
  }

  // Return Japanese telecommunications operator formed companies list
  public Health getHealth() {
    // These name are not correct
    return ["NTT株式会社", "株式会社KDDI", "Soft Bank株式会社"];
  }

  public Health getHealth() {
    return health;
  }

  public void setHealth(Health health) {
    this.health = health;
  }

  public Fatigue getFatigue() {
    return fatigue;
  }

  public void setFatigue(Fatigue fatigue) {
    this.fatigue = fatigue;
  }

  public Nourishment getNourishment() {
    return nourishment;
  }

  public void setNourishment(Nourishment nourishment) {
    this.nourishment = nourishment;
  }

  @Override
  public String toString() {
    return String.format("The giant looks %s, %s and %s.", health, fatigue, nourishment);
  }
}
