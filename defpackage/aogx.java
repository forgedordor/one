package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogx extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoha b;
    final /* synthetic */ aoer c;
    final /* synthetic */ Optional d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aogx(fcxy fcxyVar, aoha aohaVar, aoer aoerVar, Optional optional) {
        super(2, fcxyVar);
        this.b = aohaVar;
        this.c = aoerVar;
        this.d = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aogx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aoha aohaVar = this.b;
        aoer aoerVar = this.c;
        Optional optional = this.d;
        this.a = 1;
        Object objH = aohaVar.h(aoerVar, optional, this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aogx aogxVar = new aogx(fcxyVar, this.b, this.c, this.d);
        aogxVar.e = obj;
        return aogxVar;
    }
}
