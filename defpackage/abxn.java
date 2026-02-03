package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxn implements abxm {
    public static final cqce a = cqce.g("BugleGaia", "OneGoogleUxProviderImpl");
    private final eglt b;

    public abxn(eglt egltVar) {
        this.b = egltVar;
    }

    @Override // defpackage.abxm
    public final void a() {
        eieu eieuVarK = eiiy.k("OneGoogleUxProviderImpl#addOgBottomDialogToScreen");
        try {
            fr frVar = this.b.b;
            String str = eglt.a;
            egln eglnVar = (egln) frVar.h(str);
            if (eglnVar == null) {
                eglnVar = new egln();
                eyhj.e(eglnVar);
                cg cgVar = new cg(frVar);
                cgVar.u(eglnVar, str);
                cgVar.c();
            }
            egls eglsVarH = eglnVar.H();
            ecem.c();
            dysd dysdVar = eglsVarH.u;
            dysdVar.getClass();
            fr frVar2 = dysdVar.b;
            dysc dyscVarB = dysd.b(frVar2);
            if (dyscVarB == null) {
                dyscVarB = new dysc();
                dysdVar.a(dyscVarB);
            }
            eg egVar = dysdVar.c;
            if ((egVar == null || !egVar.isFinishing()) && !dyscVarB.aF() && !frVar2.ag()) {
                dyscVarB.t(frVar2, dysd.a);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
