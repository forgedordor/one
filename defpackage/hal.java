package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hal implements fdat {
    final /* synthetic */ gyq a;
    final /* synthetic */ cth b;
    final /* synthetic */ fyf c;
    final /* synthetic */ boolean d;

    public hal(gyq gyqVar, cth cthVar, fyf fyfVar, boolean z) {
        this.a = gyqVar;
        this.b = cthVar;
        this.c = fyfVar;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hnj.a(gea.a.c(new ije(this.a.a(false))), hxe.d(-596940007, new hak(this.b, this.c, this.d), hmlVar), hmlVar, 56);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
