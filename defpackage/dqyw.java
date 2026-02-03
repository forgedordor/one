package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqyw {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;
    private static boolean d = false;

    private dqyw() {
    }

    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static ListenableFuture b(final Context context, Callable callable, Executor executor) {
        if (h(context)) {
            return eork.m(callable, executor);
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final dqyv dqyvVar = new dqyv(atomicBoolean, context, settableFutureCreate, callable, executor);
        context.registerReceiver(dqyvVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!h(context) || !atomicBoolean.compareAndSet(false, true)) {
            settableFutureCreate.b(new Runnable() { // from class: dqyu
                @Override // java.lang.Runnable
                public final void run() {
                    int i = dqyw.a;
                    if (settableFutureCreate.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                        dqyw.e(context, dqyvVar);
                    }
                }
            }, eoqg.a);
            return settableFutureCreate;
        }
        e(context, dqyvVar);
        settableFutureCreate.o(eork.m(callable, executor));
        return settableFutureCreate;
    }

    public static ListenableFuture c(Context context, Runnable runnable) {
        return b(context, Executors.callable(runnable, null), eoqg.a);
    }

    public static ListenableFuture d(Context context, Runnable runnable, Executor executor) {
        return b(context, Executors.callable(runnable, null), executor);
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static synchronized void f() {
        d = true;
    }

    public static boolean g(Context context) {
        return !i(context);
    }

    public static boolean h(Context context) {
        return i(context);
    }

    private static boolean i(Context context) {
        boolean zJ;
        if (c) {
            return true;
        }
        synchronized (dqyw.class) {
            if (c) {
                return true;
            }
            if (d) {
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, DirectBootHelperService.class.getName()), 268435968);
                zJ = false;
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zJ = true;
                            break;
                        }
                        if (it.next().serviceInfo.directBootAware) {
                            Log.w("DirectBootUtils", "Falling back to user manager.");
                            d = false;
                            zJ = j(context);
                            break;
                        }
                    }
                }
            } else {
                zJ = j(context);
            }
            if (zJ) {
                c = true;
            }
            return zJ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean j(android.content.Context r6) {
        /*
            r0 = 1
            r1 = r0
        L2:
            r2 = 2
            r3 = 0
            r4 = 0
            if (r1 > r2) goto L38
            android.os.UserManager r2 = defpackage.dqyw.b
            if (r2 != 0) goto L15
            java.lang.Class<android.os.UserManager> r2 = android.os.UserManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.os.UserManager r2 = (android.os.UserManager) r2
            defpackage.dqyw.b = r2
        L15:
            android.os.UserManager r2 = defpackage.dqyw.b
            if (r2 != 0) goto L1a
            return r0
        L1a:
            boolean r5 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: java.lang.NullPointerException -> L2b
            if (r5 != 0) goto L39
            android.os.UserHandle r5 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L2b
            boolean r6 = r2.isUserRunning(r5)     // Catch: java.lang.NullPointerException -> L2b
            if (r6 != 0) goto L38
            goto L39
        L2b:
            r2 = move-exception
            java.lang.String r4 = "DirectBootUtils"
            java.lang.String r5 = "Failed to check if user is unlocked."
            android.util.Log.w(r4, r5, r2)
            defpackage.dqyw.b = r3
            int r1 = r1 + 1
            goto L2
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L3d
            defpackage.dqyw.b = r3
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqyw.j(android.content.Context):boolean");
    }
}
