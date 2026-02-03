package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dakl {
    private final Context e;
    private final fcsu f;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/ui/util/UiUtils");
    public static final cqce a = cqce.g("Bugle", "UiUtils");
    private static int c = -1;
    private static int d = -1;

    public dakl(Context context, fcsu fcsuVar) {
        this.e = context;
        this.f = fcsuVar;
    }

    public static int a(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return b(context);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r12) {
        /*
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r12)
            boolean r0 = r0.hasPermanentMenuKey()
            java.lang.String r1 = "Bugle"
            java.lang.String r2 = "android"
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L17
            r0 = 4
            boolean r0 = android.view.KeyCharacterMap.deviceHasKey(r0)
            if (r0 == 0) goto L99
        L17:
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r5 = "config_showNavigationBar"
            java.lang.String r6 = "bool"
            int r0 = r0.getIdentifier(r5, r6, r2)
            if (r0 <= 0) goto L31
            android.content.res.Resources r5 = r12.getResources()
            boolean r0 = r5.getBoolean(r0)
            if (r0 == 0) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r4
        L32:
            java.lang.String r5 = "qemu.hw.mainkeys"
            r6 = 0
            java.lang.String r7 = "android.os.SystemProperties"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "get"
            r9 = 2
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r4] = r11     // Catch: java.lang.Throwable -> L5e
            r10[r3] = r11     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Method r8 = r7.getDeclaredMethod(r8, r10)     // Catch: java.lang.Throwable -> L5e
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L5e
            r9[r4] = r5     // Catch: java.lang.Throwable -> L5e
            r9[r3] = r6     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r8.invoke(r7, r9)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L5c
            goto L85
        L5c:
            r6 = r7
            goto L85
        L5e:
            r7 = move-exception
            ekrg r8 = defpackage.crai.a
            ekrw r8 = r8.i()
            ekrz r9 = defpackage.eksq.a
            r8.X(r9, r1)
            ekrd r8 = (defpackage.ekrd) r8
            ekrw r7 = r8.g(r7)
            ekrd r7 = (defpackage.ekrd) r7
            r8 = 38
            java.lang.String r9 = "SystemProperties.java"
            java.lang.String r10 = "com/google/android/apps/messaging/shared/util/os/SystemProperties"
            java.lang.String r11 = "getSystemProperty"
            ekrw r7 = r7.h(r10, r11, r8, r9)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Error while trying to retrieve system property '%s'"
            r7.t(r8, r5)
        L85:
            java.lang.String r5 = "1"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8e
            goto Le8
        L8e:
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L97
            goto L99
        L97:
            if (r0 == 0) goto Le8
        L99:
            android.content.res.Resources r0 = r12.getResources()
            android.content.res.Configuration r5 = r0.getConfiguration()
            int r5 = r5.orientation
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = r12.screenLayout
            r12 = r12 & 15
            r6 = 3
            if (r12 >= r6) goto Lb5
            java.lang.String r12 = "navigation_bar_width"
            goto Lb7
        Lb5:
            java.lang.String r12 = "navigation_bar_height_landscape"
        Lb7:
            if (r5 != r3) goto Lbb
            java.lang.String r12 = "navigation_bar_height"
        Lbb:
            java.lang.String r3 = "dimen"
            int r12 = r0.getIdentifier(r12, r3, r2)
            if (r12 <= 0) goto Lc8
            int r12 = r0.getDimensionPixelSize(r12)
            return r12
        Lc8:
            ekrg r12 = defpackage.dakl.b
            ekrw r12 = r12.j()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r1)
            ekrd r12 = (defpackage.ekrd) r12
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r1 = "UiUtils.java"
            java.lang.String r2 = "com/google/android/apps/messaging/ui/util/UiUtils"
            java.lang.String r3 = "getNavigationBarSize"
            ekrw r12 = r12.h(r2, r3, r0, r1)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "Could not find navigation bar size"
            r12.q(r0)
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dakl.b(android.content.Context):int");
    }

    public static int c(Context context) throws Resources.NotFoundException {
        int i;
        int i2;
        boolean z = context.getResources().getConfiguration().orientation == 1;
        if (z && (i2 = c) != -1) {
            return i2;
        }
        if (!z && (i = d) != -1) {
            return i;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        if (z) {
            c = dimensionPixelSize;
            return dimensionPixelSize;
        }
        d = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static Activity d(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static Activity e(View view) {
        return d(view.getContext());
    }

    public static Activity f(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static void g(View view) {
        Activity activityE = e(view);
        if (activityE instanceof iy) {
            iy iyVar = (iy) activityE;
            lxr.b(view, iyVar);
            lxs.b(view, iyVar);
            pje.b(view, iyVar);
        }
        if (activityE instanceof eg) {
            eg egVar = (eg) activityE;
            lxr.b(view, egVar);
            lxs.b(view, egVar);
            pje.b(view, egVar);
        }
    }

    public static void h(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public static boolean m(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static void n(Activity activity, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d2 = displayMetrics.widthPixels;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            int i = (int) (d2 * 0.15d);
            marginLayoutParams.setMargins(i, 0, i, 0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Deprecated
    public final void i(int i) {
        j(this.e.getString(i));
    }

    @Deprecated
    public final void j(String str) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("showToastAtBottom");
        cqbdVarC.A("message", str);
        cqbdVarC.r();
        ((dain) this.f.b()).a(str, false);
    }

    @Deprecated
    public final void k(String str) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("showToastAtBottomLogSanitizedPii");
        cqbdVarC.D("message", str);
        cqbdVarC.r();
        ((dain) this.f.b()).a(str, true);
    }

    public final boolean l() {
        return m(this.e);
    }

    public final void o(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ui/util/UiUtils", "startExternalActivity", (char) 384, "UiUtils.java")).q("Couldn't find activity:");
            i(R.string.activity_not_found_message);
        }
    }

    @Deprecated
    public final void p(int i) {
        ((dain) this.f.b()).c(i, false);
    }
}
