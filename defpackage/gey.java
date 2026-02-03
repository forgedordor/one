package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gey implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;

    public gey(fdat fdatVar, fdat fdatVar2) {
        this.a = fdatVar;
        this.b = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fyb.a(gfb.b, gfb.c, hxe.d(-1980163584, new gex(this.a, this.b), hmlVar), hmlVar, 438);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
