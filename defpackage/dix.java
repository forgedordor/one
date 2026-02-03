package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dix implements dej {
    private final dfb[] a;

    public dix(deh dehVar, float f, float f2) {
        int iB = dehVar.b();
        dfb[] dfbVarArr = new dfb[iB];
        for (int i = 0; i < iB; i++) {
            dfbVarArr[i] = new dfb(f, f2, dehVar.a(i));
        }
        this.a = dfbVarArr;
    }

    @Override // defpackage.dej
    public final /* bridge */ /* synthetic */ dey a(int i) {
        return this.a[i];
    }
}
