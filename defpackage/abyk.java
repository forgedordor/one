package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyk implements lun {
    eiju a;
    final /* synthetic */ abym b;

    public abyk(abym abymVar) {
        this.b = abymVar;
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        ekrw ekrwVarE = abym.c.e();
        ekrwVarE.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$2", "onResume", 292, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Account menu card onResume.");
        abym abymVar = this.b;
        this.a = eiju.g(ejua.a((Runnable) abymVar.q.b(), ((Long) abym.b.e()).longValue(), TimeUnit.MILLISECONDS, (diep) abymVar.p.b(), (eosd) abymVar.o.b()));
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ekrw ekrwVarE = abym.c.e();
        ekrwVarE.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$2", "onStop", 306, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Account menu card onStop.");
        eiju eijuVar = this.a;
        if (eijuVar != null) {
            eijuVar.cancel(false);
            this.a = null;
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
