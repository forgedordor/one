package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import com.android.vcard.VCardConfig;
import j$.time.Instant;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxhk extends BroadcastReceiver {
    public static final eksp a = eksp.c("GnpSdk");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public abstract dxhl a(Context context);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) throws IOException {
        context.getClass();
        if (intent == null) {
            ((eksl) ((eksl) a.i()).g(new IllegalArgumentException())).q("Null Intent received.");
            return;
        }
        if (intent.hasExtra("fms") && fdbq.f(intent.getStringExtra("fms"), "1")) {
            ((eksl) a.h()).q("Chime payload will be processed by Firebase service, returning.");
            return;
        }
        final long micros = TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli());
        ejwl.a(true);
        dxfy dxfyVarC = dxfy.c((intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) > 0 ? 8500L : 58500L);
        eksp ekspVar = a;
        ((eksl) ekspVar.h()).D("Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        try {
            dxkh dxkhVarA = dxkg.a(context);
            dxkhVarA.getClass();
            dxkhVarA.dO().a(context);
            ((eksl) ekspVar.h()).q("Phenotype initialized.");
            eifp eifpVarA = dxkhVarA.dK().a("GnpBroadcastReceiver");
            try {
                dxkhVarA.iU();
                final dxhl dxhlVarA = a(context);
                if (dxhlVarA.b(intent)) {
                    ((eksl) ekspVar.h()).t("Validation OK for action [%s].", intent.getAction());
                    dxji dxjiVarDL = dxkhVarA.dL();
                    if (dxuh.d(context)) {
                        final fdci fdciVar = new fdci();
                        fdciVar.a = dxfyVarC;
                        if (b.compareAndSet(false, true)) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
                            if (jElapsedRealtime <= fbck.a.get().a()) {
                                if (!dxfyVarC.e()) {
                                    dxfm dxfmVar = new dxfm();
                                    dxfmVar.a = Long.valueOf(Math.max(0L, ((dxfn) dxfyVarC).a.longValue() - jElapsedRealtime));
                                    dxfmVar.b(((dxfn) dxfyVarC).b);
                                    dxfyVarC = dxfmVar.a();
                                }
                                fdciVar.a = dxfyVarC;
                            }
                        }
                        fbcq.b();
                        dxjiVarDL.a(goAsync(), isOrderedBroadcast(), new Runnable() { // from class: dxhi
                            @Override // java.lang.Runnable
                            public final void run() throws SecurityException, IllegalArgumentException {
                                eksl ekslVar = (eksl) dxhk.a.h();
                                dxhl dxhlVar = dxhlVarA;
                                Intent intent2 = intent;
                                ekslVar.t("Executing action in BroadcastReceiver [%s].", intent2.getAction());
                                dxhj.a(dxhlVar, intent2, (dxfy) fdciVar.a, micros);
                            }
                        }, (dxfy) fdciVar.a);
                    } else {
                        fbcq.b();
                        dxjiVarDL.b(new Runnable() { // from class: dxhh
                            @Override // java.lang.Runnable
                            public final void run() throws SecurityException, IllegalArgumentException {
                                eksl ekslVar = (eksl) dxhk.a.h();
                                dxhl dxhlVar = dxhlVarA;
                                Intent intent2 = intent;
                                ekslVar.t("Executing action in Service [%s].", intent2.getAction());
                                dxhj.a(dxhlVar, intent2, dxfy.d(), micros);
                            }
                        });
                    }
                } else {
                    ((eksl) ekspVar.h()).t("Validation failed for action [%s].", intent.getAction());
                }
                fczl.a(eifpVarA, null);
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(eifpVarA, th);
                    throw th2;
                }
            }
        } catch (RuntimeException e) {
            ((eksl) ((eksl) a.j()).g(e)).q("BroadcastReceiver stopped");
        }
    }
}
