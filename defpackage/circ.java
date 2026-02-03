package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class circ extends fcyz implements fdat {
    int a;
    final /* synthetic */ cird b;
    final /* synthetic */ cayy c;
    final /* synthetic */ cirg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public circ(cird cirdVar, cayy cayyVar, cirg cirgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cirdVar;
        this.c = cayyVar;
        this.d = cirgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((circ) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cird cirdVar = this.b;
        cion cionVar = (cion) cirdVar.h.b();
        cayy cayyVar = this.c;
        cirg cirgVar = this.d;
        dzfh dzfhVar = cird.b;
        dzfh dzfhVar2 = cird.c;
        cirb cirbVar = new cirb(cirdVar, cayyVar, cirgVar, null);
        this.a = 1;
        Object objA = cionVar.a(dzfhVar, dzfhVar2, cirbVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new circ(this.b, this.c, this.d, fcxyVar);
    }
}
