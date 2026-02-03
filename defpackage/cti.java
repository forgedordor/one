package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cti {
    public static final cth a = new cug(0);

    public static final cth a(int... iArr) {
        int length = iArr.length;
        cug cugVar = new cug(length);
        int i = cugVar.b;
        if (i < 0) {
            cwh.c("");
        }
        cugVar.e(cugVar.b + length);
        int[] iArr2 = cugVar.a;
        int i2 = cugVar.b;
        if (i != i2) {
            fcur.l(iArr2, iArr2, i + length, i, i2);
        }
        fcur.q(iArr, iArr2, i, 0, 12);
        cugVar.b += length;
        return cugVar;
    }

    public static final cug b(int i) {
        cug cugVar = new cug(1);
        cugVar.f(i);
        return cugVar;
    }
}
