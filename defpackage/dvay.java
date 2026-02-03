package defpackage;

import android.content.Context;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvay implements dtvv {
    private final Context a;
    private final ecjh b;

    public dvay(Context context, ecjh ecjhVar) {
        this.a = context.getApplicationContext();
        this.b = ecjhVar;
    }

    @Override // defpackage.dtvv
    public final void a(String str, long j, int i, ejwi ejwiVar) {
        int i2 = 3;
        durt.d("%s: Scheduling periodic tasks for MDD lib %s %d", "WorkManagerTaskScheduler", str, Long.valueOf(j));
        pzn pznVar = new pzn();
        pznVar.e("MDD_TASK_TAG_KEY", str);
        pznVar.h("MDD_TASK_PERIOD_HOURS_KEY", j / 3600);
        pznVar.e("MDD_TASK_NETWORK_STATE_KEY", dtvu.a(i));
        pznVar.f("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY", ((Boolean) ejwiVar.b(new ejvr() { // from class: dvaz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dtvt) obj).a());
            }
        }).e(false)).booleanValue());
        pznVar.f("MDD_TASK_REQUIRES_CHARGING_KEY", ((Boolean) ejwiVar.b(new ejvr() { // from class: dvba
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dtvt) obj).b());
            }
        }).e(true)).booleanValue());
        pznVar.f("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY", ((Boolean) ejwiVar.b(new ejvr() { // from class: dvbb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dtvt) obj).c());
            }
        }).e(true)).booleanValue());
        pzs pzsVarA = pznVar.a();
        qbg qbgVar = new qbg(PeriodicWorker.class, j, TimeUnit.SECONDS);
        qbgVar.d(str);
        pzh pzhVar = new pzh();
        pzhVar.b = ejwiVar.g() ? ((dtvt) ejwiVar.c()).c() : true;
        pzhVar.a = ejwiVar.g() ? ((dtvt) ejwiVar.c()).b() : true;
        pzhVar.c = ejwiVar.g() ? ((dtvt) ejwiVar.c()).a() : false;
        int i3 = i - 1;
        if (i3 == 0) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 1;
        }
        pzhVar.c(i2);
        qbgVar.g(pzhVar.a());
        qbgVar.j(pzsVarA);
        qbgVar.k(str);
        qbq.a(this.a).f(str, pzy.c, (qbh) qbgVar.b());
        this.b.b(new ejvr() { // from class: dvax
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return dvaw.a;
            }
        }, eoqg.a);
    }
}
