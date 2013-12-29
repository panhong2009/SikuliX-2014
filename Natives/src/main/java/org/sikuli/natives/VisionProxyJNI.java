/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class VisionProxyJNI {
  public final static native long new_FindResults__SWIG_0();
  public final static native long new_FindResults__SWIG_1(long jarg1);
  public final static native long FindResults_size(long jarg1, FindResults jarg1_);
  public final static native long FindResults_capacity(long jarg1, FindResults jarg1_);
  public final static native void FindResults_reserve(long jarg1, FindResults jarg1_, long jarg2);
  public final static native boolean FindResults_isEmpty(long jarg1, FindResults jarg1_);
  public final static native void FindResults_clear(long jarg1, FindResults jarg1_);
  public final static native void FindResults_add(long jarg1, FindResults jarg1_, long jarg2, FindResult jarg2_);
  public final static native long FindResults_get(long jarg1, FindResults jarg1_, int jarg2);
  public final static native void FindResults_set(long jarg1, FindResults jarg1_, int jarg2, long jarg3, FindResult jarg3_);
  public final static native void delete_FindResults(long jarg1);
  public final static native long new_OCRChars__SWIG_0();
  public final static native long new_OCRChars__SWIG_1(long jarg1);
  public final static native long OCRChars_size(long jarg1, OCRChars jarg1_);
  public final static native long OCRChars_capacity(long jarg1, OCRChars jarg1_);
  public final static native void OCRChars_reserve(long jarg1, OCRChars jarg1_, long jarg2);
  public final static native boolean OCRChars_isEmpty(long jarg1, OCRChars jarg1_);
  public final static native void OCRChars_clear(long jarg1, OCRChars jarg1_);
  public final static native void OCRChars_add(long jarg1, OCRChars jarg1_, long jarg2, OCRChar jarg2_);
  public final static native long OCRChars_get(long jarg1, OCRChars jarg1_, int jarg2);
  public final static native void OCRChars_set(long jarg1, OCRChars jarg1_, int jarg2, long jarg3, OCRChar jarg3_);
  public final static native void delete_OCRChars(long jarg1);
  public final static native long new_OCRWords__SWIG_0();
  public final static native long new_OCRWords__SWIG_1(long jarg1);
  public final static native long OCRWords_size(long jarg1, OCRWords jarg1_);
  public final static native long OCRWords_capacity(long jarg1, OCRWords jarg1_);
  public final static native void OCRWords_reserve(long jarg1, OCRWords jarg1_, long jarg2);
  public final static native boolean OCRWords_isEmpty(long jarg1, OCRWords jarg1_);
  public final static native void OCRWords_clear(long jarg1, OCRWords jarg1_);
  public final static native void OCRWords_add(long jarg1, OCRWords jarg1_, long jarg2, OCRWord jarg2_);
  public final static native long OCRWords_get(long jarg1, OCRWords jarg1_, int jarg2);
  public final static native void OCRWords_set(long jarg1, OCRWords jarg1_, int jarg2, long jarg3, OCRWord jarg3_);
  public final static native void delete_OCRWords(long jarg1);
  public final static native long new_OCRLines__SWIG_0();
  public final static native long new_OCRLines__SWIG_1(long jarg1);
  public final static native long OCRLines_size(long jarg1, OCRLines jarg1_);
  public final static native long OCRLines_capacity(long jarg1, OCRLines jarg1_);
  public final static native void OCRLines_reserve(long jarg1, OCRLines jarg1_, long jarg2);
  public final static native boolean OCRLines_isEmpty(long jarg1, OCRLines jarg1_);
  public final static native void OCRLines_clear(long jarg1, OCRLines jarg1_);
  public final static native void OCRLines_add(long jarg1, OCRLines jarg1_, long jarg2, OCRLine jarg2_);
  public final static native long OCRLines_get(long jarg1, OCRLines jarg1_, int jarg2);
  public final static native void OCRLines_set(long jarg1, OCRLines jarg1_, int jarg2, long jarg3, OCRLine jarg3_);
  public final static native void delete_OCRLines(long jarg1);
  public final static native long new_OCRParagraphs__SWIG_0();
  public final static native long new_OCRParagraphs__SWIG_1(long jarg1);
  public final static native long OCRParagraphs_size(long jarg1, OCRParagraphs jarg1_);
  public final static native long OCRParagraphs_capacity(long jarg1, OCRParagraphs jarg1_);
  public final static native void OCRParagraphs_reserve(long jarg1, OCRParagraphs jarg1_, long jarg2);
  public final static native boolean OCRParagraphs_isEmpty(long jarg1, OCRParagraphs jarg1_);
  public final static native void OCRParagraphs_clear(long jarg1, OCRParagraphs jarg1_);
  public final static native void OCRParagraphs_add(long jarg1, OCRParagraphs jarg1_, long jarg2, OCRParagraph jarg2_);
  public final static native long OCRParagraphs_get(long jarg1, OCRParagraphs jarg1_, int jarg2);
  public final static native void OCRParagraphs_set(long jarg1, OCRParagraphs jarg1_, int jarg2, long jarg3, OCRParagraph jarg3_);
  public final static native void delete_OCRParagraphs(long jarg1);
  public final static native void FindResult_x_set(long jarg1, FindResult jarg1_, int jarg2);
  public final static native int FindResult_x_get(long jarg1, FindResult jarg1_);
  public final static native void FindResult_y_set(long jarg1, FindResult jarg1_, int jarg2);
  public final static native int FindResult_y_get(long jarg1, FindResult jarg1_);
  public final static native void FindResult_w_set(long jarg1, FindResult jarg1_, int jarg2);
  public final static native int FindResult_w_get(long jarg1, FindResult jarg1_);
  public final static native void FindResult_h_set(long jarg1, FindResult jarg1_, int jarg2);
  public final static native int FindResult_h_get(long jarg1, FindResult jarg1_);
  public final static native void FindResult_score_set(long jarg1, FindResult jarg1_, double jarg2);
  public final static native double FindResult_score_get(long jarg1, FindResult jarg1_);
  public final static native long new_FindResult__SWIG_0();
  public final static native long new_FindResult__SWIG_1(int jarg1, int jarg2, int jarg3, int jarg4, double jarg5);
  public final static native void FindResult_text_set(long jarg1, FindResult jarg1_, String jarg2);
  public final static native String FindResult_text_get(long jarg1, FindResult jarg1_);
  public final static native void delete_FindResult(long jarg1);
  public final static native long new_OCRRect__SWIG_0();
  public final static native long new_OCRRect__SWIG_1(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void OCRRect_x_set(long jarg1, OCRRect jarg1_, int jarg2);
  public final static native int OCRRect_x_get(long jarg1, OCRRect jarg1_);
  public final static native void OCRRect_y_set(long jarg1, OCRRect jarg1_, int jarg2);
  public final static native int OCRRect_y_get(long jarg1, OCRRect jarg1_);
  public final static native void OCRRect_height_set(long jarg1, OCRRect jarg1_, int jarg2);
  public final static native int OCRRect_height_get(long jarg1, OCRRect jarg1_);
  public final static native void OCRRect_width_set(long jarg1, OCRRect jarg1_, int jarg2);
  public final static native int OCRRect_width_get(long jarg1, OCRRect jarg1_);
  public final static native void delete_OCRRect(long jarg1);
  public final static native long new_OCRChar(String jarg1, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native void OCRChar_ch_set(long jarg1, OCRChar jarg1_, String jarg2);
  public final static native String OCRChar_ch_get(long jarg1, OCRChar jarg1_);
  public final static native void delete_OCRChar(long jarg1);
  public final static native void OCRWord_score_set(long jarg1, OCRWord jarg1_, float jarg2);
  public final static native float OCRWord_score_get(long jarg1, OCRWord jarg1_);
  public final static native String OCRWord_getString(long jarg1, OCRWord jarg1_);
  public final static native long OCRWord_getChars(long jarg1, OCRWord jarg1_);
  public final static native long new_OCRWord();
  public final static native void delete_OCRWord(long jarg1);
  public final static native String OCRLine_getString(long jarg1, OCRLine jarg1_);
  public final static native long OCRLine_getWords(long jarg1, OCRLine jarg1_);
  public final static native long new_OCRLine();
  public final static native void delete_OCRLine(long jarg1);
  public final static native long OCRParagraph_getLines(long jarg1, OCRParagraph jarg1_);
  public final static native long new_OCRParagraph();
  public final static native void delete_OCRParagraph(long jarg1);
  public final static native String OCRText_getString(long jarg1, OCRText jarg1_);
  public final static native long OCRText_getWords(long jarg1, OCRText jarg1_);
  public final static native long OCRText_getParagraphs(long jarg1, OCRText jarg1_);
  public final static native long new_OCRText();
  public final static native void delete_OCRText(long jarg1);
  public final static native long new_FindInput__SWIG_0();
  public final static native long new_FindInput__SWIG_1(long jarg1, Mat jarg1_, long jarg2, Mat jarg2_);
  public final static native long new_FindInput__SWIG_2(long jarg1, Mat jarg1_, int jarg2, String jarg3);
  public final static native long new_FindInput__SWIG_3(String jarg1, int jarg2, String jarg3);
  public final static native long new_FindInput__SWIG_4(long jarg1, Mat jarg1_, int jarg2);
  public final static native long new_FindInput__SWIG_5(String jarg1, int jarg2);
  public final static native long new_FindInput__SWIG_6(long jarg1, Mat jarg1_, long jarg2, FindInput jarg2_);
  public final static native void FindInput_setSource__SWIG_0(long jarg1, FindInput jarg1_, String jarg2);
  public final static native void FindInput_setTarget__SWIG_0(long jarg1, FindInput jarg1_, int jarg2, String jarg3);
  public final static native void FindInput_setSource__SWIG_1(long jarg1, FindInput jarg1_, long jarg2, Mat jarg2_);
  public final static native void FindInput_setTarget__SWIG_1(long jarg1, FindInput jarg1_, long jarg2, Mat jarg2_);
  public final static native long FindInput_getSourceMat(long jarg1, FindInput jarg1_);
  public final static native long FindInput_getTargetMat(long jarg1, FindInput jarg1_);
  public final static native void FindInput_setFindAll(long jarg1, FindInput jarg1_, boolean jarg2);
  public final static native boolean FindInput_isFindingAll(long jarg1, FindInput jarg1_);
  public final static native void FindInput_setLimit(long jarg1, FindInput jarg1_, int jarg2);
  public final static native int FindInput_getLimit(long jarg1, FindInput jarg1_);
  public final static native void FindInput_setSimilarity(long jarg1, FindInput jarg1_, double jarg2);
  public final static native double FindInput_getSimilarity(long jarg1, FindInput jarg1_);
  public final static native int FindInput_getTargetType(long jarg1, FindInput jarg1_);
  public final static native String FindInput_getTargetText(long jarg1, FindInput jarg1_);
  public final static native void delete_FindInput(long jarg1);
  public final static native long Vision_find(long jarg1, FindInput jarg1_);
  public final static native long Vision_findChanges(long jarg1, FindInput jarg1_);
  public final static native double Vision_compare(long jarg1, Mat jarg1_, long jarg2, Mat jarg2_);
  public final static native void Vision_initOCR(String jarg1);
  public final static native long Vision_recognize_as_ocrtext(long jarg1, Mat jarg1_);
  public final static native String Vision_recognize(long jarg1, Mat jarg1_);
  public final static native String Vision_recognizeWord(long jarg1, Mat jarg1_);
  public final static native long Vision_createMat(int jarg1, int jarg2, byte[] jarg3);
  public final static native void Vision_setParameter(String jarg1, float jarg2);
  public final static native float Vision_getParameter(String jarg1);
  public final static native long new_Vision();
  public final static native void delete_Vision(long jarg1);
  public final static native void setDebug(int jarg1, int jarg2);
  public final static native void OCR_setParameter(String jarg1, String jarg2);
  public final static native long new_OCR();
  public final static native void delete_OCR(long jarg1);
  public final static native long new_Mat();
  public final static native void delete_Mat(long jarg1);
  public final static native long OCRChar_SWIGUpcast(long jarg1);
  public final static native long OCRWord_SWIGUpcast(long jarg1);
  public final static native long OCRLine_SWIGUpcast(long jarg1);
  public final static native long OCRParagraph_SWIGUpcast(long jarg1);
  public final static native long OCRText_SWIGUpcast(long jarg1);
}
