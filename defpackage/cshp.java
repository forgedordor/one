package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cshp extends fcyz implements fdap {
    int a;
    final /* synthetic */ cshq b;
    final /* synthetic */ cshx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cshp(cshq cshqVar, cshx cshxVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cshqVar;
        this.c = cshxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cshq cshqVar = this.b;
        cshx cshxVar = this.c;
        this.a = 1;
        Object objB = cshqVar.b(cshxVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cshp(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
