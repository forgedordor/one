package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aujn extends fcyz implements fdat {
    int a;
    final /* synthetic */ aujo b;
    final /* synthetic */ aujk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aujn(aujo aujoVar, aujk aujkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aujoVar;
        this.c = aujkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aujn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aujo aujoVar = this.b;
        aujk aujkVar = this.c;
        this.a = 1;
        Object objB = aujoVar.b(aujkVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aujn(this.b, this.c, fcxyVar);
    }
}
