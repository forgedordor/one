package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzt implements ahta {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener");
    private final ahzu b;
    private final cnlx c;

    public ahzt(cnlx cnlxVar, ahzv ahzvVar) {
        cnlxVar.getClass();
        ahzvVar.getClass();
        this.c = cnlxVar;
        this.b = ahzvVar.a(a, null, null);
    }

    @Override // defpackage.ahta
    public final eieu a() {
        return eiiy.a("ScheduleIncrementalReverseSyncListener::onRestoreCompleted");
    }

    @Override // defpackage.ahta
    public final void b(ahsz ahszVar) {
        ahzu ahzuVar = this.b;
        UUID uuid = ahszVar.a;
        ahzuVar.h("Restore completed - scheduling incremental reverse sync [%s]", uuid);
        this.c.a(uuid);
        ahzuVar.h("Scheduled incremental reverse sync [%s]", uuid);
    }
}
