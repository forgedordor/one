package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aamr extends fcyz implements fdat {
    int a;
    final /* synthetic */ aani b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamr(aani aaniVar, Set set, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aaniVar;
        this.c = set;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aamr) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarT = this.b.b.t(this.c);
        eijuVarT.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarT, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aamr(this.b, this.c, fcxyVar);
    }
}
