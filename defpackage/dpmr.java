package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpmr implements fdat {
    final /* synthetic */ dpmg a;

    public dpmr(dpmg dpmgVar) {
        this.a = dpmgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dpmg dpmgVar = this.a;
            cye.b(dpmgVar != null, null, null, dae.m(null, 3), null, hxe.d(1345271145, new dpmq(dpmgVar), hmlVar), hmlVar, 199680, 22);
        }
        return fctx.a;
    }
}
