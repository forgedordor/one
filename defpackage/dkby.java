package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkby implements fdat {
    final /* synthetic */ dkcd a;

    public dkby(dkcd dkcdVar) {
        this.a = dkcdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkcd dkcdVar = this.a;
            dkcb.a(dkcdVar.a, dkcdVar.d, hmlVar, 0);
        }
        return fctx.a;
    }
}
