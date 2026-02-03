package defpackage;

import android.telephony.PhoneNumberUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cisf {
    public static final eksp a = eksp.c("BugleRcs");
    public final cisb b;

    public cisf(cisb cisbVar) {
        this.b = cisbVar;
    }

    public static String a(effi effiVar) {
        if (effiVar.b() != 1) {
            String strA = effiVar.a();
            String str = null;
            try {
                String strE = ((eblx) new ebqi(strA).e()).e();
                if (strE != null) {
                    if (PhoneNumberUtils.isGlobalPhoneNumber(strE)) {
                        str = strE;
                    }
                }
            } catch (ebml | ClassCastException e) {
                ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/groups/notify/ProcessRcsGroupNotifyScheduler", "extractPhoneNumberSipUri", 137, "ProcessRcsGroupNotifyScheduler.java")).t("Failed to parse phone number out of SIP schemed Uri: %s", cqcv.b(strA));
            }
            if (str != null) {
                return str;
            }
        }
        return effiVar.a();
    }
}
