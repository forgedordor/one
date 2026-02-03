package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afsl extends fcyz implements fdat {
    int a;
    final /* synthetic */ afrs b;
    final /* synthetic */ ejy c;
    final /* synthetic */ oxm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsl(afrs afrsVar, ejy ejyVar, oxm oxmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afrsVar;
        this.c = ejyVar;
        this.d = oxmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afsl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.c;
            afsh afshVar = new afsh(fdqq.a(new afsk(hsb.a(new fdae() { // from class: afse
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }), this.d)));
            this.a = 1;
            if (fdtc.a(afshVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.e.invoke();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afsl(this.b, this.c, this.d, fcxyVar);
    }
}
