package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phf implements pjv {
    final /* synthetic */ phg a;

    public phf(phg phgVar) {
        this.a = phgVar;
    }

    @Override // defpackage.pjv
    public final String b() {
        return this.a.g;
    }

    @Override // defpackage.pjv
    public final void h(pju pjuVar) {
        phg phgVar = this.a;
        int length = phgVar.a.length;
        for (int i = 1; i < length; i++) {
            int i2 = phgVar.a[i];
            if (i2 == 1) {
                pjuVar.e(i, phgVar.b[i]);
            } else if (i2 == 2) {
                pjuVar.d(i, phgVar.c[i]);
            } else if (i2 == 3) {
                String str = phgVar.d[i];
                str.getClass();
                pjuVar.g(i, str);
            } else if (i2 == 4) {
                byte[] bArr = phgVar.e[i];
                bArr.getClass();
                pjuVar.c(i, bArr);
            } else if (i2 == 5) {
                pjuVar.f(i);
            }
        }
    }
}
