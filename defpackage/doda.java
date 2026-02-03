package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doda extends fcyz implements fdat {
    int a;
    final /* synthetic */ dode b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doda(dode dodeVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dodeVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doda) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dode dodeVar = this.b;
        String str = this.c;
        this.a = 1;
        Object objA = dodeVar.l.a.a(dodeVar.c, str, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doda(this.b, this.c, fcxyVar);
    }
}
