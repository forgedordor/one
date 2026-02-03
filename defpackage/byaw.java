package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byaw implements ausk {
    private static final eksp a = eksp.c("BugleSearch");
    private final fcsu b;

    public byaw(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.ausk
    public final void a() {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bxze.g, "IcingFiSettingsDataListener");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingFiSettingsDataListener", "onRestoreComplete", 40, "IcingFiSettingsDataListener.java")).q("Queues icing index rebuild work item.");
        ((bybn) this.b.b()).a();
    }
}
