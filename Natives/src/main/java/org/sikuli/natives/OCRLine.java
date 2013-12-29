/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class OCRLine extends OCRRect {
  private long swigCPtr;

  protected OCRLine(long cPtr, boolean cMemoryOwn) {
    super(VisionProxyJNI.OCRLine_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCRLine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_OCRLine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String getString() {
    return VisionProxyJNI.OCRLine_getString(swigCPtr, this);
  }

  public OCRWords getWords() {
    return new OCRWords(VisionProxyJNI.OCRLine_getWords(swigCPtr, this), true);
  }

  public OCRLine() {
    this(VisionProxyJNI.new_OCRLine(), true);
  }

}
