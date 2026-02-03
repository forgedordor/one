package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwn extends fcyz implements fdat {
    int a;
    final /* synthetic */ Optional b;
    final /* synthetic */ axwp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axwn(fcxy fcxyVar, Optional optional, axwp axwpVar) {
        super(2, fcxyVar);
        this.b = optional;
        this.c = axwpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axwn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Optional optional = this.b;
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        eiju eijuVarJ = ((avpc) this.c.w.b()).j((ekgb) optional.get());
        this.a = 1;
        Object objC = fdxs.c(eijuVarJ, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axwn axwnVar = new axwn(fcxyVar, this.b, this.c);
        axwnVar.d = obj;
        return axwnVar;
    }
}
