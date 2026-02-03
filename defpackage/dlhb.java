package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlhb implements fdat {
    final /* synthetic */ float a;

    public dlhb(float f) {
        this.a = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            egt.a(joj.a(egq.k(ics.e, this.a), "AnimationPlaceholder"), hmlVar);
        }
        return fctx.a;
    }
}
