package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cst {
    public static final int a(css cssVar, int i) {
        try {
            return cwe.a(cssVar.a, cssVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int b(css cssVar, Object obj, int i) {
        int i2 = cssVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iA = a(cssVar, i);
        if (iA < 0 || fdbq.f(obj, cssVar.b[iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && cssVar.a[i3] == i) {
            if (fdbq.f(obj, cssVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && cssVar.a[i4] == i; i4--) {
            if (fdbq.f(obj, cssVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final int c(css cssVar) {
        return b(cssVar, null, 0);
    }

    public static final void d(css cssVar, int i) {
        cssVar.a = new int[i];
        cssVar.b = new Object[i];
    }
}
