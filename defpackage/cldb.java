package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cldb extends cldh {
    private static final ekrg R = ekrg.c("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver");
    public fcsu K;
    public fcsu L;
    public fcsu M;
    public fcsu N;
    public fcsu O;
    private BroadcastReceiver.PendingResult S;
    private clde T;

    private final clde f(ListenableFuture listenableFuture) {
        final clde cldeVarA = ((cldf) this.O.b()).a(listenableFuture);
        auvh.i(cldeVarA.d, new Consumer() { // from class: clda
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.a.s(cldeVarA);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, (Executor) this.N.b());
        return cldeVarA;
    }

    protected int a() {
        return 18;
    }

    public abstract eieh b();

    public abstract eiju c(Context context, Intent intent);

    public abstract String d();

    @Override // defpackage.cldh, android.content.BroadcastReceiver
    public synchronized void onReceive(Context context, Intent intent) {
        L(context);
        if (TextUtils.isEmpty(intent.getAction())) {
            ((ains) this.M.b()).e("Bugle.Receiver.NonExportedReceivers.NullActionIntent.Counts", a());
        }
        eieh eiehVarB = b();
        try {
            ejwl.a(this.T == null);
            String strD = d();
            if (!TextUtils.isEmpty(strD)) {
                ((aipo) this.K.b()).b(strD);
            }
            Iterable$EL.forEach((Set) ((clcz) this.L.b()).a.b(), new Consumer() { // from class: clcw
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    final clcj clcjVar = (clcj) obj;
                    final cldb cldbVar = this.a;
                    auvh.h(eijx.f(new Runnable() { // from class: clcg
                        @Override // java.lang.Runnable
                        public final void run() {
                            clcj clcjVar2 = clcjVar;
                            List list = clcjVar2.b;
                            ejwl.l(list.add(cldbVar));
                            if (list.size() == 1) {
                                final clcf clcfVar = clcjVar2.c;
                                auvh.h(eijx.f(new Runnable() { // from class: clcc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        clcf clcfVar2 = clcfVar;
                                        clcfVar2.c = true;
                                        if (clcfVar2.d) {
                                            return;
                                        }
                                        ((clds) clcfVar2.a.b()).b();
                                    }
                                }, clcfVar.b));
                            }
                        }
                    }, clcjVar.a));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.S = null;
            try {
                eiju eijuVarC = c(context, intent);
                if (eijuVarC.isDone()) {
                    eijuVarC.k(auvh.b(), eoqg.a);
                } else {
                    q("processBroadcastAsync", eijuVarC);
                }
                eiehVarB.close();
            } finally {
                ((clcz) this.L.b()).b(this, r());
                if (!r()) {
                    ekrw ekrwVarE = R.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onReceive", 128, "BugleBroadcastReceiver.java")).t("Immediately completing broadcast of %s", this);
                    t();
                }
            }
        } finally {
        }
    }

    @Deprecated
    public synchronized void q(String str, ListenableFuture listenableFuture) {
        if (r()) {
            clde cldeVar = this.T;
            cldeVar.getClass();
            if (!cldeVar.a(listenableFuture)) {
                ekrw ekrwVarG = R.g();
                ekrwVarG.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 154, "BugleBroadcastReceiver.java")).q("Creating new dynamicFutureListListener since previous work has completed");
                this.T = f(listenableFuture);
            }
        } else {
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            this.S = pendingResultGoAsync;
            pendingResultGoAsync.getClass();
            this.T = f(listenableFuture);
            ekrw ekrwVarE = R.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 150, "BugleBroadcastReceiver.java")).t("Broadcast of %s is going async", this);
        }
        ekrw ekrwVarE2 = R.e();
        ekrwVarE2.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "addAsyncWork", 159, "BugleBroadcastReceiver.java")).D("Adding %s to broadcast of %s", str, this);
        eieu eieuVarK = eiiy.k("ReceiverAsyncWork");
        try {
            eieuVarK.b(listenableFuture);
            eieuVarK.close();
        } finally {
        }
    }

    protected synchronized boolean r() {
        return this.S != null;
    }

    public final synchronized void s(clde cldeVar) {
        if (this.T != cldeVar) {
            ekrg ekrgVar = R;
            ekrw ekrwVarG = ekrgVar.g();
            ekrz ekrzVar = eksq.a;
            ekrwVarG.X(ekrzVar, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 186, "BugleBroadcastReceiver.java")).q("Ignoring #onAsyncWorkComplete because new work has been added");
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 187, "BugleBroadcastReceiver.java")).q("skipping calling pendingResult.finish.  Work was enqueued after the processing of first batch of work was complete.");
            return;
        }
        ekrw ekrwVarE = R.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/receiver/common/BugleBroadcastReceiver", "onAsyncWorkComplete", 193, "BugleBroadcastReceiver.java")).t("Completing broadcast of %s", this);
        this.T = null;
        BroadcastReceiver.PendingResult pendingResult = this.S;
        pendingResult.getClass();
        pendingResult.finish();
        ((clcz) this.L.b()).a(this);
        t();
    }

    protected final void t() {
        String strD = d();
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        ((aipo) this.K.b()).k(strD);
    }
}
