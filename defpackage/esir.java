package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class esir extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService g;

    public esir() {
        ddmw ddmwVar = ddmx.a;
        this.g = ddmw.c(new dcnq("Firebase-Messaging-Intent-Handle"));
        this.b = new Object();
        this.d = 0;
    }

    public final defn d(final Intent intent) {
        final defr defrVar = new defr();
        this.g.execute(new Runnable() { // from class: esip
            @Override // java.lang.Runnable
            public final void run() {
                esir esirVar = this.a;
                Intent intent2 = intent;
                defr defrVar2 = defrVar;
                try {
                    esirVar.f(intent2);
                } finally {
                    defrVar2.b(null);
                }
            }
        });
        return defrVar.a;
    }

    public final void e(Intent intent) {
        if (intent != null) {
            eskn.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void f(Intent intent);

    protected Intent g() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.a == null) {
            this.a = new eskq(new esiq(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.g.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent intentG = g();
        if (intentG == null) {
            e(intent);
            return 2;
        }
        defn defnVarD = d(intentG);
        if (defnVarD.l()) {
            e(intent);
            return 2;
        }
        defnVarD.o(new Executor() { // from class: esin
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new defb() { // from class: esio
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                this.a.e(intent);
            }
        });
        return 3;
    }
}
