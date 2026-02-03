package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgud extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgud(cgum cgumVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgud) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cgum cgumVar = this.b;
        cguc cgucVar = new cguc(this.c, null);
        this.a = 1;
        Object objA = cgumVar.d.a(cgucVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgud(this.b, this.c, fcxyVar);
    }
}
