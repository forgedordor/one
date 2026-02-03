package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhv {
    private final fdhz[] a;

    public fdhv(int i) {
        fdhz[] fdhzVarArr = new fdhz[i];
        for (int i2 = 0; i2 < i; i2++) {
            fdhzVarArr[i2] = new fdhz(null, fdia.a);
        }
        this.a = fdhzVarArr;
    }

    public final fdhz a(int i) {
        return this.a[i];
    }
}
