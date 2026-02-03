package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class citt implements cium {
    public static final eksp a = eksp.c("BugleGroupManagement");
    static final cczi b = cdag.e(cdag.b, "sync_rcs_group_period_days", 7);
    public final ciul c;
    public final ciuc d;
    public final cjpo e;
    public final ains f;
    public final fcsu g;
    public final fcsu h;
    public final cogw i;
    public final eosc j;

    public citt(ciul ciulVar, ciuc ciucVar, cjpo cjpoVar, ains ainsVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, eosc eoscVar) {
        this.c = ciulVar;
        this.d = ciucVar;
        this.e = cjpoVar;
        this.f = ainsVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = cogwVar;
        this.j = eoscVar;
    }

    public final void a() {
        this.f.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 0);
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "logRecoverDisabledRcsGroupChatNotReady", 285, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Recover disabled RCS group disabled because Bugle is not ready to send and receive chat.");
    }
}
