package defpackage;

import android.app.job.JobScheduler;
import androidx.work.WorkerParameters;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clbu extends fcyz implements fdat {
    final /* synthetic */ WorkerParameters a;
    final /* synthetic */ clbv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clbu(WorkerParameters workerParameters, clbv clbvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = workerParameters;
        this.b = clbvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clbu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String strD = this.a.b.d("intent_action");
        if (!fdbq.f(strD, "android.intent.action.BOOT_COMPLETED")) {
            ((ekrd) clbv.b.h().h("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker$startWork$1", "invokeSuspend", 76, "BootCompleteWorker.kt")).t("Got unexpected action: %s", strD);
            return new qam();
        }
        clbv clbvVar = this.b;
        if (!((crnp) clbvVar.f.b()).e()) {
            return new qam();
        }
        long epochMilli = ((cogw) clbvVar.g.b()).f().toEpochMilli();
        fcsu fcsuVar = clbvVar.h;
        if (((crqv) fcsuVar.b()).e("app_install_time_millis", 0L) == 0) {
            ((crqv) fcsuVar.b()).k("app_install_time_millis", epochMilli);
        }
        ((eksl) clbv.a.h()).q("Silently refreshing notifications after Boot/Package replacement");
        ((cgpi) clbvVar.p.b()).e();
        Optional optional = (Optional) clbvVar.m.b();
        final fdap fdapVar = new fdap() { // from class: clbs
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                clfb clfbVar = (clfb) obj2;
                eksp ekspVar = clbv.a;
                clfbVar.getClass();
                clfbVar.i();
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: clbt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                eksp ekspVar = clbv.a;
                fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ajhd) clbvVar.i.b()).T();
        ((aiwq) clbvVar.l.b()).f(aiwp.BOOT_COMPLETE, Optional.empty());
        ((ajat) clbvVar.j.b()).g();
        JobScheduler jobScheduler = (JobScheduler) clbvVar.d.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            int[] iArr = clbv.c;
            int length = iArr.length;
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                if (jobScheduler.getPendingJob(i2) != null) {
                    jobScheduler.cancel(i2);
                }
            }
        } else {
            ((ekrd) clbv.b.i().h("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker", "cancelObsoleteJobs", 143, "BootCompleteWorker.kt")).q("JobScheduler is null");
        }
        Optional optional2 = (Optional) clbvVar.o.b();
        if (optional2.isPresent()) {
            auvh.h(((coek) optional2.get()).a());
        }
        ((ckyz) clbvVar.k.b()).a();
        ((cldx) clbvVar.e.b()).c();
        Iterator it = ((Set) clbvVar.n.b()).iterator();
        while (it.hasNext()) {
            ((cldt) it.next()).b();
        }
        return new qao();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clbu(this.a, this.b, fcxyVar);
    }
}
