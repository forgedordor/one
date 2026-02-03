package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdb {
    public static final Executor a = new Executor() { // from class: dccu
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public final dcct e;
    public Messenger f;
    public CloudMessagingMessengerCompat g;
    private final ScheduledExecutorService j;
    public final cvw c = new cvw();
    private final Messenger k = new Messenger(new dcda(this, Looper.getMainLooper()));

    public dcdb(Context context) {
        this.d = context;
        this.e = new dcct(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String e() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return Integer.toString(i2);
    }

    private static synchronized void f(Context context, Intent intent) {
        if (i == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            i = ddmt.a(context, intent2, ddmt.a);
        }
        intent.putExtra("app", i);
    }

    public final defn a(Bundle bundle) throws RemoteException {
        final String strE = e();
        final defr defrVar = new defr();
        cvw cvwVar = this.c;
        synchronized (cvwVar) {
            cvwVar.put(strE, defrVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.e.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", a.a(strE, "|ID|", "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.k);
        if (this.f != null || this.g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.e.b() == 2) {
            Context context = this.d;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            this.d.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.j.schedule(new Runnable() { // from class: dccy
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor = dcdb.a;
                if (defrVar.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        defv defvVar = defrVar.a;
        defvVar.o(a, new defb() { // from class: dccz
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                cvw cvwVar2 = this.a.c;
                String str = strE;
                synchronized (cvwVar2) {
                    cvwVar2.remove(str);
                }
                scheduledFutureSchedule.cancel(false);
            }
        });
        return defvVar;
    }

    public final defn b(final Bundle bundle) {
        dcct dcctVar = this.e;
        if (dcctVar.a() < 12000000) {
            return dcctVar.b() != 0 ? a(bundle).e(a, new deeq() { // from class: dccv
                @Override // defpackage.deeq
                public final Object a(defn defnVar) {
                    if (!defnVar.m() || !dcdb.d((Bundle) defnVar.i())) {
                        return defnVar;
                    }
                    return this.a.a(bundle).g(dcdb.a, new defm() { // from class: dccx
                        @Override // defpackage.defm
                        public final defn a(Object obj) {
                            Bundle bundle2 = (Bundle) obj;
                            return dcdb.d(bundle2) ? degc.c(null) : degc.c(bundle2);
                        }
                    });
                }
            }) : degc.b(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        dccs dccsVarB = dccs.b(this.d);
        return dccsVarB.d(new dccr(dccsVarB.a(), bundle)).c(a, new deeq() { // from class: dccw
            @Override // defpackage.deeq
            public final Object a(defn defnVar) throws IOException {
                Executor executor = dcdb.a;
                if (defnVar.m()) {
                    return (Bundle) defnVar.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(defnVar.h()))));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", defnVar.h());
            }
        });
    }

    public final void c(String str, Bundle bundle) {
        cvw cvwVar = this.c;
        synchronized (cvwVar) {
            defr defrVar = (defr) cvwVar.remove(str);
            if (defrVar == null) {
                Log.w("Rpc", a.v(str, "Missing callback for "));
            } else {
                defrVar.b(bundle);
            }
        }
    }
}
