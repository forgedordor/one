package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqh implements cjqi {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/waker/RcsEngineWaker");
    private final cmek b;
    private final cogw c;
    private final chwq d;
    private final fcsu e;
    private final Duration f;

    public cjqh(cmek cmekVar, cogw cogwVar, chwq chwqVar, fcsu fcsuVar) {
        cogwVar.getClass();
        chwqVar.getClass();
        fcsuVar.getClass();
        this.b = cmekVar;
        this.c = cogwVar;
        this.d = chwqVar;
        this.e = fcsuVar;
        Object objB = fcsuVar.b();
        objB.getClass();
        this.f = Duration.ofSeconds(((Number) objB).longValue());
    }

    @Override // defpackage.cjqi
    public final boolean a() {
        cmek cmekVar = this.b;
        if ((cmekVar.a().b & 1) != 0) {
            evvp evvpVar = cmekVar.a().c;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            Instant instantF = this.c.f();
            instantF.getClass();
            if (evxc.b(evvpVar, evxd.b(instantF)).b < this.f.getSeconds()) {
                return false;
            }
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleTransport");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/rcs/waker/RcsEngineWaker", "wake", 37, "RcsEngineWaker.kt")).q("Waking RCS Engine");
        chwq chwqVar = this.d;
        ewfn ewfnVar = (ewfn) ewfq.a.createBuilder();
        ewfnVar.getClass();
        ewfp ewfpVar = ewfp.SEND_KEEPALIVE;
        ewfpVar.getClass();
        ewfnVar.copyOnWrite();
        ((ewfq) ewfnVar.instance).b = ewfpVar.a();
        UUID uuidRandomUUID = UUID.randomUUID();
        Objects.toString(uuidRandomUUID);
        String strValueOf = String.valueOf(uuidRandomUUID);
        ewfnVar.copyOnWrite();
        ((ewfq) ewfnVar.instance).c = "client_".concat(strValueOf);
        evsn evsnVarBuild = ewfnVar.build();
        evsnVarBuild.getClass();
        chwqVar.u((ewfq) evsnVarBuild);
        cmeh cmehVar = (cmeh) cmei.a.createBuilder();
        cmehVar.getClass();
        Instant instantF2 = this.c.f();
        instantF2.getClass();
        evvp evvpVarB = evxd.b(instantF2);
        cmehVar.copyOnWrite();
        cmei cmeiVar = (cmei) cmehVar.instance;
        cmeiVar.c = evvpVarB;
        cmeiVar.b |= 1;
        evsn evsnVarBuild2 = cmehVar.build();
        evsnVarBuild2.getClass();
        final cmei cmeiVar2 = (cmei) evsnVarBuild2;
        cmekVar.a.m(new ejvr() { // from class: cmej
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cmeiVar2;
            }
        });
        return true;
    }
}
