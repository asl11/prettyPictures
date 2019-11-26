/*
 * This code is part of Rice Comp215 and is made available for your
 * use as a student in Comp215. You are specifically forbidden from
 * posting this code online in a public fashion (e.g., on a public
 * GitHub repository) or otherwise making it, or any derivative of it,
 * available to future Comp215 students. Violations of this rule are
 * considered Honor Code violations and will result in your being
 * reported to the Honor Council, even after you've completed the
 * class, and will result in retroactive reductions to your grade. For
 * additional details, please see the Comp215 course syllabus.
 */

package edu.rice.tree;

import edu.rice.autograder.annotations.Grade;
import io.vavr.collection.Seq;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class ETreapTest {
  /** Run the full test suite on a deterministic treap. */
  @TestFactory
  @Grade(project = "Week10", topic = "Treaps", points = 0.5, maxPoints = 0.5)
  public Seq<DynamicTest> testSuite() {
    // insert 1000 sequential numbers, expected maxDepth <= 30
    return TreeSuite.allTreeTests("etreap", ETreap.empty(), ETreap.empty(), true)
        .appendAll(
            TreeSuite.sundayDepthTests("etreap", ETreap.empty(), ETreap.empty(), 1000, 30, 30));
  }
}
