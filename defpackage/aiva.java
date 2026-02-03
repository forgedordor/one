package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiva extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ aivb c;
    final /* synthetic */ aiuz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiva(long j, aivb aivbVar, aiuz aiuzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
        this.c = aivbVar;
        this.d = aiuzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiva) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (fdkj.c(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.c.b(this.d, 2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aiva(this.b, this.c, this.d, fcxyVar);
    }
}
