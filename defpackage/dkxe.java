package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkxe implements fdat {
    final /* synthetic */ dkuh a;

    public dkxe(dkuh dkuhVar) {
        this.a = dkuhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(933635206);
            dkuh dkuhVar = this.a;
            hwv hwvVarD = dkuhVar.b == null ? null : hxe.d(-613700693, new dkxc(dkuhVar), hmlVar);
            hmlVar.o();
            dtfr.a(hxe.d(-603439868, new dkxd(dkuhVar), hmlVar), null, null, null, hwvVarD, null, null, hmlVar, 6, 494);
        }
        return fctx.a;
    }
}
