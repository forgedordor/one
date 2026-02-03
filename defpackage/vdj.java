package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vdj implements fdat {
    final /* synthetic */ zxa a;
    final /* synthetic */ aagu b;

    public vdj(zxa zxaVar, aagu aaguVar) {
        this.a = zxaVar;
        this.b = aaguVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            zya.i(this.a, this.b.c, hmlVar, 0);
        }
        return fctx.a;
    }
}
