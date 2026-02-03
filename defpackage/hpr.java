package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class hpr {
    public static final int a(cug cugVar) {
        int iA;
        int iA2 = cugVar.a(0);
        while (cugVar.b != 0 && cugVar.a(0) == iA2) {
            cugVar.g(0, cugVar.b());
            cugVar.c(cugVar.b - 1);
            int i = cugVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iA3 = cugVar.a(i3);
                int i4 = i3 + 1;
                int i5 = i4 + i4;
                int i6 = i5 - 1;
                int iA4 = cugVar.a(i6);
                if (i5 >= i || (iA = cugVar.a(i5)) <= iA4) {
                    if (iA4 > iA3) {
                        cugVar.g(i3, iA4);
                        cugVar.g(i6, iA3);
                        i3 = i6;
                    }
                } else if (iA > iA3) {
                    cugVar.g(i3, iA);
                    cugVar.g(i5, iA3);
                    i3 = i5;
                }
            }
        }
        return iA2;
    }

    public static final void b(cug cugVar, int i) {
        if (cugVar.b == 0 || !(cugVar.a(0) == i || cugVar.a(cugVar.b - 1) == i)) {
            int i2 = cugVar.b;
            cugVar.f(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = cugVar.a(i3);
                if (i <= iA) {
                    break;
                }
                cugVar.g(i2, iA);
                i2 = i3;
            }
            cugVar.g(i2, i);
        }
    }

    public static final boolean c(cug cugVar) {
        return cugVar.b != 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
