package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkca implements fdat {
    final /* synthetic */ dkcd a;

    public dkca(dkcd dkcdVar) {
        this.a = dkcdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkcd dkcdVar = this.a;
            dtgo.a(dkcdVar.c, dkcdVar.e, null, false, null, null, hmlVar, 0, 60);
        }
        return fctx.a;
    }
}
