/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class Vision {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Vision(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vision obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_Vision(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static FindResults find(FindInput q) {
    return new FindResults(VisionProxyJNI.Vision_find(FindInput.getCPtr(q), q), true);
  }

  public static FindResults findChanges(FindInput q) {
    return new FindResults(VisionProxyJNI.Vision_findChanges(FindInput.getCPtr(q), q), true);
  }

  public static double compare(Mat m1, Mat m2) {
    return VisionProxyJNI.Vision_compare(Mat.getCPtr(m1), m1, Mat.getCPtr(m2), m2);
  }

  public static void initOCR(String ocrDataPath) {
    VisionProxyJNI.Vision_initOCR(ocrDataPath);
  }

  public static OCRText recognize_as_ocrtext(Mat image) {
    return new OCRText(VisionProxyJNI.Vision_recognize_as_ocrtext(Mat.getCPtr(image), image), true);
  }

  public static String recognize(Mat image) {
    return VisionProxyJNI.Vision_recognize(Mat.getCPtr(image), image);
  }

  public static String recognizeWord(Mat image) {
    return VisionProxyJNI.Vision_recognizeWord(Mat.getCPtr(image), image);
  }

  public static Mat createMat(int _rows, int _cols, byte[] _data) {
    return new Mat(VisionProxyJNI.Vision_createMat(_rows, _cols, _data), true);
  }

  public static void setParameter(String param, float val) {
    VisionProxyJNI.Vision_setParameter(param, val);
  }

  public static float getParameter(String param) {
    return VisionProxyJNI.Vision_getParameter(param);
  }

  public Vision() {
    this(VisionProxyJNI.new_Vision(), true);
  }

}
