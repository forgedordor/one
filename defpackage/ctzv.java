package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctzv extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctye b;
    final /* synthetic */ ejy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctzv(ctye ctyeVar, ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctyeVar;
        this.c = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctzv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctye ctyeVar = this.b;
            if (fdbq.f(ctyeVar.a, "")) {
                return fctx.a;
            }
            final ejy ejyVar = this.c;
            ctzr ctzrVar = new ctzr(fdqq.a(new ctzu(hsb.a(new fdae() { // from class: ctzo
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }), ctyeVar)));
            this.a = 1;
            if (fdtc.a(ctzrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.c.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctzv(this.b, this.c, fcxyVar);
    }
}
