package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuad extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctye b;
    final /* synthetic */ fdae c;
    final /* synthetic */ ejy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuad(ctye ctyeVar, fdae fdaeVar, ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctyeVar;
        this.c = fdaeVar;
        this.d = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuad) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            final ejy ejyVar = this.d;
            ctzz ctzzVar = new ctzz(fdqq.a(new cuac(hsb.a(new fdae() { // from class: ctzw
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }), ctyeVar)));
            this.a = 1;
            if (fdtc.a(ctzzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.c.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cuad(this.b, this.c, this.d, fcxyVar);
    }
}
