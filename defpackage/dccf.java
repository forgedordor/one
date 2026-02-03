package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dccf extends BroadcastReceiver {
    public static SoftReference a;
    private static SoftReference b;

    protected abstract int a(Context context, CloudMessage cloudMessage);

    protected void b(Bundle bundle) {
        throw null;
    }

    public final int c(Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (dccf.class) {
            SoftReference softReference = b;
            ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorServiceUnconfigurableExecutorService == null) {
                ddmw ddmwVar = ddmx.a;
                executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new dcnq("firebase-iid-executor")));
                b = new SoftReference(executorServiceUnconfigurableExecutorService);
            }
            executorService = executorServiceUnconfigurableExecutorService;
        }
        executorService.execute(new Runnable() { // from class: dccc
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorC;
                int iC;
                Intent intent2 = intent;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    final Context context2 = context;
                    dccf dccfVar = this.a;
                    if (intent3 != null) {
                        iC = dccfVar.c(intent3);
                    } else if (intent2.getExtras() == null) {
                        iC = 500;
                    } else {
                        final CloudMessage cloudMessage = new CloudMessage(intent2);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (dccf.class) {
                            SoftReference softReference2 = dccf.a;
                            executorC = softReference2 != null ? (Executor) softReference2.get() : null;
                            if (executorC == null) {
                                ddmw ddmwVar2 = ddmx.a;
                                executorC = ddmw.c(new dcnq("pscm-ack-executor"));
                                dccf.a = new SoftReference(executorC);
                            }
                        }
                        executorC.execute(new Runnable() { // from class: dccb
                            @Override // java.lang.Runnable
                            public final void run() {
                                defn defnVarC;
                                CloudMessage cloudMessage2 = cloudMessage;
                                if (TextUtils.isEmpty(cloudMessage2.b())) {
                                    defnVarC = degc.c(null);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("google.message_id", cloudMessage2.b());
                                    Integer numA = cloudMessage2.a();
                                    if (numA != null) {
                                        bundle.putInt("google.product_id", numA.intValue());
                                    }
                                    Context context3 = context2;
                                    bundle.putBoolean("supports_message_handled", true);
                                    defnVarC = dccs.b(context3).c(2, bundle);
                                }
                                final CountDownLatch countDownLatch2 = countDownLatch;
                                defnVarC.o(new Executor() { // from class: dccd
                                    @Override // java.util.concurrent.Executor
                                    public final void execute(Runnable runnable) {
                                        runnable.run();
                                    }
                                }, new defb() { // from class: dcce
                                    @Override // defpackage.defb
                                    public final void a(defn defnVar) {
                                        countDownLatch2.countDown();
                                    }
                                });
                            }
                        });
                        int iA = dccfVar.a(context2, cloudMessage);
                        try {
                            if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                        }
                        iC = iA;
                    }
                    if (zIsOrderedBroadcast && pendingResult != null) {
                        pendingResult.setResultCode(iC);
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            }
        });
    }
}
