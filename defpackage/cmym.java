package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmym implements cldt, cldy, ccyz, cldw {
    private static final eksp a = eksp.c("BugleRcsProvisioning");
    private final Context b;
    private final eosc c;
    private final deyj d;
    private final fcsu e;

    public cmym(Context context, eosc eoscVar, deyj deyjVar, ccyw ccywVar, fcsu fcsuVar) {
        this.b = context;
        this.c = eoscVar;
        this.d = deyjVar;
        this.e = fcsuVar;
        ccywVar.c(new dfno() { // from class: cmyl
            @Override // defpackage.dfno
            public final void onCsLibPhenotypeUpdated() {
                this.a.e();
            }
        });
    }

    @Override // defpackage.ccyz
    public final void a() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onBuglePhenotypeFlagChanged", 114, "BugleSystemBindingManager.java")).q("BugleSystemBindingManager: onBuglePhenotypeFlagChanged");
        e();
    }

    @Override // defpackage.cldt
    public final void b() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onBootComplete", 97, "BugleSystemBindingManager.java")).q("BugleSystemBindingManager: onBootComplete");
        e();
    }

    @Override // defpackage.cldy
    public final void c() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onPackageReplaced", 103, "BugleSystemBindingManager.java")).q("BugleSystemBindingManager: onPackageReplace");
        e();
    }

    @Override // defpackage.cldw
    public final eiju d(boolean z) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/systembinding/BugleSystemBindingManager", "onDefaultSmsAppChange", 120, "BugleSystemBindingManager.java")).t("BugleSystemBindingManager: onDefaultSmsAppChange; isDefaultSmsApp: %b", Boolean.valueOf(z));
        e();
        return eijx.e(null);
    }

    final void e() {
        final Context context = this.b;
        final deyj deyjVar = this.d;
        final boolean zE = dhka.e(context);
        if (zE) {
            deyjVar.d(context, 6);
        }
        eosc eoscVar = this.c;
        eiju.g(eoscVar.submit(new Runnable() { // from class: dewa
            @Override // java.lang.Runnable
            public final void run() {
                dhkz.a();
                Context context2 = context;
                PackageManager packageManager = context2.getPackageManager();
                ComponentName componentName = new ComponentName(context2, "com.google.android.ims.binding.SystemBindingService");
                boolean z = zE;
                packageManager.setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
                dhja.l(dewc.a, "SystemBinding enabled: %b", Boolean.valueOf(z));
                deyj deyjVar2 = deyjVar;
                if ((true != z ? 1 : 2) - 1 != 0) {
                    deyjVar2.d(context2, 4);
                } else {
                    deyjVar2.d(context2, 5);
                }
            }
        }, null)).k(new dewb(), eoscVar);
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }
}
