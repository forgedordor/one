package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bycr implements cmqg {
    private static final eksp a = eksp.c("BugleSearch");
    private final fcsu b;

    public bycr(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.cmqg
    public final void a(boolean z) {
        if (!z) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(bxze.g, "IcingSyncManagerListener");
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingSyncManagerListener", "onSyncComplete", 45, "IcingSyncManagerListener.java")).q("Ignore non-full sync callback.");
        } else {
            eksl ekslVar2 = (eksl) a.h();
            ekslVar2.X(bxze.g, "IcingSyncManagerListener");
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingSyncManagerListener", "onSyncComplete", 51, "IcingSyncManagerListener.java")).q("Queues icing index rebuild work item.");
            ((bybn) this.b.b()).a();
        }
    }

    @Override // defpackage.cmqg
    public final void b(boolean z) {
    }
}
