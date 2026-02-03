package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzp implements ahta {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/listeners/IcingIndexRebuildListener");
    private final fcsu b;

    public ahzp(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
    }

    @Override // defpackage.ahta
    public final eieu a() {
        return eiiy.a("IcingIndexRebuildListener::onRestoreCompleted");
    }

    @Override // defpackage.ahta
    public final void b(ahsz ahszVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/listeners/IcingIndexRebuildListener", "onRestoreCompleted", 40, "IcingIndexRebuildListener.kt");
        UUID uuid = ahszVar.a;
        ekrdVar.t("Restore completed - scheduling icing index rebuild [%s]", uuid);
        ((bybn) this.b.b()).a();
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleBackup");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/restore/listeners/IcingIndexRebuildListener", "onRestoreCompleted", 42, "IcingIndexRebuildListener.kt")).t("Queued icing index rebuild [%s]", uuid);
    }
}
