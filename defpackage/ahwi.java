package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers");
    public final fcsu b;
    private final cogw c;
    private final fdjx d;

    public ahwi(fcsu fcsuVar, cogw cogwVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        cogwVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = cogwVar;
        this.d = fdjxVar;
    }

    public static /* synthetic */ void a(ahwi ahwiVar, enzp enzpVar, UUID uuid, int i, int i2, int i3, int i4, aiba aibaVar, Duration duration, enzh enzhVar, ahwj ahwjVar, Long l, int i5) {
        aiba aibaVar2 = (i5 & 64) != 0 ? aiba.UNDEFINED : aibaVar;
        int i6 = i5 & 16;
        int i7 = i5 & 8;
        int i8 = i5 & 4;
        int i9 = (i5 & 32) != 0 ? 0 : i4;
        int i10 = i6 != 0 ? 0 : i3;
        int i11 = i7 != 0 ? 0 : i2;
        int i12 = i8 != 0 ? 0 : i;
        enzh enzhVar2 = (i5 & 256) != 0 ? null : enzhVar;
        ahwj ahwjVar2 = (i5 & 512) != 0 ? null : ahwjVar;
        Long l2 = (i5 & 1024) != 0 ? null : l;
        enzpVar.getClass();
        uuid.getClass();
        aibaVar2.getClass();
        auvw.k(ahwiVar.d, null, null, new ahwg(ahwiVar, enzpVar, uuid, duration, i12, i11, i10, i9, aibaVar2, enzhVar2, ahwjVar2, l2, null), 3);
    }

    public static /* synthetic */ void b(ahwi ahwiVar, enzp enzpVar, UUID uuid, Duration duration, enzh enzhVar, int i) {
        aiba aibaVar = (i & 128) != 0 ? aiba.UNDEFINED : null;
        enzh enzhVar2 = (i & 256) != 0 ? null : enzhVar;
        enzpVar.getClass();
        uuid.getClass();
        duration.getClass();
        aibaVar.getClass();
        Duration durationMinus = Duration.ofMillis(ahwiVar.c.a()).minus(duration);
        durationMinus.getClass();
        a(ahwiVar, enzpVar, uuid, 0, 0, 0, 0, aibaVar, durationMinus, enzhVar2, null, null, 1536);
    }

    public static /* synthetic */ Duration c(ahwi ahwiVar, enzp enzpVar, UUID uuid, Integer num, boolean z, int i) {
        enzp enzpVar2;
        ahwo ahwoVar;
        aiba aibaVar = (i & 4) != 0 ? aiba.UNDEFINED : null;
        Integer num2 = (i & 8) != 0 ? null : num;
        boolean z2 = (!((i & 16) == 0)) | z;
        enzpVar.getClass();
        uuid.getClass();
        aibaVar.getClass();
        try {
            ahwoVar = (ahwo) ahwiVar.b.b();
            enzpVar2 = enzpVar;
        } catch (Exception e) {
            e = e;
            enzpVar2 = enzpVar;
        }
        try {
            auvw.k(ahwoVar.b, null, null, new ahwn(ahwoVar, z2, enzpVar2, uuid, aibaVar, num2, null), 3);
        } catch (Exception e2) {
            e = e2;
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRestore");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers", "logStartEvent", 41, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log start event for: %s", enzpVar2);
            Duration durationOfMillis = Duration.ofMillis(ahwiVar.c.a());
            durationOfMillis.getClass();
            return durationOfMillis;
        }
        Duration durationOfMillis2 = Duration.ofMillis(ahwiVar.c.a());
        durationOfMillis2.getClass();
        return durationOfMillis2;
    }

    public static /* synthetic */ void d(ahwi ahwiVar, enzp enzpVar, int i, UUID uuid, enze enzeVar, int i2, int i3) {
        aiba aibaVar = (i3 & 8) != 0 ? aiba.UNDEFINED : null;
        UUID uuid2 = (i3 & 4) != 0 ? null : uuid;
        enze enzeVar2 = (i3 & 16) != 0 ? null : enzeVar;
        int i4 = (i3 & 32) != 0 ? 0 : i2;
        enzpVar.getClass();
        aibaVar.getClass();
        auvw.k(ahwiVar.d, null, null, new ahwh(ahwiVar, enzpVar, uuid2, i, aibaVar, enzeVar2, i4, null), 3);
    }
}
