package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbd extends fdbr implements fdap {
    final /* synthetic */ dbg a;
    final /* synthetic */ iyl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbd(dbg dbgVar, iyl iylVar) {
        super(1);
        this.a = dbgVar;
        this.b = iylVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        long j;
        ihs ihsVar;
        long jC;
        long j2;
        ihu ihuVarA;
        iyk iykVar = (iyk) obj;
        ivy ivyVarB = iykVar.b();
        iyl iylVar = this.b;
        if (ivyVarB == null) {
            iykVar.s(iylVar, 0, 0, 0.0f);
        } else {
            dbg dbgVar = this.a;
            long jH = dbgVar.n().h(ivyVarB, 0L);
            if (dbgVar.m().a() != null) {
                ihu ihuVarB = dbgVar.m().b();
                if (ihuVarB == null) {
                    float f = iylVar.a;
                    float f2 = iylVar.b;
                    ihuVarB = ihv.a(jH, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                }
                cyl cylVarL = dbgVar.l();
                ddj ddjVarA = dbgVar.m().a();
                ddjVarA.getClass();
                j = 4294967295L;
                ihu ihuVarA2 = ihv.a(ihs.e(ddjVarA.b(), ddjVarA.d()), ddjVarA.c());
                if (cylVarL.a.a()) {
                    if (cylVarL.b() == null) {
                        cylVarL.e = dcr.a;
                    }
                    cylVarL.d(cylVarL.a().b(new cyj(cylVarL), new cyk(cylVarL, ihuVarA2, ihuVarB)));
                }
            } else {
                j = 4294967295L;
            }
            ihu ihuVarC = dbgVar.l().c();
            ihs ihsVar2 = null;
            if (ihuVarC != null) {
                ddj ddjVarA2 = dbgVar.m().a();
                ddjVarA2.getClass();
                ihsVar = new ihs(ihs.e(ihs.d(ihuVarC.c(), ddjVarA2.b()), ddjVarA2.a()));
            } else {
                ihsVar = null;
            }
            if (dbgVar.l().e()) {
                if (ihsVar != null) {
                    j2 = ihsVar.a;
                    ihsVar2 = ihsVar;
                } else {
                    j2 = jH;
                }
                if (ihsVar2 == null) {
                    ihuVarA = ihv.a(jH, kjh.d(ivyVarB.g()));
                } else {
                    ihuVarA = ihv.a(ihsVar2.a, ihuVarC.b());
                }
                dbgVar.m().e(ihuVarA);
            } else {
                if (ihsVar != null) {
                    jC = ihsVar.a;
                } else {
                    ihu ihuVarB2 = dbgVar.m().b();
                    ihuVarB2.getClass();
                    jC = ihuVarB2.c();
                }
                j2 = jC;
            }
            long jD = ihs.d(j2, jH);
            iykVar.s(iylVar, Math.round(Float.intBitsToFloat((int) (jD >> 32))), Math.round(Float.intBitsToFloat((int) (jD & j))), 0.0f);
        }
        return fctx.a;
    }
}
