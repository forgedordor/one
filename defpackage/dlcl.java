package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlcl implements fdat {
    final /* synthetic */ dlcr a;

    public dlcl(dlcr dlcrVar) {
        this.a = dlcrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlcq.a(this.a, null, hmlVar, 0, 2);
        }
        return fctx.a;
    }
}
