package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzm implements eyif {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [ahwe] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ahwe] */
    public static ahwe a(Map map, long j, ahxy ahxyVar, arja arjaVar, fcsu fcsuVar) {
        ahxy ahxyVar2;
        fcsuVar.getClass();
        if (((eoth) ((arht) arjaVar).a.b()).a("bugle.enable_restore_anytime_v1")) {
            Object objB = fcsuVar.b();
            ekrw ekrwVarH = ahzl.a.h();
            ekrwVarH.X(eksq.a, "BugleRestore");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.V(10, TimeUnit.SECONDS);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/impl/StableRestoreWorkflowStepsModule", "providesStableRestoreWorkflowSteps", 47, "StableRestoreWorkflowStepsModule.kt")).q("Returning restoreAnytimeCompatibleRestoreWorkflowSteps");
            ahxyVar2 = (ahwe) objB;
        } else {
            ?? r5 = (ahwe) map.get(Integer.valueOf((int) j));
            if (r5 == null) {
                ekrw ekrwVarJ = ahzl.a.j();
                ekrwVarJ.X(eksq.a, "BugleRestore");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ;
                ekrdVar2.V(10, TimeUnit.SECONDS);
                ekrdVar2.X(ahtp.a, Long.valueOf(j));
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/restore/impl/StableRestoreWorkflowStepsModule", "providesStableRestoreWorkflowSteps", 56, "StableRestoreWorkflowStepsModule.kt")).s("RestoreWorkflowSteps not found for stable version [%d]. Using BasicRestoreWorkflowSteps", j);
                ahxyVar2 = ahxyVar;
            } else {
                ahxyVar2 = r5;
            }
        }
        ahxyVar2.getClass();
        return ahxyVar2;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
