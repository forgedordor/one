package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chql implements egrw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker");
    public final chqo b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;

    public chql(fdjx fdjxVar, chqo chqoVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.e = fdjxVar;
        this.b = chqoVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egrw, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new chqk(this, null));
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
