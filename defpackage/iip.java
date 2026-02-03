package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iip {
    public static final void a(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int[] b(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ijg.b(((ije) list.get(i)).i);
        }
        return iArr;
    }

    public static final Shader c(long j, long j2, List list, List list2) {
        a(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), b(list), list2 != null ? fcva.aB(list2) : null, iiq.a(0));
    }
}
