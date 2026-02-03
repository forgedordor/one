package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nii {
    public final int a;
    public final ngo[] b;
    public final int[] c;
    public final int[][][] d;
    public final ngo e;
    private final int[] f;

    public nii(int[] iArr, ngo[] ngoVarArr, int[] iArr2, int[][][] iArr3, ngo ngoVar) {
        this.f = iArr;
        this.b = ngoVarArr;
        this.d = iArr3;
        this.c = iArr2;
        this.e = ngoVar;
        this.a = iArr.length;
    }

    public final int a(int i) {
        return this.f[i];
    }

    public final int b(int i, int i2, int i3) {
        return mti.e(this.d[i][i2][i3]);
    }

    public final ngo c(int i) {
        return this.b[i];
    }
}
