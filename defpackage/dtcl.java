package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtcl implements fdat {
    final /* synthetic */ fdat a;

    public dtcl(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(hmlVar, 0);
        }
        return fctx.a;
    }
}
