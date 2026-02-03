package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgie extends fgmg {
    @Override // defpackage.fgmj
    public final fgmk a(fgml fgmlVar, fgil fgilVar) {
        fgin fginVar = (fgin) fgmlVar;
        int i = fginVar.f;
        if (!fgif.h(fgmlVar, i)) {
            return null;
        }
        int i2 = fginVar.e + fginVar.g;
        boolean zF = fgmp.f(fginVar.c.a, i + 1);
        int i3 = i2 + 1;
        if (zF) {
            i3 = i2 + 2;
        }
        fgig fgigVar = new fgig(new fgif());
        fgigVar.c = i3;
        return fgigVar;
    }
}
