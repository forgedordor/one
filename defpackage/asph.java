package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asph implements aspd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/business/RbmWebviewHelperImpl");
    public final fcsu b;
    private final Context c;
    private final fdjx d;
    private final fcsu e;

    public asph(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.e = fcsuVar2;
    }

    @Override // defpackage.aspd
    public final Object a(String str, String str2, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d.hE()), new aspf(null, str2, this, str), fcxyVar);
    }

    public final akz b(String str) {
        String upperCase;
        float f;
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (str != null) {
            try {
                upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } catch (IllegalArgumentException unused) {
                ((ekrd) a.j().h("com/google/android/apps/messaging/shared/business/RbmWebviewHelperImpl", "getCustomTabsIntent", 70, "RbmWebviewHelperImpl.kt")).t("Invalid view mode: %s, default to full view.", str);
                f = 1.0f;
            }
        } else {
            upperCase = "FULL";
        }
        aspe aspeVar = aspe.a;
        f = ((aspe) Enum.valueOf(aspe.class, upperCase)).d;
        float f2 = displayMetrics.heightPixels;
        aky akyVar = new aky();
        int i = true != ((cpch) this.e.b()).g() ? 1 : 2;
        Intent intent = akyVar.a;
        intent.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i);
        akyVar.e();
        akyVar.d(1);
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        if (f > 1.0f) {
            int i2 = (int) (f2 / f);
            if (i2 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i2);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 1);
        }
        return akyVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, java.lang.String r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aspg
            if (r0 == 0) goto L13
            r0 = r8
            aspg r0 = (defpackage.aspg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aspg r0 = new aspg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L5c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            akz r7 = r5.b(r7)
            android.content.Intent r7 = r7.a
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r7.setData(r6)
            fcsu r6 = r5.b
            java.lang.Object r6 = r6.b()
            afzc r6 = (defpackage.afzc) r6
            agau r8 = new agau
            aeo r2 = new aeo
            r2.<init>()
            java.lang.String r4 = "RbmWebviewCustomTabs"
            r8.<init>(r4, r2, r7)
            r0.c = r3
            java.lang.Object r8 = r6.f(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            adh r8 = (defpackage.adh) r8
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asph.c(java.lang.String, java.lang.String, fcxy):java.lang.Object");
    }
}
