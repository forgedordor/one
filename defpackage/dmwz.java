package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwz implements fdat {
    final /* synthetic */ hrg a;

    public dmwz(hrg hrgVar) {
        this.a = hrgVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dmxm.k(ien.a(ics.e, 1.0f - this.a.c()), hmlVar, 0);
        }
        return fctx.a;
    }
}
