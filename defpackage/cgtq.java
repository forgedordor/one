package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgtq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    final /* synthetic */ efwo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgtq(fcxy fcxyVar, cgum cgumVar, efwo efwoVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgtq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVarB = this.b.d.b();
            this.a = 1;
            obj = fdtc.a(fdplVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(fdbq.f(DesugarCollections.unmodifiableMap(((cgtd) obj).c).get(new Integer(this.c.a())), true));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgtq cgtqVar = new cgtq(fcxyVar, this.b, this.c);
        cgtqVar.d = obj;
        return cgtqVar;
    }
}
