package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dea {
    public static final dfu a(fdap fdapVar) {
        dft dftVar = new dft();
        fdapVar.invoke(dftVar);
        return new dfu(dftVar);
    }

    public static /* synthetic */ dgi b(float f, float f2, Object obj, int i) {
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new dgi(f, f2, obj);
    }

    public static /* synthetic */ dia c(int i, int i2, des desVar, int i3) {
        if ((i3 & 4) != 0) {
            desVar = dev.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new dia(i, i2, desVar);
    }

    public static /* synthetic */ dff d(der derVar, int i, long j, int i2) {
        if ((i2 & 4) != 0) {
            j = dgm.b(0);
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return new dff(derVar, i, j);
    }
}
