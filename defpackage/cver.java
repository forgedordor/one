package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cver extends fcyz implements fdat {
    int a;
    final /* synthetic */ cveu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cver(cveu cveuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cveuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cver) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csei cseiVar = (csei) this.b.d.b();
        this.a = 1;
        Object objB = cseiVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cver(this.b, fcxyVar);
    }
}
