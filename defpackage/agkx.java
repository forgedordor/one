package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkx implements egsc {
    public static final agkv a = new agkv();
    public static final eksp b = eksp.c("BugleNudge");
    public static final ejxr c = ejxx.a(new ejxr() { // from class: agks
        @Override // defpackage.ejxr
        public final Object get() {
            agkv agkvVar = agkx.a;
            return cdag.f(cdag.b, "birthday_nudge_sync_worker_interval_sec", TimeUnit.DAYS.toSeconds(1L));
        }
    });
    public static final ejxr d = ejxx.a(new ejxr() { // from class: agkt
        @Override // defpackage.ejxr
        public final Object get() {
            agkv agkvVar = agkx.a;
            return cdag.f(cdag.b, "birthday_nudge_sync_worker_initial_delay_sec", 0L);
        }
    });
    public static final ejxr e = cdag.v("birthday_nudge_sync_worker_enabled");
    public final fcsu f;
    public final aglb g;
    public final egsh h;
    private final fdjx i;

    public agkx(fdjx fdjxVar, fcsu fcsuVar, aglb aglbVar, egsh egshVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        egshVar.getClass();
        this.i = fdjxVar;
        this.f = fcsuVar;
        this.g = aglbVar;
        this.h = egshVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new agkw(this, null));
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
