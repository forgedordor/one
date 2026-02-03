package defpackage;

import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idz {
    public static final void a(ied iedVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        jsn jsnVar;
        jsl jslVar;
        jrn jrnVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM115m = air$$ExternalSyntheticApiModelOutline1.m115m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM115m != null && (value = viewTranslationResponseM115m.getValue("android:text")) != null && (text = value.getText()) != null && (jsnVar = (jsn) iedVar.g().a((int) jKeyAt)) != null && (jslVar = jsnVar.a) != null && (jrnVar = (jrn) jsd.a(jslVar.c, jsa.k)) != null) {
            }
        }
    }
}
