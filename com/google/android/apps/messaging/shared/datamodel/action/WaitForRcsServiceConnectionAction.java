package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.auvw;
import defpackage.ayle;
import defpackage.aylf;
import defpackage.ayli;
import defpackage.ayll;
import defpackage.aylm;
import defpackage.aylo;
import defpackage.aylp;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cjpn;
import defpackage.cjpo;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.fcyi;
import defpackage.fdjz;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class WaitForRcsServiceConnectionAction extends Action<Boolean> {
    private final ayll b;
    private final aylo c;
    static final cczv a = cdag.n(184294411);
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new ayle();

    /* compiled from: PG */
    public interface a {
        aylf is();
    }

    public WaitForRcsServiceConnectionAction(aylm aylmVar, aylp aylpVar) {
        super(elgm.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION);
        if (((Boolean) a.e()).booleanValue()) {
            this.b = aylmVar.a();
            this.c = null;
        } else {
            this.b = null;
            this.c = aylpVar.a();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("WaitForRcsServiceConnectionAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [cjpo] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [cjpn] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        cjpn cjpnVar;
        boolean z;
        if (((Boolean) a.e()).booleanValue()) {
            throw new UnsupportedOperationException("WaitForRcsServiceConnectionAsyncAction does not implement executeAction");
        }
        aylo ayloVar = this.c;
        ayloVar.getClass();
        eieu eieuVarK = eiiy.k("WaitForRcsServiceConnectionAction.executeAction");
        try {
            ekrg ekrgVar = aylo.a;
            ekrw ekrwVarG = ekrgVar.g();
            ekrz ekrzVar = eksq.a;
            ekrwVarG.X(ekrzVar, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 42, "WaitForRcsServiceConnectionBlockingAction.java")).q("Waiting for Rcs services connection");
            final ?? countDownLatch = new CountDownLatch(1);
            cjpn cjpnVar2 = new cjpn() { // from class: ayln
                @Override // defpackage.cjpn
                public final void a() {
                    countDownLatch.countDown();
                }
            };
            cjpo cjpoVar = ayloVar.b;
            cjpoVar.j(cjpnVar2);
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (InterruptedException e) {
                e = e;
                cjpnVar = cjpnVar2;
            } catch (Throwable th2) {
                th = th2;
                countDownLatch = cjpnVar2;
            }
            try {
                if (countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                    ekrw ekrwVarG2 = ekrgVar.g();
                    ekrwVarG2.X(ekrzVar, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 48, "WaitForRcsServiceConnectionBlockingAction.java")).q("Done waiting for Rcs services connection");
                    z = true;
                    cjpnVar = cjpnVar2;
                } else {
                    cjpnVar = cjpnVar2;
                    try {
                        ekrw ekrwVarG3 = ekrgVar.g();
                        ekrwVarG3.X(ekrzVar, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarG3).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 51, "WaitForRcsServiceConnectionBlockingAction.java")).q("Waiting for Rcs services connection timed out");
                        z = false;
                    } catch (InterruptedException e2) {
                        e = e2;
                        ekrw ekrwVarJ = aylo.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 55, "WaitForRcsServiceConnectionBlockingAction.java")).q("Thread interrupted while waiting for Rcs services Connection");
                        z = false;
                        ayloVar.b.k(cjpnVar);
                        eieuVarK.close();
                        return z;
                    }
                }
                cjpoVar.k(cjpnVar);
            } catch (InterruptedException e3) {
                e = e3;
                cjpnVar = cjpnVar2;
            } catch (Throwable th3) {
                th = th3;
                countDownLatch = cjpnVar2;
                ayloVar.b.k(countDownLatch);
                throw th;
            }
            eieuVarK.close();
            return z;
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.WaitForRcsServiceConnection.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        if (!((Boolean) a.e()).booleanValue()) {
            return super.e();
        }
        ayll ayllVar = this.b;
        ayllVar.getClass();
        return auvw.c(ayllVar.b, fcyi.a, fdjz.a, new ayli(ayllVar, null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public WaitForRcsServiceConnectionAction(aylm aylmVar, aylp aylpVar, Parcel parcel) {
        super(parcel, elgm.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION);
        if (((Boolean) a.e()).booleanValue()) {
            this.b = aylmVar.a();
            this.c = null;
        } else {
            this.b = null;
            this.c = aylpVar.a();
        }
    }
}
