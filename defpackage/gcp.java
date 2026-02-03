package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcp extends fcyz implements fdat {
    int a;
    final /* synthetic */ gcw b;
    final /* synthetic */ ihs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcp(gcw gcwVar, ihs ihsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gcwVar;
        this.c = ihsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gcp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gcw gcwVar = this.b;
            long j = this.c.a;
            gcwVar.e += Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat = gcwVar.f + Float.intBitsToFloat((int) (j & 4294967295L));
            gcwVar.f = fIntBitsToFloat;
            fyf fyfVar = gcwVar.a;
            float fA = hbj.a(fIntBitsToFloat - kjb.b(gcwVar.f()), gcwVar.e - kjb.a(gcwVar.f()));
            ddz ddzVar = gcwVar.d;
            this.a = 1;
            if (fyfVar.g(fA, ddzVar, false, this) == fcylVar) {
                return fcylVar;
            }
        }
        gcw gcwVar2 = this.b;
        hbj.y(gcwVar2.a, gcwVar2.e, gcwVar2.f, gcwVar2.e(), gcwVar2.f());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gcp(this.b, this.c, fcxyVar);
    }
}
