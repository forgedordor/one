package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egnr extends Service {
    public egop a;

    /* compiled from: PG */
    public interface a {
        void gB(egnr egnrVar);
    }

    public final egop a() {
        egop egopVar = this.a;
        if (egopVar != null) {
            return egopVar;
        }
        fdbq.c("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.getClass();
        egoo egooVarA = a().a(getClass());
        synchronized (egooVarA.b) {
            Iterator it = egooVarA.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((a) ehli.a(this, a.class)).gB(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        eifn eifnVarS;
        fdae fdaeVar = new fdae() { // from class: egnq
            @Override // defpackage.fdae
            public final Object invoke() {
                egnr egnrVar = this.a;
                egoo egooVarA = egnrVar.a().a(egnrVar.getClass());
                Object obj = egooVarA.b;
                Intent intent2 = intent;
                int i3 = i2;
                synchronized (obj) {
                    if (intent2 != null) {
                        egooVarA.h = egnrVar;
                        egooVarA.i = i3;
                        egooVarA.g = egon.STARTED;
                        if (egooVarA.c.isEmpty()) {
                            egooVarA.c(egnrVar, (Notification) intent2.getParcelableExtra("fallback_notification"));
                            egooVarA.d();
                        } else {
                            egooVarA.j = egooVarA.a(egooVarA.j);
                            egooVarA.c(egnrVar, egooVarA.j.a);
                        }
                    } else if (egooVarA.g == egon.STOPPED) {
                        egnrVar.stopSelf(i3);
                    }
                }
                return fctx.a;
            }
        };
        if (intent != null) {
            long j = eiid.a;
            eifnVarS = eiid.s(intent);
        } else {
            eifnVarS = null;
        }
        if (eifnVarS == null) {
            fdaeVar.invoke();
            return 2;
        }
        eifi eifiVarB = eidc.b();
        eifn eifnVarH = eidc.h(eifiVarB, eifnVarS);
        try {
            fdaeVar.invoke();
            return 2;
        } catch (Throwable th) {
            try {
                eict.c(th);
                throw th;
            } finally {
                eidc.h(eifiVarB, eifnVarH);
            }
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        egoo egooVarA = a().a(getClass());
        synchronized (egooVarA.b) {
            if (egooVarA.g.ordinal() == 2) {
                egooVarA.d();
                egom egomVar = new egom();
                ekfe ekfeVar = egooVarA.d;
                Collection collectionV = ekfeVar.v();
                ekhv ekhvVar = new ekhv();
                Iterator it = collectionV.iterator();
                while (it.hasNext()) {
                    ekhvVar.c(((eiik) it.next()).a);
                }
                ekhx<eifn> ekhxVarG = ekhvVar.g();
                eiip eiipVar = new eiip(egomVar, new StackTraceElement[0]);
                ekgi ekgiVar = new ekgi();
                for (eifn eifnVar : ekhxVarG) {
                    eiip eiipVar2 = new eiip(null, eiip.l(eifnVar, null));
                    eiipVar.addSuppressed(eiipVar2);
                    ekgiVar.i(eifnVar, eiipVar2);
                }
                ekgp ekgpVarC = ekgiVar.c();
                eiip.h(ekgpVarC);
                eiip.f(ekgpVarC);
                ((ekrd) ((ekrd) ((ekrd) egoo.a.i()).g(eiipVar)).h("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", 438, "ForegroundServiceTracker.java")).q("Timeout elapsed");
                egooVarA.f.clear();
                ekfeVar.q();
            }
        }
    }
}
