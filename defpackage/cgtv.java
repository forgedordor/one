package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgtv extends fcyz implements fdat {
    /* synthetic */ Object a;

    public cgtv(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgtv) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cgtd) cgtaVar.instance).c)).getClass();
        cgun.e(cgtaVar);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cgtd) cgtaVar.instance).h)).getClass();
        cgun.d(cgtaVar);
        cgun.b(cgtaVar);
        cgun.c(cgtaVar);
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgtv cgtvVar = new cgtv(fcxyVar);
        cgtvVar.a = obj;
        return cgtvVar;
    }
}
