package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alem extends fcyz implements fdat {
    int a;
    final /* synthetic */ aleq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alem(aleq aleqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aleqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alem) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        final aleq aleqVar = this.b;
        ajlk ajlkVar = (ajlk) obj;
        synchronized (aleqVar.e) {
            if (!aleqVar.f.get()) {
                return fctx.a;
            }
            aleqVar.c = ajlkVar.c().equals(ajlj.RBM) ? cqty.b(aleqVar.h.a(new anpi() { // from class: alej
                @Override // defpackage.anpi
                public final eiju a() {
                    return aleqVar.d();
                }
            }), aleqVar.i.a(new anpi() { // from class: alek
                @Override // defpackage.anpi
                public final eiju a() {
                    return aleqVar.d();
                }
            })) : aleqVar.g.a(new anpi() { // from class: alel
                @Override // defpackage.anpi
                public final eiju a() {
                    return aleqVar.d();
                }
            });
            return fctx.a;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new alem(this.b, fcxyVar);
    }
}
