package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfp implements eora {
    final /* synthetic */ rff a;
    final /* synthetic */ drfq b;

    public drfp(drfq drfqVar, rff rffVar) {
        this.a = rffVar;
        this.b = drfqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        rld rldVar = (rld) obj;
        drfq drfqVar = this.b;
        if (drfqVar.f) {
            return;
        }
        drft drftVar = drfqVar.h;
        drfl drflVar = drfqVar.d;
        int i = drfqVar.a;
        int i2 = drfqVar.b;
        rlc rlcVarC = drftVar.c(drflVar, i, i2, true, rldVar);
        rex rexVar = drfqVar.c;
        rlq rlqVar = drftVar.c;
        rlp rlpVarA = rlqVar.a(rlcVarC, i, i2, rexVar);
        if (rlpVarA != null) {
            rfg rfgVar = rlpVarA.c;
            drfqVar.g = rfgVar;
            rfgVar.g(drfqVar.e, drfqVar);
            if (drfqVar.f) {
                drfqVar.d();
                return;
            }
            return;
        }
        drfqVar.f(new RuntimeException(String.valueOf(rlqVar) + " returned null LoadData for " + rlcVarC.b()));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (this.b.f) {
            return;
        }
        rew rewVar = drft.a;
        this.a.f(new RuntimeException(th));
    }
}
