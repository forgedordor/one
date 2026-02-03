package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crox extends crnh {
    private static final ejxr a = cdag.v("log_anomaly_in_sub");
    private static final eksp b = eksp.c("Bugle");
    private static final cqce c = cqce.g("Bugle", "TelephonySubscriptionInfoAsOfLMR1");
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1");
    private final TelephonyManager e;
    private final int f;
    private final croe g;
    private final SubscriptionManager h;
    private final crny i;

    /* JADX WARN: Illegal instructions before constructor call */
    public crox(crow crowVar, croe croeVar, crny crnyVar, crot crotVar, Context context, int i) {
        Context context2 = (Context) crowVar.a.b();
        context2.getClass();
        ((crnu) crowVar.b.b()).getClass();
        crot crotVar2 = (crot) crowVar.c.b();
        crotVar2.getClass();
        super(new crov(context2, crotVar2, i));
        this.e = crotVar.a(i);
        this.f = i;
        this.g = croeVar;
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        this.h = subscriptionManager == null ? SubscriptionManager.from(context) : subscriptionManager;
        this.i = crnyVar;
    }

    private static int B(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(new Object(), Integer.valueOf(i));
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
            return -1;
        } catch (Exception e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(i));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getSlotId", 243, "TelephonySubscriptionInfoAsOfLMR1.java")).t("TelephonySubscriptionInfoAsOfLMR1: SubscriptionManager.%s not found", "getSlotIndex");
            return -1;
        }
    }

    private final SubscriptionInfo C() {
        try {
            SubscriptionManager subscriptionManager = this.h;
            int i = this.f;
            SubscriptionInfo activeSubscriptionInfo = subscriptionManager.getActiveSubscriptionInfo(i);
            if (activeSubscriptionInfo == null) {
                cqbd cqbdVarC = c.c();
                cqbdVarC.I("getActiveSubscriptionInfo(): empty sub info for");
                cqbdVarC.m(i);
                cqbdVarC.r();
            }
            return activeSubscriptionInfo;
        } catch (SecurityException e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(1, TimeUnit.MINUTES);
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getActiveSubscriptionInfo", 451, "TelephonySubscriptionInfoAsOfLMR1.java")).r("TelephonySubscriptionInfoAsOfLMR1: getActiveSubscriptionInfo: no access for subId=%s", this.f);
            return null;
        } catch (Exception e2) {
            ekrd ekrdVarJ2 = c.j();
            ekrdVarJ2.V(10, TimeUnit.SECONDS);
            ((ekrd) ((ekrd) ekrdVarJ2.g(e2)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getActiveSubscriptionInfo", 457, "TelephonySubscriptionInfoAsOfLMR1.java")).r("TelephonySubscriptionInfoAsOfLMR1: getActiveSubscriptionInfo: system exception for subId=%s", this.f);
            return null;
        }
    }

    private final Object D(String str, int i) throws NoSuchMethodException, SecurityException {
        try {
            TelephonyManager telephonyManager = this.e;
            Method declaredMethod = telephonyManager.getClass().getDeclaredMethod(str, Integer.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(telephonyManager, Integer.valueOf(i));
        } catch (Exception e) {
            ekrd ekrdVarK = c.k();
            ekrdVarK.V(10, TimeUnit.SECONDS);
            ekrdVarK.X(cqnc.w, Integer.valueOf(this.f));
            ((ekrd) ((ekrd) ekrdVarK.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "invokeHiddenOnTelephonyManager", 134, "TelephonySubscriptionInfoAsOfLMR1.java")).t("TelephonySubscriptionInfoAsOfLMR1: No %s method on telephony manager", str);
            throw new NoSuchMethodException(a.a(str, "No ", " method"));
        }
    }

    private final Object E(String str, int i) {
        return D(str, B(i));
    }

    private final Object F(String str) {
        return D(str, this.f);
    }

    @Override // defpackage.crnh, defpackage.crou
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
                ((ekrd) ((ekrd) ((ekrd) d.j()).g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getNetworkMccMnc", 435, "TelephonySubscriptionInfoAsOfLMR1.java")).t("getNetworkMccMnc returned invalid string: %s", networkOperator);
                return new int[]{i, i2};
            }
        } catch (NumberFormatException e2) {
            e = e2;
            i = 0;
        }
        return new int[]{i, i2};
    }

    @Override // defpackage.crnh, defpackage.crou
    public final int a() {
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC == null) {
            return 0;
        }
        return subscriptionInfoC.getIconTint();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final int c() {
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC == null) {
            return -1;
        }
        int simSlotIndex = subscriptionInfoC.getSimSlotIndex();
        if (simSlotIndex < 0 && ((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            eksl ekslVar = (eksl) b.j();
            ekslVar.Z(eksk.FULL);
            eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getSimSlotIndex", 359, "TelephonySubscriptionInfoAsOfLMR1.java");
            Integer numValueOf = Integer.valueOf(this.f);
            Integer numValueOf2 = Integer.valueOf(simSlotIndex);
            boolean z = false;
            if (craf.b && subscriptionInfoC.isEmbedded()) {
                z = true;
            }
            ekslVar2.I("Active sub has invalid slotIndex: subId=%s, slotIndex=%s, isESIM=%s", numValueOf, numValueOf2, Boolean.valueOf(z));
        }
        return simSlotIndex;
    }

    @Override // defpackage.crnh, defpackage.crou
    public final int d() {
        try {
            return ((Integer) E("getSimState", this.f)).intValue();
        } catch (NoSuchMethodException e) {
            cqbd cqbdVarB = c.b();
            cqbdVarB.I("TelephonyManager.getSimState not found");
            cqbdVarB.s(e);
            return 0;
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final Bitmap e(Context context) {
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC == null) {
            return null;
        }
        return subscriptionInfoC.createIconBitmap(context);
    }

    @Override // defpackage.crnh, defpackage.crou
    public final Optional g() {
        return Optional.ofNullable(f().getCarrierConfigValues());
    }

    @Override // defpackage.crnh, defpackage.crou
    public final Optional h() {
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC != null) {
            String number = subscriptionInfoC.getNumber();
            return TextUtils.isEmpty(number) ? Optional.empty() : Optional.of(number);
        }
        eksl ekslVar = (eksl) b.j();
        ekslVar.V(1, TimeUnit.MINUTES);
        eksl ekslVar2 = (eksl) ekslVar.g(eiip.c());
        ekslVar2.X(cqnc.w, Integer.valueOf(this.f));
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getRawSelfNumber", 500, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: subInfo is null");
        return Optional.empty();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final CharSequence i() {
        SubscriptionInfo subscriptionInfoC = C();
        return subscriptionInfoC == null ? "" : subscriptionInfoC.getCarrierName();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final CharSequence j() {
        SubscriptionInfo subscriptionInfoC = C();
        return subscriptionInfoC == null ? "" : subscriptionInfoC.getDisplayName();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String k() {
        try {
            return ejwk.b(this.e.getDeviceId(B(this.f)));
        } catch (Exception e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.f));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getDeviceId", 221, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Missing permissions, returning empty device id");
            return "";
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String m() {
        try {
            try {
                return (String) F("getNetworkCountryIsoForSubscription");
            } catch (NoSuchMethodException unused) {
                return (String) F("getNetworkCountryIso");
            }
        } catch (NoSuchMethodException e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(1, TimeUnit.MINUTES);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.f));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getNetworkCountry", 199, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Platform does not have API to get network country");
            return "";
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String n() {
        try {
            return (String) F("getNetworkOperatorName");
        } catch (NoSuchMethodException e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(1, TimeUnit.MINUTES);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.f));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getNetworkOperatorName", 152, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Platform does not have API to get network operator");
            return null;
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String o() {
        CharSequence carrierName;
        CharSequence simCarrierIdName;
        String subscriberId;
        TelephonyManager telephonyManager = this.e;
        int i = this.f;
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC != null) {
            croe croeVar = this.g;
            String string = null;
            if (crad.b()) {
                ContentResolver contentResolver = croeVar.b.getContentResolver();
                if (contentResolver == null || !croeVar.c.k()) {
                    carrierName = null;
                    cqbd cqbdVarD = croe.a.d();
                    cqbdVarD.I("Subscription name determined as:");
                    cqbdVarD.I(carrierName);
                    cqbdVarD.A("manufacturer", Build.MANUFACTURER);
                    cqbdVarD.r();
                } else {
                    try {
                        subscriberId = telephonyManager.createForSubscriptionId(i).getSubscriberId();
                    } catch (SecurityException e) {
                        ekrd ekrdVarK = croe.a.k();
                        ekrdVarK.V(1, TimeUnit.MINUTES);
                        ((ekrd) ((ekrd) ekrdVarK.g(e)).h("com/google/android/apps/messaging/shared/util/phone/SubscriptionNameHelper", "getSubscriberId", 161, "SubscriptionNameHelper.java")).q("SubscriptionNameHelper: telephonyManagerForSubscriptionId failed to getSubscriberId");
                        subscriberId = null;
                    }
                    if (TextUtils.isEmpty(subscriberId)) {
                        croe.a.n("Subscriber ID is null. Cannot access subscription name");
                        carrierName = null;
                        cqbd cqbdVarD2 = croe.a.d();
                        cqbdVarD2.I("Subscription name determined as:");
                        cqbdVarD2.I(carrierName);
                        cqbdVarD2.A("manufacturer", Build.MANUFACTURER);
                        cqbdVarD2.r();
                    } else {
                        carrierName = Settings.Global.getString(contentResolver, "sim_card_name_".concat(String.valueOf(croe.a(subscriberId))));
                        if (TextUtils.isEmpty(carrierName)) {
                            carrierName = Settings.Global.getString(contentResolver, "sim_card_name_".concat(String.valueOf(subscriberId)));
                            cqbd cqbdVarD3 = croe.a.d();
                            cqbdVarD3.I("Non-encoded subscriber name discovered:");
                            cqbdVarD3.I(carrierName);
                            cqbdVarD3.r();
                        } else {
                            cqbd cqbdVarD4 = croe.a.d();
                            cqbdVarD4.I("Subscriber name discovered:");
                            cqbdVarD4.I(carrierName);
                            cqbdVarD4.r();
                        }
                        cqbd cqbdVarD22 = croe.a.d();
                        cqbdVarD22.I("Subscription name determined as:");
                        cqbdVarD22.I(carrierName);
                        cqbdVarD22.A("manufacturer", Build.MANUFACTURER);
                        cqbdVarD22.r();
                    }
                }
            } else {
                carrierName = null;
            }
            if (croe.c(carrierName)) {
                carrierName = subscriptionInfoC.getDisplayName();
                cqbd cqbdVarD5 = croe.a.d();
                cqbdVarD5.I("Fall back to subInfo.getDisplayName:");
                cqbdVarD5.I(carrierName);
                cqbdVarD5.r();
            }
            if (craf.b && croe.c(carrierName)) {
                if ((!craf.f || croeVar.b.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription")) && (simCarrierIdName = telephonyManager.createForSubscriptionId(i).getSimCarrierIdName()) != null) {
                    string = simCarrierIdName.toString();
                }
                cqbd cqbdVarD6 = croe.a.d();
                cqbdVarD6.I("Fall back to mvno name:");
                cqbdVarD6.I(string);
                cqbdVarD6.r();
                carrierName = string;
            }
            if (crad.d() && croe.c(carrierName)) {
                carrierName = subscriptionInfoC.getCarrierName();
                if (!TextUtils.isEmpty(carrierName)) {
                    cqbd cqbdVarD7 = croe.a.d();
                    cqbdVarD7.I("Fall back to carrier name for Samsung:");
                    cqbdVarD7.I(carrierName);
                    cqbdVarD7.r();
                    return carrierName.toString();
                }
            }
            if (croe.c(carrierName)) {
                cqbd cqbdVarD8 = croe.a.d();
                cqbdVarD8.I("Current subscription name is system default:");
                cqbdVarD8.I(carrierName);
                cqbdVarD8.r();
                carrierName = croe.b(telephonyManager, i);
            }
            if (TextUtils.isEmpty(carrierName)) {
                carrierName = subscriptionInfoC.getCarrierName();
                cqbd cqbdVarD9 = croe.a.d();
                cqbdVarD9.I("Fell back to carrier name:");
                cqbdVarD9.I(carrierName);
                cqbdVarD9.r();
            }
            if (!TextUtils.isEmpty(carrierName)) {
                return carrierName.toString();
            }
        }
        return croe.b(telephonyManager, i);
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String p() {
        SubscriptionInfo subscriptionInfoC = C();
        return subscriptionInfoC == null ? "" : subscriptionInfoC.getCountryIso();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String q() {
        try {
            try {
                return (String) F("getSimOperatorNameForSubscription");
            } catch (NoSuchMethodException unused) {
                return (String) F("getSimOperatorName");
            }
        } catch (NoSuchMethodException e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(1, TimeUnit.MINUTES);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.f));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "getSimOperatorName", 105, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: Platform does not have API to get sim operator");
            return null;
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String r() {
        return this.i.g().t(z());
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String s() {
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC != null) {
            return subscriptionInfoC.getIccId();
        }
        cqbd cqbdVarC = c.c();
        cqbdVarC.I("getSimSerialNumber: system returned empty sub info for ");
        cqbdVarC.m(this.f);
        cqbdVarC.r();
        return "";
    }

    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String u(Context context) {
        try {
            return ejwk.b((String) F("getSubscriberId"));
        } catch (NoSuchMethodException e) {
            cqbd cqbdVarB = c.b();
            cqbdVarB.I("Platform does not have API to get subscriber id");
            cqbdVarB.s(e);
            return "";
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final boolean v() {
        try {
            return ((Boolean) E("hasIccCard", this.f)).booleanValue();
        } catch (NoSuchMethodException e) {
            cqbd cqbdVarB = c.b();
            cqbdVarB.I("TelephonyManager.hasIccCard not found");
            cqbdVarB.s(e);
            return false;
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final boolean w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            TelephonyManager telephonyManager = this.e;
            Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getDataEnabled", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(telephonyManager, Integer.valueOf(this.f));
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (Exception e) {
            ekrd ekrdVarJ = c.j();
            ekrdVarJ.V(10, TimeUnit.SECONDS);
            ekrdVarJ.X(cqnc.w, Integer.valueOf(this.f));
            ((ekrd) ((ekrd) ekrdVarJ.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfLMR1", "isMobileDataEnabled", 179, "TelephonySubscriptionInfoAsOfLMR1.java")).q("TelephonySubscriptionInfoAsOfLMR1: isMobileDataEnabled: system api not found");
            return false;
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final boolean x() {
        return this.h.isNetworkRoaming(this.f);
    }

    @Override // defpackage.crnh, defpackage.crou
    public final boolean y() {
        return C() != null;
    }

    @Override // defpackage.crnh, defpackage.crou
    public final int[] z() {
        int mcc;
        int mnc;
        SubscriptionInfo subscriptionInfoC = C();
        if (subscriptionInfoC != null) {
            mcc = subscriptionInfoC.getMcc();
            mnc = subscriptionInfoC.getMnc();
        } else {
            mcc = 0;
            mnc = 0;
        }
        return new int[]{mcc, mnc};
    }
}
