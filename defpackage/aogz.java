package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogz extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoha b;
    final /* synthetic */ aofc c;
    final /* synthetic */ Optional d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aogz(fcxy fcxyVar, aoha aohaVar, aofc aofcVar, Optional optional) {
        super(2, fcxyVar);
        this.b = aohaVar;
        this.c = aofcVar;
        this.d = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aogz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        aofc aofcVar = this.c;
        Optional optional = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(aohaVar.a), new aogy(null, aohaVar, aofcVar, optional), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aogz aogzVar = new aogz(fcxyVar, this.b, this.c, this.d);
        aogzVar.e = obj;
        return aogzVar;
    }
}
