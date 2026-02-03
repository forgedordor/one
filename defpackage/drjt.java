package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjt implements drly {
    public static final drtr b;
    private static volatile drjt g;
    public final AccessibilityManager c;
    public final Application d;
    public volatile boolean e;
    private final eosd h = drlv.b;
    private volatile boolean i;
    private volatile boolean j;
    private volatile boolean k;
    private final ejxr l;
    private ListenableFuture m;
    private ListenableFuture n;
    private final Set o;
    private final Set p;
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils");
    private static final drtr f = drtt.a("screen_reader_min_version_for_lift_to_type", 60105832);

    static {
        drtt.d("deprecate_accessibility_type_announcement");
        b = drtt.d("force_disable_type_announcement");
        ekhx.r(drlz.SWITCH_ACCESS.n, drlz.VOICE_ACCESS.n);
        new drjs();
        int i = drjo.a;
    }

    public drjt(Context context) {
        ListenableFuture listenableFuture = eorv.a;
        this.m = listenableFuture;
        this.n = listenableFuture;
        this.o = ekpg.g(4);
        this.p = ekpg.g(4);
        Application application = (Application) context.getApplicationContext();
        this.d = application;
        this.c = (AccessibilityManager) application.getSystemService("accessibility");
        ejxx.a(new ejxr() { // from class: drjr
            @Override // defpackage.ejxr
            public final Object get() {
                return (AudioManager) this.a.d.getSystemService("audio");
            }
        });
        this.l = ejxx.a(new ejxr() { // from class: drjm
            @Override // defpackage.ejxr
            public final Object get() {
                return (PowerManager) this.a.d.getSystemService("power");
            }
        });
    }

    public static drjt a(Context context) {
        final drjt drjtVar;
        drjt drjtVar2 = g;
        if (drjtVar2 != null) {
            return drjtVar2;
        }
        synchronized (drjt.class) {
            drjtVar = g;
            if (drjtVar == null) {
                drjtVar = new drjt(context.getApplicationContext());
                drjtVar.g();
                AccessibilityManager accessibilityManager = drjtVar.c;
                accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: drjp
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z) {
                        drjt drjtVar3 = this.a;
                        drjtVar3.g();
                        drjtVar3.h(3);
                    }
                });
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: drjq
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        this.a.f(z);
                    }
                });
                drlx.a.a(drjtVar);
                g = drjtVar;
            }
        }
        return drjtVar;
    }

    public static void e(View view, CharSequence charSequence) {
        view.setContentDescription(dryg.a(view.getContext().getResources().getConfiguration().getLocales().get(0), charSequence));
    }

    private static List i(AccessibilityManager accessibilityManager) {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        try {
            return accessibilityManager.getEnabledAccessibilityServiceList(1);
        } catch (SecurityException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "getEnabledAccessibilityServiceList", 998, "AccessibilityUtils.java")).o();
            return ekgbVar;
        }
    }

    public final void b(int i) {
        c(this.d.getString(i, new Object[0]));
    }

    public final void c(CharSequence charSequence) {
        ((Boolean) b.b()).booleanValue();
        if (!this.j || !((PowerManager) this.l.get()).isInteractive() || TextUtils.isEmpty(charSequence)) {
            ListenableFuture listenableFuture = eorv.a;
            return;
        }
        this.m.cancel(false);
        this.n.cancel(false);
        final CharSequence charSequenceA = dryg.a(null, charSequence);
        this.n = this.h.schedule(new Runnable() { // from class: drjl
            @Override // java.lang.Runnable
            public final void run() {
                drjt drjtVar = this.a;
                if (drjtVar.e) {
                    CharSequence charSequence2 = charSequenceA;
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(128);
                    accessibilityEventObtain.setClassName("");
                    accessibilityEventObtain.setPackageName(drjtVar.d.getPackageName());
                    accessibilityEventObtain.setEnabled(true);
                    accessibilityEventObtain.setContentDescription(charSequence2);
                    accessibilityEventObtain.getText().add(charSequence2);
                    accessibilityEventObtain.setSource(null);
                    try {
                        drjtVar.c.sendAccessibilityEvent(accessibilityEventObtain);
                    } catch (IllegalStateException e) {
                        ((ekrd) ((ekrd) drjt.a.a(drub.a).g(e)).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "announceInternal", 713, "AccessibilityUtils.java")).q("accessibilityManager can't send event when accessibility is not enabled");
                    }
                }
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    public final void d(View view) {
        if (!this.j || view == null) {
            return;
        }
        view.sendAccessibilityEvent(128);
    }

    public final void f(boolean z) {
        ArrayList arrayList;
        if (this.i == z) {
            return;
        }
        this.i = z;
        Set set = this.p;
        synchronized (set) {
            arrayList = new ArrayList(set);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AccessibilityManager.TouchExplorationStateChangeListener) arrayList.get(i)).onTouchExplorationStateChanged(this.i);
        }
    }

    public final void g() {
        boolean z;
        ArrayList arrayList;
        ResolveInfo resolveInfo;
        ApplicationInfo applicationInfo;
        AccessibilityManager accessibilityManager = this.c;
        boolean z2 = this.j;
        this.e = accessibilityManager.isEnabled();
        f(this.e && accessibilityManager.isTouchExplorationEnabled());
        this.j = this.e && this.e && !i(accessibilityManager).isEmpty();
        Iterator it = i(accessibilityManager).iterator();
        while (true) {
            if (!it.hasNext() || (resolveInfo = ((AccessibilityServiceInfo) it.next()).getResolveInfo()) == null) {
                break;
            }
            String str = resolveInfo.serviceInfo.packageName;
            Application application = this.d;
            PackageInfo packageInfo = null;
            try {
                applicationInfo = Build.VERSION.SDK_INT >= 33 ? application.getPackageManager().getApplicationInfo(str, PackageManager.ApplicationInfoFlags.of(128L)) : application.getPackageManager().getApplicationInfo(str, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                ((ekrd) ((ekrd) drya.a.j()).h("com/google/android/libraries/inputmethod/utils/PackageUtil", "getApplicationInfo", 50, "PackageUtil.java")).t("Package %s not found.", str);
                applicationInfo = null;
            }
            Application application2 = this.d;
            try {
                packageInfo = Build.VERSION.SDK_INT >= 33 ? application2.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : application2.getPackageManager().getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                ((ekrd) ((ekrd) drya.a.j()).h("com/google/android/libraries/inputmethod/utils/PackageUtil", "getPackageInfo", 31, "PackageUtil.java")).t("Package %s not found.", str);
            }
            if (applicationInfo == null || packageInfo == null) {
                break;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.getBoolean("support_lift_to_type")) {
                z = packageInfo.versionCode >= ((Long) f.b()).longValue();
            }
        }
        this.k = z;
        Application application3 = this.d;
        ((ekrd) ((ekrd) a.d()).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "logA11ySettingsChangeEvents", 867, "AccessibilityUtils.java")).J("A11y metrics. Screen reader activated %s, Touch exploration enabled %s, Font scale %f, High text contrast %s", Boolean.valueOf(this.j), Boolean.valueOf(this.i), Float.valueOf(Settings.System.getFloat(application3.getContentResolver(), "font_scale", 1.0f)), Boolean.valueOf(Settings.Secure.getInt(application3.getContentResolver(), "high_text_contrast_enabled", 0) != 0));
        if (z2 != this.j) {
            Set set = this.o;
            synchronized (set) {
                arrayList = new ArrayList(set);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AccessibilityManager.AccessibilityStateChangeListener) arrayList.get(i)).onAccessibilityStateChanged(this.j);
            }
        }
    }

    public final void h(final int i) {
        if (!this.e || this.j || i <= 0) {
            return;
        }
        this.m = this.h.schedule(new Runnable() { // from class: drjn
            @Override // java.lang.Runnable
            public final void run() {
                drjt drjtVar = this.a;
                drjtVar.g();
                drjtVar.h(i - 1);
            }
        }, 500L, TimeUnit.MILLISECONDS);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.h("isTouchExplorationEnabled", this.i);
        ejwfVarB.h("isAccessibilityEnabled", this.e);
        ejwfVarB.h("isScreenReaderActive", this.j);
        ejwfVarB.h("isScreenReaderSupportLiftToType", this.k);
        ejwfVarB.b("keyboardContext", null);
        return ejwfVarB.toString();
    }
}
