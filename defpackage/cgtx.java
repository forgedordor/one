package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgtx extends fcyz implements fdat {
    /* synthetic */ Object a;

    public cgtx(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgtx) c((cgtd) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cgta cgtaVar = (cgta) ((cgtd) this.a).toBuilder();
        cgtaVar.getClass();
        cgtaVar.copyOnWrite();
        cgtd cgtdVar = (cgtd) cgtaVar.instance;
        cgtdVar.b &= -3;
        cgtdVar.e = false;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cgtd) cgtaVar.instance).c)).getClass();
        cgun.e(cgtaVar);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cgtd) cgtaVar.instance).h)).getClass();
        cgun.d(cgtaVar);
        cgun.b(cgtaVar);
        cgun.c(cgtaVar);
        cgtaVar.copyOnWrite();
        cgtd cgtdVar2 = (cgtd) cgtaVar.instance;
        cgtdVar2.b &= -33;
        cgtdVar2.j = 0;
        return cgun.a(cgtaVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgtx cgtxVar = new cgtx(fcxyVar);
        cgtxVar.a = obj;
        return cgtxVar;
    }
}
