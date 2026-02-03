package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxu implements Runnable {
    final /* synthetic */ ahxy a;
    final /* synthetic */ UUID b;
    final /* synthetic */ aiad c;
    final /* synthetic */ szu d;

    public ahxu(ahxy ahxyVar, UUID uuid, aiad aiadVar, szu szuVar) {
        this.a = ahxyVar;
        this.b = uuid;
        this.c = aiadVar;
        this.d = szuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahxy ahxyVar = this.a;
        fcsu fcsuVar = ahxyVar.b;
        ahwd ahwdVar = (ahwd) fcsuVar.b();
        UUID uuid = this.b;
        ahwdVar.u(uuid, this.c);
        ekrg ekrgVar = ahxy.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps", "appUpdateNeededForRestore", 149, "BasicRestoreWorkflowSteps.kt");
        szu szuVar = this.d;
        boolean z = szuVar.d > 150;
        ekrdVar.t("Backup database schema out of date: %s", Boolean.valueOf(z));
        int i = szuVar.e;
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleRestore");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps", "appUpdateNeededForRestore", 151, "BasicRestoreWorkflowSteps.kt");
        boolean z2 = i > 1;
        ekrdVar2.t("Restore workflow version out of date: %s", Boolean.valueOf(z2));
        if (!((apve) ahxyVar.h.b()).a() || (!z && !z2)) {
            ((aibb) ahxyVar.c.b()).c(uuid, 1);
            return;
        }
        ekrw ekrwVarH3 = ekrgVar.h();
        ekrwVarH3.X(ekrzVar, "BugleRestore");
        ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$requestBugleDbRestore$2$unused$1$unusedTwo$1", "run", 129, "BasicRestoreWorkflowSteps.kt")).t("App update needed for restore [%s]", uuid);
        ((ahwd) fcsuVar.b()).w(uuid, aiaf.WAITING_ON_APP_UPDATE);
    }
}
