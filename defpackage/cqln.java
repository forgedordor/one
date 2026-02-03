package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqln {
    public static final ejxr a = cdag.v("cms_no_qr_backup_key");
    public final fcsu b;
    public final cfis c;
    public final eosc d;
    public final fcsu e;
    public final cfgi f;
    public final fcsu g;
    public final fcsu h;
    private final fcsu i;
    private final Optional j;
    private final bvkr k;

    public cqln(fcsu fcsuVar, fcsu fcsuVar2, Optional optional, cfis cfisVar, eosc eoscVar, bvkr bvkrVar, fcsu fcsuVar3, cfgj cfgjVar, cepf cepfVar, cfgc cfgcVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.i = fcsuVar;
        this.b = fcsuVar2;
        this.j = optional;
        this.c = cfisVar;
        this.d = eoscVar;
        this.k = bvkrVar;
        this.e = fcsuVar3;
        this.f = cfgjVar.a(cepfVar, cfgcVar);
        this.g = fcsuVar4;
        this.h = fcsuVar5;
    }

    final eiju a(ezja ezjaVar, cqls cqlsVar, epnq epnqVar) {
        int i;
        int iA;
        int iA2;
        cqca.c("BugleDitto", "Get phone relay mode CreateRelayPairingRpcHandler");
        ezij ezijVar = (ezij) ezik.a.createBuilder();
        if (epnqVar != null) {
            boolean z = true;
            if (!epnqVar.f && (((iA = epnn.a((i = epnqVar.g))) == 0 || iA != 4) && ((iA2 = epnn.a(i)) == 0 || iA2 != 5))) {
                z = false;
            }
            ezijVar.copyOnWrite();
            ((ezik) ezijVar.instance).b = z;
        }
        ezol ezolVar = ezjaVar.e;
        if (ezolVar == null) {
            ezolVar = ezol.a;
        }
        return eijx.e(new cfac(ezolVar, (ezik) ezijVar.build(), evqs.b, cqlsVar, this.e, this.f));
    }

    final void b(cqlq cqlqVar) {
        if (cqlqVar == null) {
            cqca.f("BugleDitto", "Relay response is null");
            return;
        }
        bvkr bvkrVar = this.k;
        ezol ezolVarC = cqlqVar.c();
        epnq epnqVarB = cqlqVar.b();
        bajj bajjVarA = cqlqVar.a();
        String[] strArr = bpab.a;
        bows bowsVar = new bows();
        bowsVar.e(ezolVarC.c);
        if (epnqVarB != null) {
            bowsVar.c(evqs.A(epnqVarB.b).I());
            bowsVar.l(epnqVarB.d);
            bowsVar.m(epnqVarB.e);
            bowsVar.b(epnqVarB.c);
            bowsVar.f(bvkr.e(epnqVarB));
            bowsVar.k(bvkr.w(epnqVarB));
        }
        bowsVar.d(bvkrVar.e.f().toEpochMilli());
        byte[] bArr = bajjVarA.d;
        if (bArr != null) {
            bowsVar.h(bArr);
        }
        byte[] bArr2 = bajjVarA.e;
        if (bArr2 != null) {
            bowsVar.j(bArr2);
        }
        bowsVar.a().v();
        ((bxlc) bvkrVar.f.b()).g();
        cfis cfisVar = this.c;
        if (!Objects.equals((ezol) cfisVar.b.getAndSet(null), cqlqVar.c())) {
            ekrw ekrwVarJ = cfis.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/common/PairingDesktopObserver", "onNewDesktopPairingSuccess", 49, "PairingDesktopObserver.java")).q("Pairing desktop ID and successful paired desktop ID don't match.");
        }
        cqca.c("BugleDitto", "Received desktop ID, pairing successful");
        Optional optional = this.j;
        if (optional.isPresent()) {
            ((cfzf) optional.get()).d();
        }
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            return;
        }
        try {
            ((cema) this.b.b()).a(new cfgb(((cprh) this.i.b()).d(cqlqVar.c()), cqlqVar.c()));
        } catch (GeneralSecurityException unused) {
            cqca.f("BugleDitto", "Failed to send backup key");
        }
    }
}
