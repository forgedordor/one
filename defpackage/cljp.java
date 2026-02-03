package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljp implements egsc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;

    public cljp(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker", "startWork", 34, "PeriodPullWorker.kt")).q("Start periodic pull work.");
        return auvw.c(this.e, fcyi.a, fdjz.a, new cljo(this, null));
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
