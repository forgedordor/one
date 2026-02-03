package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyv extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ Callable d;
    final /* synthetic */ Executor e;

    public dqyv(AtomicBoolean atomicBoolean, Context context, SettableFuture settableFuture, Callable callable, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = settableFuture;
        this.d = callable;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            dqyw.e(this.b, this);
            this.c.o(eork.m(this.d, this.e));
        }
    }
}
