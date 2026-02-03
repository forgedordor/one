package defpackage;

import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgq {
    public static final cczi a;

    static {
        cdag.e(cdag.b, "within_num_hours_for_valid_fi", 24);
        a = cdag.h(cdag.b, "enable_imessage_banner", false);
    }

    public static dxgy a() {
        String str;
        String str2;
        dxgv dxgvVar = new dxgv();
        dxgvVar.c = Build.MANUFACTURER + " " + Build.MODEL;
        dxgvVar.d = 86400000L;
        short s = dxgvVar.k;
        dxgvVar.e = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        dxgvVar.l = 1;
        dxgvVar.k = (short) (s | 3);
        dxgvVar.a(false);
        short s2 = dxgvVar.k;
        dxgvVar.h = 7;
        dxgvVar.i = true;
        dxgvVar.j = true;
        dxgvVar.k = (short) (s2 | 504);
        dxgvVar.a = "messages";
        dxgvVar.b = "357317899610";
        dxgvVar.a(true);
        dxgvVar.f = "AIzaSyCB5sc4sgRVObMraVTM-ymBkANcjiQXcV0";
        if (dxgvVar.k == 511 && (str = dxgvVar.a) != null && dxgvVar.l != 0 && (str2 = dxgvVar.c) != null) {
            return new dxgw(str, dxgvVar.b, str2, dxgvVar.d, dxgvVar.e, dxgvVar.f, dxgvVar.g, dxgvVar.h, dxgvVar.i, dxgvVar.j);
        }
        StringBuilder sb = new StringBuilder();
        if (dxgvVar.a == null) {
            sb.append(" clientId");
        }
        if (dxgvVar.l == 0) {
            sb.append(" defaultEnvironment");
        }
        if (dxgvVar.c == null) {
            sb.append(" deviceName");
        }
        if ((1 & dxgvVar.k) == 0) {
            sb.append(" registrationStalenessTimeMs");
        }
        if ((dxgvVar.k & 2) == 0) {
            sb.append(" disableEntrypoints");
        }
        if ((dxgvVar.k & 4) == 0) {
            sb.append(" useDefaultFirebaseApp");
        }
        if ((dxgvVar.k & 8) == 0) {
            sb.append(" useFirebaseReceiver");
        }
        if ((dxgvVar.k & 16) == 0) {
            sb.append(" enableEndToEndEncryption");
        }
        if ((dxgvVar.k & 32) == 0) {
            sb.append(" periodRegistrationIntervalDays");
        }
        if ((dxgvVar.k & 64) == 0) {
            sb.append(" enableGrowthKitIfExists");
        }
        if ((dxgvVar.k & 128) == 0) {
            sb.append(" enableInAppPushFlow");
        }
        if ((dxgvVar.k & 256) == 0) {
            sb.append(" allowedFromEmbargoedCountries");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    static /* synthetic */ ListenableFuture b() {
        return abxb.a() ? eijx.e(dssq.a("OG_MENU_PROMO_ENABLED", 1)) : eijx.e(dssq.a("OG_MENU_PROMO_ENABLED", 0));
    }

    static /* synthetic */ ListenableFuture c() {
        return abxb.a() ? eijx.e(dssq.a("USING_GAIA_UX_ENABLED", 1)) : eijx.e(dssq.a("USING_GAIA_UX_ENABLED", 0));
    }
}
