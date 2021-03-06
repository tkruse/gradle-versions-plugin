package com.github.benmanes.gradle.versions.reporter

import com.github.benmanes.gradle.versions.reporter.result.Result;

/**
 * An interface for reporters.
 *
 * @author Zenedith (zenedith@wp.pl)
 */
public interface Reporter {
  /**
   * Writes the result to the output target
   * 
   * @param target The target, usually a {@link PrintStream}
   * @param result the result of the dependency update analysis
   * @see Result
   */
  def write(target, Result result);

  def getFileName();
}