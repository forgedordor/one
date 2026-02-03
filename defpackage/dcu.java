package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dct b;
    final /* synthetic */ long c;
    final /* synthetic */ dcw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcu(dct dctVar, long j, dcw dcwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dctVar;
        this.c = j;
        this.d = dcwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dcu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dct dctVar = this.b;
            kjg kjgVar = new kjg(this.c);
            ddz ddzVar = this.d.a;
            this.a = 1;
            obj = ddp.k(dctVar.a, kjgVar, ddzVar, null, this, 12);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int i2 = ((ddx) obj).a;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dcu(this.b, this.c, this.d, fcxyVar);
    }
}
