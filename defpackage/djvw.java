package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djvw implements fdat {
    final /* synthetic */ djwc a;

    public djvw(djwc djwcVar) {
        this.a = djwcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djvz.a(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
