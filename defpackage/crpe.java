package defpackage;

import android.content.Context;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crpe extends crnh {
    private static final cqce a = cqce.g("Bugle", "TelephonySubscriptionInfoAsOfQ");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ");
    private final int c;
    private final TelephonyManager d;
    private final SubscriptionManager e;

    /* JADX WARN: Illegal instructions before constructor call */
    public crpe(crpd crpdVar, crot crotVar, Context context, int i) {
        crpb crpbVar = (crpb) crpdVar.a.b();
        crpbVar.getClass();
        crot crotVar2 = (crot) crpdVar.b.b();
        crotVar2.getClass();
        super(new crpc(crpbVar, crotVar2, i));
        this.d = crotVar.a(i);
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        this.e = subscriptionManager == null ? (SubscriptionManager) context.getSystemService(SubscriptionManager.class) : subscriptionManager;
        this.c = i;
    }

    @Override // defpackage.crnh, defpackage.crou
    public final int d() {
        return this.d.getSimState();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String k() {
        try {
            int i = this.c;
            int slotIndex = SubscriptionManager.getSlotIndex(i);
            if (slotIndex == -1) {
                ekrd ekrdVarK = a.k();
                ekrdVarK.V(1, TimeUnit.MINUTES);
                ((ekrd) ((ekrd) ekrdVarK.g(eiip.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getDeviceId", 100, "TelephonySubscriptionInfoAsOfQ.java")).r("TelephonySubscriptionInfoAsOfQ: Invalid slot index, returning empty id for subId: %d", i);
                return "";
            }
            String strB = ejwk.b(this.d.getDeviceId(slotIndex));
            if (strB.isEmpty()) {
                ekrd ekrdVarK2 = a.k();
                ekrdVarK2.V(1, TimeUnit.MINUTES);
                ekrdVarK2.X(cqnc.w, Integer.valueOf(i));
                ((ekrd) ((ekrd) ekrdVarK2.g(eiip.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getDeviceId", 113, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: deviceId is empty. Does TelephonyManager have necessary permissions?");
            }
            return strB;
        } catch (SecurityException e) {
            ekrd ekrdVarK3 = a.k();
            ekrdVarK3.V(1, TimeUnit.MINUTES);
            ekrdVarK3.X(cqnc.w, Integer.valueOf(this.c));
            ((ekrd) ((ekrd) ekrdVarK3.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getDeviceId", 123, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: failed to get deviceId, is Messages the default SMS app?");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    @Override // defpackage.crnh, defpackage.crou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l() {
        /*
            r9 = this;
            java.lang.String r0 = "getActiveSubscriptionInfo"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ"
            java.lang.String r2 = "TelephonySubscriptionInfoAsOfQ.java"
            r3 = 0
            android.telephony.SubscriptionManager r4 = r9.e     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            int r5 = r9.c     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            android.telephony.SubscriptionInfo r4 = r4.getActiveSubscriptionInfo(r5)     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            if (r4 != 0) goto L7b
            ekrg r6 = defpackage.crpe.b     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            ekrw r6 = r6.h()     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            r7 = 263(0x107, float:3.69E-43)
            ekrw r6 = r6.h(r1, r0, r7, r2)     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            java.lang.String r7 = "getActiveSubscriptionInfo(): empty sub info for %s."
            r6.r(r7, r5)     // Catch: java.lang.RuntimeException -> L27 java.lang.SecurityException -> L54
            goto L7b
        L27:
            r4 = move-exception
            cqce r5 = defpackage.crpe.a
            ekrd r5 = r5.k()
            r6 = 10
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r5.V(r6, r7)
            int r6 = r9.c
            ekrz r7 = defpackage.cqnc.w
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.X(r7, r8)
            ekrw r4 = r5.g(r4)
            ekrd r4 = (defpackage.ekrd) r4
            r5 = 275(0x113, float:3.85E-43)
            ekrw r0 = r4.h(r1, r0, r5, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "TelephonySubscriptionInfoAsOfQ: getActiveSubscriptionInfo: system exception for %s."
            r0.r(r1, r6)
            goto L7a
        L54:
            r4 = move-exception
            cqce r5 = defpackage.crpe.a
            ekrd r5 = r5.k()
            r6 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MINUTES
            r5.V(r6, r7)
            java.lang.RuntimeException r4 = defpackage.eiip.b(r4)
            ekrw r4 = r5.g(r4)
            ekrd r4 = (defpackage.ekrd) r4
            r5 = 268(0x10c, float:3.76E-43)
            ekrw r0 = r4.h(r1, r0, r5, r2)
            ekrd r0 = (defpackage.ekrd) r0
            int r1 = r9.c
            java.lang.String r2 = "TelephonySubscriptionInfoAsOfQ: getActiveSubscriptionInfo: no access %s."
            r0.r(r2, r1)
        L7a:
            r4 = r3
        L7b:
            if (r4 != 0) goto L7e
            goto L89
        L7e:
            android.os.ParcelUuid r0 = defpackage.abo$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.toString()
            return r0
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crpe.l():java.lang.String");
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String m() {
        return this.d.getNetworkCountryIso();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String n() {
        return this.d.getNetworkOperatorName();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String u(Context context) {
        try {
            String strB = ejwk.b(this.d.getSubscriberId());
            if (strB.isEmpty()) {
                ekrd ekrdVarK = a.k();
                ekrdVarK.V(1, TimeUnit.MINUTES);
                ekrdVarK.X(cqnc.w, Integer.valueOf(this.c));
                ((ekrd) ((ekrd) ekrdVarK.g(eiip.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getSubscriberId", 145, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: subscriberId is empty. Does TelephonyManager have necessary permissions?");
            }
            return strB;
        } catch (SecurityException e) {
            ekrd ekrdVarK2 = a.k();
            ekrdVarK2.V(1, TimeUnit.MINUTES);
            ekrdVarK2.X(cqnc.w, Integer.valueOf(this.c));
            ((ekrd) ((ekrd) ekrdVarK2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfQ", "getSubscriberId", 155, "TelephonySubscriptionInfoAsOfQ.java")).q("TelephonySubscriptionInfoAsOfQ: failed to get subscriberId, is Messages the default SMS app?");
            return "";
        }
    }

    @Override // defpackage.crnh, defpackage.crou
    public final boolean v() {
        return this.d.hasIccCard();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final boolean w() {
        return this.d.isDataEnabled();
    }
}
