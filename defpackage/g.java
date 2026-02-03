package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class g {
    public static final int a(eslo esloVar, int i, int i2) {
        esloVar.o(2);
        esloVar.t(1, i2);
        esloVar.t(0, i);
        return esloVar.b();
    }

    public static final int b(eslo esloVar, int[] iArr) {
        int length = iArr.length;
        esloVar.p(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return esloVar.c();
            }
            esloVar.i(iArr[length]);
        }
    }

    public static final int c(eslo esloVar, double[] dArr) {
        int length = dArr.length;
        esloVar.p(8, length, 8);
        while (true) {
            length--;
            if (length < 0) {
                return esloVar.c();
            }
            esloVar.f(dArr[length]);
        }
    }
}
