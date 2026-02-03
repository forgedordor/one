package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnp extends fcyz implements fdat {
    int a;
    final /* synthetic */ dstf b;
    final /* synthetic */ String c;
    final /* synthetic */ ethn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnp(dstf dstfVar, String str, ethn ethnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dstfVar;
        this.c = str;
        this.d = ethnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dstf dstfVar = this.b;
        String str = this.c;
        ethn ethnVar = this.d;
        this.a = 1;
        Object objB = dstfVar.b(str, ethnVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnp(this.b, this.c, this.d, fcxyVar);
    }
}
