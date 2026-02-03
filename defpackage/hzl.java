package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzl {
    public final cul a;

    public hzl(long[] jArr) {
        cul culVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            int length = jArrCopyOf.length;
            culVar = new cul(length);
            int i = culVar.b;
            jArrCopyOf.getClass();
            if (i < 0) {
                cwh.c("");
            }
            if (length != 0) {
                culVar.a(culVar.b + length);
                long[] jArr2 = culVar.a;
                int i2 = culVar.b;
                if (i != i2) {
                    fcur.m(jArr2, jArr2, i + length, i, i2);
                }
                fcur.m(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                culVar.b += length;
            }
        } else {
            culVar = new cul((byte[]) null);
        }
        this.a = culVar;
    }
}
