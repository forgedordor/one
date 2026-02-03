package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrb {
    private final fcsu a;

    public cnrb(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(Instant instant, Instant instant2, Instant instant3, int i, int i2, enqq enqqVar, UUID uuid, UUID uuid2) {
        cnra cnraVar = (cnra) this.a.b();
        cnrd cnrdVar = (cnrd) cnre.a.createBuilder();
        evvp evvpVarC = evxc.c(instant.toEpochMilli());
        cnrdVar.copyOnWrite();
        cnre cnreVar = (cnre) cnrdVar.instance;
        evvpVarC.getClass();
        cnreVar.c = evvpVarC;
        cnreVar.b |= 1;
        evvp evvpVarC2 = evxc.c(instant2.toEpochMilli());
        cnrdVar.copyOnWrite();
        cnre cnreVar2 = (cnre) cnrdVar.instance;
        evvpVarC2.getClass();
        cnreVar2.d = evvpVarC2;
        cnreVar2.b |= 2;
        evvp evvpVarC3 = evxc.c(instant3.toEpochMilli());
        cnrdVar.copyOnWrite();
        cnre cnreVar3 = (cnre) cnrdVar.instance;
        evvpVarC3.getClass();
        cnreVar3.e = evvpVarC3;
        cnreVar3.b |= 4;
        cnrdVar.copyOnWrite();
        ((cnre) cnrdVar.instance).f = i;
        cnrdVar.copyOnWrite();
        ((cnre) cnrdVar.instance).g = i2;
        cnrdVar.copyOnWrite();
        ((cnre) cnrdVar.instance).h = enqqVar.M;
        evqs evqsVarA = cnru.a(uuid);
        cnrdVar.copyOnWrite();
        ((cnre) cnrdVar.instance).i = evqsVarA;
        evqs evqsVarA2 = cnru.a(uuid2);
        cnrdVar.copyOnWrite();
        ((cnre) cnrdVar.instance).j = evqsVarA2;
        ((cazj) cnraVar.a.b()).a(cbcu.f("forward_sync_batch", (cnre) cnrdVar.build()));
    }
}
