package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djni implements fdat {
    final /* synthetic */ djmp a;

    public djni(djmp djmpVar) {
        this.a = djmpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djmp djmpVar = this.a;
            djmd.h(djmpVar.b, djmpVar.c, null, hmlVar, 0, 12);
        }
        return fctx.a;
    }
}
