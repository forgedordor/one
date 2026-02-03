package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgth extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgth(fcxy fcxyVar, cgum cgumVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgth) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        cgtd cgtdVar = (cgtd) obj;
        if ((cgtdVar.b & 1) == 0) {
            return null;
        }
        int i2 = cgtdVar.d;
        Boolean bool = (Boolean) DesugarCollections.unmodifiableMap(cgtdVar.c).get(new Integer(i2));
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return new Integer(i2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgth cgthVar = new cgth(fcxyVar, this.b);
        cgthVar.c = obj;
        return cgthVar;
    }
}
