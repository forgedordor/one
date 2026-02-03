package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chlj extends fcyz implements fdat {
    final /* synthetic */ chlu a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlj(fcxy fcxyVar, chlu chluVar) {
        super(2, fcxyVar);
        this.a = chluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object objB = this.a.c.b();
        objB.getClass();
        return fdct.b((Optional) objB);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chlj chljVar = new chlj(fcxyVar, this.a);
        chljVar.b = obj;
        return chljVar;
    }
}
