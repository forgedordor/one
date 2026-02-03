package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzp extends fcyz implements fdap {
    int a;
    final /* synthetic */ cgzq b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgzp(cgzq cgzqVar, Object obj, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cgzqVar;
        this.c = obj;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cgzq cgzqVar = this.b;
        Object obj2 = this.c;
        this.a = 1;
        Object objC = cgzqVar.a.c(obj2, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cgzp(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
