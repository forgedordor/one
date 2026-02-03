package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class clca extends cldg {
    private static final cqce a = cqce.g("Bugle", "AsyncBroadcastReceiver");
    public eoqr D;
    public fcsu E;
    public eosd F;
    public clcu G;
    public fcsu H;
    public fcsu I;
    private clct c;
    private final Object b = new Object();
    public boolean J = false;

    protected String M() {
        return null;
    }

    @Override // defpackage.cldb
    public final eiju c(final Context context, final Intent intent) {
        if (h(context, intent)) {
            final long jA = ((cogw) this.H.b()).a();
            synchronized (this.b) {
                eieu eieuVarK = eiiy.k("ReceiverDoInBackground");
                try {
                    ListenableFuture listenableFutureB = this.D.b(eiid.c(new eooy() { // from class: clbx
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            clca clcaVar = this.a;
                            String strM = clcaVar.M();
                            if (!TextUtils.isEmpty(strM)) {
                                ((ains) clcaVar.I.b()).g(strM, ((cogw) clcaVar.H.b()).a() - jA);
                            }
                            return clcaVar.j(context, intent);
                        }
                    }), (Executor) this.E.b());
                    eieuVarK.b(listenableFutureB);
                    eieuVarK.close();
                    clct clctVar = this.c;
                    if (clctVar == null || !clctVar.d(listenableFutureB)) {
                        cqce cqceVar = a;
                        cqbd cqbdVarA = cqceVar.a();
                        cqbdVarA.I("Creating new tracker for");
                        cqbdVarA.I(this);
                        cqbdVarA.r();
                        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        clcu clcuVar = this.G;
                        Context context2 = (Context) clcuVar.a.b();
                        context2.getClass();
                        cldf cldfVar = (cldf) clcuVar.b.b();
                        cldfVar.getClass();
                        fcsu fcsuVar = clcuVar.c;
                        egoc egocVar = (egoc) clcuVar.d.b();
                        egocVar.getClass();
                        eosd eosdVar = (eosd) clcuVar.e.b();
                        eosdVar.getClass();
                        ains ainsVar = (ains) clcuVar.f.b();
                        ainsVar.getClass();
                        aipo aipoVar = (aipo) clcuVar.g.b();
                        aipoVar.getClass();
                        clcz clczVar = (clcz) clcuVar.h.b();
                        clczVar.getClass();
                        listenableFutureB.getClass();
                        pendingResultGoAsync.getClass();
                        final clct clctVar2 = new clct(context2, cldfVar, fcsuVar, egocVar, eosdVar, ainsVar, aipoVar, clczVar, listenableFutureB, pendingResultGoAsync, this);
                        this.c = clctVar2;
                        if (i(intent)) {
                            long jLongValue = ((Long) clcv.b.e()).longValue();
                            auvh.h(this.F.schedule(eiid.k(new Runnable() { // from class: clby
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String strK = this.a.k(context, intent);
                                    final clct clctVar3 = clctVar2;
                                    if (!clctVar3.j.d.isDone()) {
                                        cqbd cqbdVarC = clct.a.c();
                                        cqbdVarC.I("Launching foreground service for");
                                        clca clcaVar = clctVar3.c;
                                        cqbdVarC.I(clcaVar);
                                        cqbdVarC.r();
                                        cgbn cgbnVar = (cgbn) clctVar3.e.b();
                                        if (TextUtils.isEmpty(strK)) {
                                            strK = ((Boolean) clcv.a.e()).booleanValue() ? clctVar3.d.getString(R.string.broadcast_receiver_notification_text_extra_info, clcaVar.getClass().getName()) : clctVar3.d.getString(R.string.foreground_service_notification_generic_text);
                                        }
                                        final Notification notificationC = cgbnVar.c(strK);
                                        cdim.a(new cdil() { // from class: clcm
                                            @Override // defpackage.cdil
                                            public final void a() {
                                                final clct clctVar4 = clctVar3;
                                                eiju eijuVarG = eiju.g(kol.a(new koi() { // from class: clco
                                                    @Override // defpackage.koi
                                                    public final Object a(final kog kogVar) {
                                                        clctVar4.b(new Consumer() { // from class: clcl
                                                            @Override // java.util.function.Consumer
                                                            /* renamed from: accept */
                                                            public final void z(Object obj) {
                                                                kogVar.b(null);
                                                            }

                                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                return Consumer$CC.$default$andThen(this, consumer);
                                                            }
                                                        });
                                                        return "Starting foreground notification";
                                                    }
                                                }));
                                                ejvr ejvrVar = new ejvr() { // from class: clcp
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj) {
                                                        cqbd cqbdVarC2 = clct.a.c();
                                                        cqbdVarC2.I("Ending foreground service on async work complete for broadcast of");
                                                        clct clctVar5 = clctVar4;
                                                        cqbdVarC2.I(clctVar5.c);
                                                        cqbdVarC2.r();
                                                        clctVar5.c();
                                                        clctVar5.h.e("Bugle.Broadcast.ForegroundNotification.Dismiss.Count", 2);
                                                        return true;
                                                    }
                                                };
                                                eosd eosdVar2 = clctVar4.g;
                                                eiju eijuVarE = eijuVarG.h(ejvrVar, eosdVar2).e(RuntimeException.class, new ejvr() { // from class: clcq
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj) {
                                                        RuntimeException runtimeException = (RuntimeException) obj;
                                                        clctVar4.e(runtimeException);
                                                        throw runtimeException;
                                                    }
                                                }, eosdVar2);
                                                Notification notification = notificationC;
                                                notification.getClass();
                                                clctVar4.f.i(eijuVarE, notification);
                                            }
                                        });
                                        String strF = clcaVar.f();
                                        if (!TextUtils.isEmpty(strF)) {
                                            clctVar3.k = clctVar3.i.c(strF, UUID.randomUUID().toString());
                                        }
                                    }
                                    clctVar3.a();
                                }
                            }), jLongValue, TimeUnit.MILLISECONDS));
                            cqbd cqbdVarA2 = cqceVar.a();
                            cqbdVarA2.I("Scheduled foreground service launch in");
                            cqbdVarA2.H(jLongValue);
                            cqbdVarA2.I("milliseconds");
                            cqbdVarA2.r();
                        }
                    } else {
                        cqbd cqbdVarA3 = a.a();
                        cqbdVarA3.I("Adding new broadcast to existing asyncWorkTracker of receiver:");
                        cqbdVarA3.I(this);
                        cqbdVarA3.r();
                    }
                } finally {
                }
            }
        }
        return eijx.e(null);
    }

    protected abstract String f();

    protected boolean h(Context context, Intent intent) {
        return true;
    }

    public boolean i(Intent intent) {
        return false;
    }

    protected eiju j(final Context context, final Intent intent) {
        return eijx.f(new Runnable() { // from class: clbz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(context, intent);
            }
        }, (Executor) this.E.b());
    }

    protected String k(Context context, Intent intent) {
        return null;
    }

    @Override // defpackage.cldb
    public final synchronized void q(String str, ListenableFuture listenableFuture) {
        if (this.J) {
            super.q(str, listenableFuture);
            return;
        }
        synchronized (this.b) {
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Adding");
            cqbdVarA.I(str);
            cqbdVarA.I("to broadcast of");
            cqbdVarA.I(this);
            cqbdVarA.r();
            eieu eieuVarK = eiiy.k("ReceiverAsyncWork");
            try {
                clct clctVar = this.c;
                clctVar.getClass();
                eieuVarK.b(listenableFuture);
                ejwl.m(clctVar.d(listenableFuture), "Cannot call addAsyncWork if all async work is complete.");
                eieuVarK.close();
            } finally {
            }
        }
    }

    @Override // defpackage.cldb
    protected final synchronized boolean r() {
        boolean z;
        if (this.J) {
            return super.r();
        }
        synchronized (this.b) {
            clct clctVar = this.c;
            z = false;
            if (clctVar != null && !clctVar.j.d.isDone()) {
                z = true;
            }
        }
        return z;
    }

    protected void g(Context context, Intent intent) {
    }
}
