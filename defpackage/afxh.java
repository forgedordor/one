package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afxh extends fcyz implements fdat {
    int a;
    final /* synthetic */ afvt b;
    final /* synthetic */ ejy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxh(afvt afvtVar, ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afvtVar;
        this.c = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afxh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            afvt afvtVar = this.b;
            if (fdbq.f(afvtVar.a, "")) {
                return fctx.a;
            }
            final ejy ejyVar = this.c;
            afxd afxdVar = new afxd(fdqq.a(new afxg(hsb.a(new fdae() { // from class: afxa
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }), afvtVar)));
            this.a = 1;
            if (fdtc.a(afxdVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.c.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afxh(this.b, this.c, fcxyVar);
    }
}
