/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class OCRChar extends OCRRect {
  private long swigCPtr;

  protected OCRChar(long cPtr, boolean cMemoryOwn) {
    super(VisionProxyJNI.OCRChar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCRChar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_OCRChar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OCRChar(String ch_, int x_, int y_, int width_, int height_) {
    this(VisionProxyJNI.new_OCRChar(ch_, x_, y_, width_, height_), true);
  }

  public void setCh(String value) {
    VisionProxyJNI.OCRChar_ch_set(swigCPtr, this, value);
  }

  public String getCh() {
    return VisionProxyJNI.OCRChar_ch_get(swigCPtr, this);
  }

}
