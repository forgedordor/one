package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbv implements egsc {
    public static final eksp a = eksp.c("BugleNotifications");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker");
    public static final int[] c = {BasePaymentResult.ERROR_REQUEST_TIMEOUT, BasePaymentResult.ERROR_REQUEST_FAILED};
    public final Context d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    private final fdjx q;

    public clbv(fdjx fdjxVar, Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        fdjxVar.getClass();
        context.getClass();
        fcsuVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        this.q = fdjxVar;
        this.d = context;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.m = fcsuVar9;
        this.n = fcsuVar10;
        this.o = fcsuVar11;
        this.p = fcsuVar12;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.q, fcyi.a, fdjz.a, new clbu(workerParameters, this, null));
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
