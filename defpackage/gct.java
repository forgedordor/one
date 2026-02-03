package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gct extends fcyz implements fdat {
    int a;
    final /* synthetic */ gcw b;
    final /* synthetic */ ihs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gct(gcw gcwVar, ihs ihsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gcwVar;
        this.c = ihsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gct) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gcw gcwVar = this.b;
            long j = this.c.a;
            fyf fyfVar = gcwVar.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float fE = gcwVar.e();
            boolean z = gcwVar.b;
            long jF = gcwVar.f();
            ddz ddzVar = gcwVar.d;
            this.a = 1;
            if (hbj.j(fyfVar, fIntBitsToFloat, fIntBitsToFloat2, fE, z, jF, ddzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gct(this.b, this.c, fcxyVar);
    }
}
