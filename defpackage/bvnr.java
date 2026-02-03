package defpackage;

import defpackage.bvmw;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnr extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ bvmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnr(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvnr) c((efwo) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ehlh.a(this.b.j, bvmw.a.class, (efwo) this.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvnr bvnrVar = new bvnr(this.b, fcxyVar);
        bvnrVar.a = obj;
        return bvnrVar;
    }
}
