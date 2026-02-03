package defpackage;

import j$.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class asom extends fcyz implements fdat {
    final /* synthetic */ asoq a;
    final /* synthetic */ ason b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asom(asoq asoqVar, ason asonVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = asoqVar;
        this.b = asonVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ConcurrentMap.EL.getOrDefault(this.a.m, this.b.a, egyh.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new asom(this.a, this.b, fcxyVar);
    }
}
