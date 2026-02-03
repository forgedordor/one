package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class squ extends aoll implements ebuo {
    public fcsu a;
    public fcsu b;
    private cpch u;

    /* compiled from: PG */
    public interface a {
        cpch a();

        eigp b();
    }

    @Override // defpackage.aoll, defpackage.ehnm, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = null;
            if (!cqaz.n()) {
                if (cqbe.c()) {
                    ekrw ekrwVarG = aoll.c.g();
                    ekrwVarG.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "setupUncaughtExceptionHandler", BasePaymentResult.ERROR_REQUEST_FAILED, "BugleApplicationBase.java")).q("BugleApplicationBase: UncaughtException unset: eng build");
                    if (!ActivityManager.isRunningInTestHarness()) {
                        cqaz.b = true;
                    }
                } else if (ActivityManager.isUserAMonkey()) {
                    ekrw ekrwVarG2 = aoll.c.g();
                    ekrwVarG2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "setupUncaughtExceptionHandler", 205, "BugleApplicationBase.java")).q("BugleApplicationBase: UncaughtException unset: monkey");
                } else {
                    defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    Thread.setDefaultUncaughtExceptionHandler(this);
                }
            }
            this.e = defaultUncaughtExceptionHandler;
        } catch (RuntimeException e) {
            cqbd cqbdVarE = cqce.g("BugleDataModel", "BuglePhoneApplicationBase").e();
            cqbdVarE.I("Exception installing exception handler. Crashes will not report");
            cqbdVarE.s(e);
        }
        if (craf.g(this)) {
            a aVar = (a) ehli.a(this, a.class);
            eieh eiehVarC = aVar.b().c("BuglePhoneApplicationBase#attatchBaseContext", "com/google/android/apps/messaging/BuglePhoneApplicationBase", "beginFetchDarkMode", 76);
            try {
                eidc.r();
                cpch cpchVarA = aVar.a();
                this.u = cpchVarA;
                cpchVarA.d();
                eiehVarC.close();
            } catch (Throwable th) {
                try {
                    eiehVarC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.ebuo
    public final ebun b() {
        return (ebun) this.a.b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext != null ? applicationContext : this;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        if (craf.g(this)) {
            ((cvjl) this.b.b()).g();
        }
    }

    @Override // defpackage.aoll, defpackage.ehnm, android.app.Application
    public void onCreate() throws PackageManager.NameNotFoundException {
        cpch cpchVar;
        super.onCreate();
        if (!craf.g(this) || (cpchVar = this.u) == null) {
            return;
        }
        cpchVar.e();
    }
}
