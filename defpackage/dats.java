package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dats implements fdat {
    final /* synthetic */ dayp a;

    public dats(dayp daypVar) {
        this.a = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dayz.c(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
