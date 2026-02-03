package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnjw {
    public static final eksp a = eksp.c("BugleTachygram");
    public final cexn b;
    public final eosc c;
    public final ceni d;
    public final Optional e;
    public final fcsu f;
    public final fcsu g;
    private final cqba h;

    public cnjw(cexn cexnVar, eosc eoscVar, ceni ceniVar, Optional optional, cqba cqbaVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = eoscVar;
        this.b = cexnVar;
        this.d = ceniVar;
        this.e = optional;
        this.h = cqbaVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
    }

    public static boolean a(cevr cevrVar) {
        ezoc ezocVar = cevrVar.m;
        if (ezocVar == null) {
            ezocVar = ezoc.b;
        }
        return new evsz(ezocVar.c, ezoc.a).contains(felh.TACHYGRAM);
    }

    public final eiju b(String str) {
        eiju eijuVarA;
        Optional optional = this.e;
        if (optional.isEmpty()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 193, "TachygramLifecycleManager.java")).q("Tachygram is active but no tachyon receiver manager provided");
            return eijx.e(null);
        }
        boolean z = this.h.a;
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 198, "TachygramLifecycleManager.java")).t("Tachygram is newly active. Starting %s", true != z ? "pull" : "bind");
        if (z) {
            eijuVarA = ((cfzf) optional.get()).e(str);
        } else {
            cfzf cfzfVar = (cfzf) optional.get();
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).d = "RCS";
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).c = str;
            eijuVarA = cfzfVar.a((ezol) ezokVar.build());
        }
        return eijuVarA.e(fbtf.class, new ejvr() { // from class: cnjo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) cnjw.a.j()).g((fbtf) obj)).h("com/google/android/apps/messaging/shared/tachygram/lifecycle/TachygramLifecycleManager", "bindOrPullIfTachygramIsActive", 212, "TachygramLifecycleManager.java")).q("Failed to fetch messages during Tachygram setup");
                return null;
            }
        }, this.c);
    }
}
