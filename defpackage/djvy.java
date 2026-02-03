package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djvy implements fdat {
    final /* synthetic */ djwc a;

    public djvy(djwc djwcVar) {
        this.a = djwcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djwc djwcVar = this.a;
            djvz.c(djwcVar.a, djwcVar.g, hmlVar, 0);
        }
        return fctx.a;
    }
}
