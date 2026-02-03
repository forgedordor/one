package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aldy extends fcyz implements fdat {
    int a;
    final /* synthetic */ alec b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldy(alec alecVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = alecVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.b.b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        final alec alecVar = this.b;
        ajlk ajlkVar = (ajlk) obj;
        synchronized (alecVar.e) {
            if (!alecVar.f.get()) {
                return fctx.a;
            }
            alecVar.c = ajlkVar.c().equals(ajlj.RBM) ? cqty.b(alecVar.h.a(new anpi() { // from class: aldv
                @Override // defpackage.anpi
                public final eiju a() {
                    return alecVar.d();
                }
            }), alecVar.i.a(new anpi() { // from class: aldw
                @Override // defpackage.anpi
                public final eiju a() {
                    return alecVar.d();
                }
            })) : alecVar.g.a(new anpi() { // from class: aldx
                @Override // defpackage.anpi
                public final eiju a() {
                    return alecVar.d();
                }
            });
            return fctx.a;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aldy(this.b, fcxyVar);
    }
}
