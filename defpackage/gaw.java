package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaw implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ egc b;
    final /* synthetic */ fdau c;

    public gaw(long j, egc egcVar, fdau fdauVar) {
        this.a = j;
        this.b = egcVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hjt.a(this.a, glz.d(hmlVar).m, hxe.d(417635459, new gav(this.b, this.c), hmlVar), hmlVar, 384);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
