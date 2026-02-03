package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crov implements crou {
    private static final cqce a = cqce.g("Bugle", "TelephonySubscriptionInfoAsOfL");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL");
    private final Context c;
    private final int d;
    private final TelephonyManager e;
    private ConnectivityManager f;

    public crov(Context context, crot crotVar, int i) {
        this.c = context;
        this.d = i;
        this.e = crotVar.a(i);
    }

    @Override // defpackage.crou
    public final int[] A() throws NumberFormatException {
        int i;
        String networkOperator = this.e.getNetworkOperator();
        int i2 = 0;
        try {
            i = Integer.parseInt(networkOperator.substring(0, 3));
            try {
                i2 = Integer.parseInt(networkOperator.substring(3));
            } catch (NumberFormatException e) {
                e = e;
                ((ekrd) ((ekrd) ((ekrd) b.j()).g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getNetworkMccMnc", 136, "TelephonySubscriptionInfoAsOfL.java")).t("getNetworkMccMnc returned invalid string: %s", networkOperator);
                return new int[]{i, i2};
            }
        } catch (NumberFormatException e2) {
            e = e2;
            i = 0;
        }
        return new int[]{i, i2};
    }

    @Override // defpackage.crou
    public final int a() {
        return 0;
    }

    @Override // defpackage.crou
    public final int b() {
        return 0;
    }

    @Override // defpackage.crou
    public final int c() {
        return 0;
    }

    @Override // defpackage.crou
    public final int d() {
        return 0;
    }

    @Override // defpackage.crou
    public final Bitmap e(Context context) {
        return null;
    }

    @Override // defpackage.crou
    public final SmsManager f() {
        return SmsManager.getSmsManagerForSubscriptionId(this.d);
    }

    @Override // defpackage.crou
    public final Optional g() {
        return Optional.ofNullable(f().getCarrierConfigValues());
    }

    @Override // defpackage.crou
    public final Optional h() {
        try {
            String line1Number = this.e.getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                return Optional.of(line1Number);
            }
        } catch (SecurityException | UnsupportedOperationException e) {
            ekrd ekrdVarJ = a.j();
            ekrdVarJ.V(1, TimeUnit.MINUTES);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getRawSelfNumber", 191, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty self raw number");
        }
        return Optional.empty();
    }

    @Override // defpackage.crou
    public final CharSequence i() {
        return this.e.getNetworkOperatorName();
    }

    @Override // defpackage.crou
    public final CharSequence j() {
        return this.e.getNetworkOperatorName();
    }

    @Override // defpackage.crou
    public final String k() {
        try {
            return ejwk.b(this.e.getDeviceId());
        } catch (Exception e) {
            ekrd ekrdVarJ = a.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getDeviceId", 247, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty device id");
            return "";
        }
    }

    @Override // defpackage.crou
    public final String l() {
        return null;
    }

    @Override // defpackage.crou
    public final String m() {
        return this.e.getNetworkCountryIso();
    }

    @Override // defpackage.crou
    public final String n() {
        return this.e.getNetworkOperatorName();
    }

    @Override // defpackage.crou
    public final String o() {
        return this.e.getNetworkOperatorName();
    }

    @Override // defpackage.crou
    public final String p() {
        return ejwk.b(this.e.getSimCountryIso());
    }

    @Override // defpackage.crou
    public final String q() {
        return this.e.getSimOperatorName();
    }

    @Override // defpackage.crou
    public final String r() {
        return this.e.getSimOperator();
    }

    @Override // defpackage.crou
    public final String s() {
        try {
            return this.e.getSimSerialNumber();
        } catch (Exception e) {
            ekrd ekrdVarJ = a.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getSimSerialNumber", 166, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty SIM serial number");
            return "";
        }
    }

    @Override // defpackage.crou
    public final String t() {
        return "";
    }

    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.crou
    public final String u(Context context) {
        try {
            return ejwk.b(this.e.getSubscriberId());
        } catch (Exception e) {
            ekrd ekrdVarJ = a.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "getSubscriberId", 262, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: Missing permissions, returning empty subscriber id");
            return "";
        }
    }

    @Override // defpackage.crou
    public final boolean v() {
        int i = this.d;
        ejwl.n(i == -1, "Default subscription must be %s", i);
        return this.e.hasIccCard();
    }

    @Override // defpackage.crou
    public final boolean w() throws NoSuchMethodException, SecurityException {
        Boolean bool = false;
        if (this.f == null) {
            this.f = (ConnectivityManager) this.c.getSystemService("connectivity");
        }
        try {
            Method declaredMethod = this.f.getClass().getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            bool = (Boolean) declaredMethod.invoke(this.f, null);
        } catch (Exception e) {
            ekrd ekrdVarJ = a.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfL", "isMobileDataEnabled", 227, "TelephonySubscriptionInfoAsOfL.java")).q("TelephonySubscriptionInfoAsOfL: isMobileDataEnabled: system api not found");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.crou
    public final boolean x() {
        return this.e.isNetworkRoaming();
    }

    @Override // defpackage.crou
    public final boolean y() {
        return this.e.getSimState() != 1;
    }

    @Override // defpackage.crou
    public final int[] z() throws NumberFormatException {
        int i;
        String simOperator = this.e.getSimOperator();
        int i2 = 0;
        try {
            i = Integer.parseInt(simOperator.substring(0, 3));
        } catch (Exception e) {
            e = e;
            i = 0;
        }
        try {
            i2 = Integer.parseInt(simOperator.substring(3));
        } catch (Exception e2) {
            e = e2;
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("getMccMnc: invalid string ");
            cqbdVarE.I(simOperator);
            cqbdVarE.s(e);
            return new int[]{i, i2};
        }
        return new int[]{i, i2};
    }
}
