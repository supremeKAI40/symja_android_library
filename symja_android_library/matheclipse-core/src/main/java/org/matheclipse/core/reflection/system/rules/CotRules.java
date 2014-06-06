package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface CotRules {
  final public static IAST RULES = List(
    Set(Cot(Times(C1D4,Pi)),
      C1),
    Set(Cot(Times(QQ(1L,5L),Pi)),
      Times(QQ(1L,5L),Sqrt(Plus(ZZ(25L),Times(ZZ(10L),Sqrt(C5)))))),
    Set(Cot(Times(QQ(1L,6L),Pi)),
      Sqrt(C3)),
    Set(Cot(Times(QQ(1L,8L),Pi)),
      Plus(C1,Sqrt(C2))),
    Set(Cot(Times(QQ(1L,10L),Pi)),
      Sqrt(Plus(C5,Times(C2,Sqrt(C5))))),
    Set(Cot(Times(QQ(1L,12L),Pi)),
      Plus(C2,Sqrt(C3))),
    Set(Cot(C0),
      CComplexInfinity),
    Set(Cot(Times(QQ(5L,12L),Pi)),
      Plus(C2,Times(CN1,Sqrt(C3)))),
    Set(Cot(Times(QQ(2L,5L),Pi)),
      Times(QQ(1L,5L),Sqrt(Plus(ZZ(25L),Times(ZZ(-10L),Sqrt(C5)))))),
    Set(Cot(Times(QQ(3L,10L),Pi)),
      Sqrt(Plus(C5,Times(CN2,Sqrt(C5)))))
  );
}