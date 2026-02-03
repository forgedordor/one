package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxd implements ServiceConnection, fbux {
    private static final Logger a = Logger.getLogger(fbxd.class.getName());
    private final Intent b;
    private final int c;
    private final fbuw d;
    private final Executor e;
    private Context f;
    private int g;
    private int h;

    public fbxd(Executor executor, Context context, Intent intent, int i, fbuw fbuwVar) {
        synchronized (this) {
            this.b = intent;
            this.c = i;
            this.d = fbuwVar;
            this.f = context;
            this.e = executor;
            this.g = 1;
            this.h = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:19:0x0045, B:31:0x00a1, B:33:0x00a7, B:34:0x00a9, B:39:0x00bc, B:38:0x00af, B:13:0x002e, B:17:0x0041, B:27:0x0071, B:30:0x008a, B:47:0x00d0, B:14:0x0033, B:15:0x003a), top: B:51:0x0001, inners: #2 }] */
    @Override // defpackage.fbux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbxd.a():void");
    }

    public final void b(Status status) {
        Logger logger = a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", status);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.d.b(status);
        }
    }

    final void c(final Status status) {
        Context context;
        synchronized (this) {
            int i = this.g;
            context = (i == 2 || i == 3) ? this.f : null;
            this.g = 4;
        }
        this.e.execute(new Runnable() { // from class: fbxb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(status);
            }
        });
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        c(Status.p.withDescription("onBindingDied: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        c(Status.n.withDescription("onNullBinding: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.h == 1) {
            this.h = 3;
            a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.d.a(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c(Status.p.withDescription("onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
