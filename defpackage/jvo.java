package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvo {
    public static final long a = kjl.a;

    public static final jvn a(jvn jvnVar, int i, int i2, long j, khu khuVar, jvr jvrVar, khi khiVar, int i3, int i4, khw khwVar) {
        long j2;
        long j3;
        int i5 = i;
        int i6 = i2;
        khu khuVar2 = khuVar;
        khi khiVar2 = khiVar;
        int i7 = i3;
        int i8 = i4;
        khw khwVar2 = khwVar;
        if (khk.b(i5, Integer.MIN_VALUE) || khk.b(i5, jvnVar.a)) {
            if (kjl.b(j) == 0) {
                j2 = 0;
                j3 = j;
            } else {
                j2 = 0;
                j3 = j;
                if (kjl.e(j3, jvnVar.c)) {
                }
            }
            if ((khuVar2 == null || fdbq.f(khuVar2, jvnVar.d)) && ((khm.b(i6, Integer.MIN_VALUE) || khm.b(i6, jvnVar.b)) && ((jvrVar == null || fdbq.f(jvrVar, jvnVar.e)) && ((khiVar2 == null || fdbq.f(khiVar2, jvnVar.f)) && ((khd.b(i7, 0) || khd.b(i7, jvnVar.g)) && ((kgz.b(i8, Integer.MIN_VALUE) || kgz.b(i8, jvnVar.h)) && (khwVar2 == null || fdbq.f(khwVar2, jvnVar.i)))))))) {
                return jvnVar;
            }
        } else {
            j2 = 0;
            j3 = j;
        }
        if (kjl.b(j3) == j2) {
            j3 = jvnVar.c;
        }
        if (khuVar2 == null) {
            khuVar2 = jvnVar.d;
        }
        if (khk.b(i5, Integer.MIN_VALUE)) {
            i5 = jvnVar.a;
        }
        if (khm.b(i6, Integer.MIN_VALUE)) {
            i6 = jvnVar.b;
        }
        jvr jvrVar2 = jvnVar.e;
        if (jvrVar2 == null || jvrVar != null) {
            jvrVar2 = jvrVar;
        }
        if (khiVar2 == null) {
            khiVar2 = jvnVar.f;
        }
        if (khd.b(i7, 0)) {
            i7 = jvnVar.g;
        }
        if (kgz.b(i8, Integer.MIN_VALUE)) {
            i8 = jvnVar.h;
        }
        if (khwVar2 == null) {
            khwVar2 = jvnVar.i;
        }
        return new jvn(i5, i6, j3, khuVar2, jvrVar2, khiVar2, i7, i8, khwVar2);
    }
}
