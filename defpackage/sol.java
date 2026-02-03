package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sol implements smj {
    public static final String a = "sol";
    public static final ComponentName b;
    public static final ComponentName c;
    protected final Context d;
    public final Executor e;
    public final boolean f;
    private final eosc g;
    private final long h;
    private final ScheduledExecutorService i;
    private final boolean j;
    private final Object k = new Object();
    private sok l;
    private ScheduledFuture m;

    static {
        ComponentName componentName = new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
        b = componentName;
        c = new ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
    }

    public sol(smn smnVar) {
        sms smsVar = (sms) smnVar;
        this.d = smsVar.a;
        this.g = eosj.a(smsVar.b);
        this.e = smsVar.c;
        this.f = smsVar.d;
        this.h = smsVar.e.toMillis();
        this.i = smsVar.f;
        this.j = smsVar.g;
    }

    private final void k() {
        long j = this.h;
        if (j <= 0) {
            return;
        }
        synchronized (this.k) {
            ScheduledFuture scheduledFuture = this.m;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.m = this.i.schedule(new Runnable() { // from class: sny
                @Override // java.lang.Runnable
                public final void run() {
                    Log.i(sol.a, "Cleaning up due to autoUnbind.");
                    this.a.j();
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.smj
    public final ListenableFuture a(final int i) {
        return eooq.g(i(), new eooz() { // from class: snr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                IAICoreService iAICoreService = (IAICoreService) obj;
                String str = sol.a;
                try {
                    sgj feature = iAICoreService.getFeature(i);
                    return eork.i(feature == null ? null : smq.f(feature));
                } catch (RemoteException e) {
                    Log.e(sol.a, "AiCore service failed to get feature.", e);
                    return eork.h(new smo(3, 6, "AiCore service failed to get feature.", e));
                }
            }
        }, this.g);
    }

    @Override // defpackage.smj
    public final ListenableFuture b(final int i, final int i2) {
        return eooq.g(i(), new eooz() { // from class: sns
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                IAICoreService iAICoreService = (IAICoreService) obj;
                String str = sol.a;
                int i3 = i;
                int i4 = i2;
                try {
                    if (iAICoreService.getApiVersion() < 6) {
                        return eork.h(new smo(3, 8, "getFeatureOrControl is not supported before AICoreVersion V7", null));
                    }
                    sgj featureOrControl = iAICoreService.getFeatureOrControl(i3, i4);
                    return featureOrControl == null ? eork.h(new smo(3, 606, String.format(Locale.ENGLISH, "Feature %d is not available.", Integer.valueOf(i3)), null)) : eork.i(smq.f(featureOrControl));
                } catch (RemoteException e) {
                    Log.e(sol.a, "AiCore service failed to get feature.", e);
                    return eork.h(new smo(3, 6, "AiCore service failed to get feature.", e));
                }
            }
        }, this.g);
    }

    @Override // defpackage.smj
    public final ListenableFuture c(final smq smqVar) {
        return eooq.g(i(), new eooz() { // from class: snu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                IAICoreService iAICoreService = (IAICoreService) obj;
                String str = sol.a;
                smq smqVar2 = smqVar;
                try {
                    return eork.i(Integer.valueOf(iAICoreService.getFeatureStatus(smqVar2.e())));
                } catch (RemoteException e) {
                    Log.e(sol.a, "AiCore service failed to get feature status for ".concat(smqVar2.h()), e);
                    return eork.h(new smo(3, 6, "AiCore service failed to get feature status for ".concat(smqVar2.h()), e));
                }
            }
        }, this.g);
    }

    @Override // defpackage.smj, java.lang.AutoCloseable
    public final void close() {
        j();
    }

    @Override // defpackage.smj
    public final ListenableFuture d() {
        sok sokVar;
        SettableFuture settableFuture;
        synchronized (this.k) {
            k();
            sokVar = this.l;
            if (sokVar == null) {
                sokVar = new sok(this);
                this.l = sokVar;
                Intent intent = new Intent();
                intent.setComponent(b);
                try {
                    if (!sokVar.d(intent)) {
                        sokVar.d.d.unbindService(sokVar);
                        Intent intent2 = new Intent();
                        intent2.setComponent(c);
                        if (!sokVar.d(intent2)) {
                            sokVar.b(new smo(4, 601, "AiCore service failed to bind.", null));
                        }
                    }
                } catch (SecurityException e) {
                    sokVar.b(new smo(4, 601, "AiCore service failed to bind.", e));
                }
            }
        }
        synchronized (sokVar.a) {
            if (sokVar.b.isCancelled()) {
                sokVar.c();
            }
            settableFuture = sokVar.b;
        }
        return settableFuture;
    }

    @Override // defpackage.smj
    public final eosc e() {
        return this.g;
    }

    @Override // defpackage.smj
    public final Executor f() {
        return this.e;
    }

    @Override // defpackage.smj
    public final boolean g() {
        return this.j;
    }

    @Override // defpackage.smj
    public final ListenableFuture h(final smq smqVar, final ejcr ejcrVar) {
        return eooq.g(d(), new eooz() { // from class: snx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final smi smiVar = (smi) obj;
                final smq smqVar2 = smqVar;
                final sol solVar = this.a;
                final ejcr ejcrVar2 = ejcrVar;
                return smiVar.b().a(kol.a(new koi() { // from class: snv
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        smi smiVar2 = smiVar;
                        smq smqVar3 = smqVar2;
                        try {
                            int apiVersion = smiVar2.a().getApiVersion();
                            ejcr ejcrVar3 = ejcrVar2;
                            sol solVar2 = solVar;
                            if (apiVersion > 0) {
                                smiVar2.a().requestDownloadableFeatureWithDownloadListener2(smqVar3.e(), new sod(solVar2, ejcrVar3, smqVar3, kogVar));
                            } else {
                                smiVar2.a().requestDownloadableFeatureWithDownloadListener(smqVar3.e(), new soi(solVar2, ejcrVar3, smqVar3, kogVar));
                            }
                            return "requestDownloadableFeatureFuture";
                        } catch (RemoteException e) {
                            Log.e(sol.a, "AiCore service failed to download feature ".concat(smqVar3.h()), e);
                            kogVar.c(new smo(1, 6, "AICore service failed to download feature ".concat(smqVar3.h()), e));
                            return "requestDownloadableFeatureFuture";
                        }
                    }
                }), new ejxr() { // from class: snw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String str = sol.a;
                        return new smo(1, 6, "AICore service disconnected", null);
                    }
                });
            }
        }, this.g);
    }

    public final ListenableFuture i() {
        k();
        return eooq.f(eoqt.t(d()), new ejvr() { // from class: snt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((smi) obj).a();
            }
        }, eoqg.a);
    }

    public final void j() {
        synchronized (this.k) {
            sok sokVar = this.l;
            if (sokVar != null) {
                synchronized (sokVar.a) {
                    sokVar.d.d.unbindService(sokVar);
                    sokVar.c.c();
                }
                this.l = null;
            }
            ScheduledFuture scheduledFuture = this.m;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.m = null;
            }
        }
    }
}
