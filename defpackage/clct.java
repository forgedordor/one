package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clct {
    public static final cqce a = cqce.g("Bugle", "BroadcastReceiverAsyncWorkTracker");
    public final clcz b;
    public final clca c;
    public final Context d;
    public final fcsu e;
    public final egoc f;
    public final eosd g;
    public final ains h;
    public final aipo i;
    public final clde j;
    public ainv k;
    private boolean l = false;
    private final Object m = new Object();
    private final BroadcastReceiver.PendingResult n;

    public clct(Context context, cldf cldfVar, fcsu fcsuVar, egoc egocVar, eosd eosdVar, ains ainsVar, aipo aipoVar, clcz clczVar, ListenableFuture listenableFuture, BroadcastReceiver.PendingResult pendingResult, clca clcaVar) {
        this.d = context;
        this.e = fcsuVar;
        this.f = egocVar;
        this.g = eosdVar;
        this.h = ainsVar;
        this.i = aipoVar;
        this.b = clczVar;
        this.n = pendingResult;
        this.c = clcaVar;
        this.j = cldfVar.a(listenableFuture);
        b(new Consumer() { // from class: clcn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                clct clctVar = this.a;
                clctVar.a();
                clcz clczVar2 = clctVar.b;
                clca clcaVar2 = clctVar.c;
                clczVar2.a(clcaVar2);
                clcaVar2.t();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void a() {
        boolean z;
        synchronized (this.m) {
            if (this.l) {
                z = false;
            } else {
                z = true;
                this.l = true;
            }
        }
        if (z) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Acknowledging broadcast of");
            cqbdVarC.I(this.c);
            cqbdVarC.r();
            this.n.finish();
        }
    }

    public final void b(Consumer consumer) {
        auvh.i(this.j.d, consumer, eoqg.a);
    }

    public final void c() {
        ainv ainvVar = this.k;
        if (ainvVar != null) {
            ainvVar.c();
            this.k = null;
        }
    }

    public final boolean d(ListenableFuture listenableFuture) {
        eiju eijuVarG = eiju.g(listenableFuture);
        ejvr ejvrVar = new ejvr() { // from class: clcr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        };
        eosd eosdVar = this.g;
        return this.j.a(eijuVarG.h(ejvrVar, eosdVar).e(RuntimeException.class, new ejvr() { // from class: clcs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                clct clctVar = this.a;
                RuntimeException runtimeException = (RuntimeException) obj;
                clctVar.e(runtimeException);
                clctVar.h.a();
                throw runtimeException;
            }
        }, eosdVar));
    }

    public final void e(Exception exc) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Ending foreground service for broadcast of");
        cqbdVarC.I(this.c);
        cqbdVarC.s(exc);
        c();
        this.h.e("Bugle.Broadcast.ForegroundNotification.Dismiss.Count", 1);
    }
}
