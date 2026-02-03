package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crpg extends crnh {
    private static final cqce a = cqce.g("Bugle", "TelephonySubscriptionInfoAsOfR");

    public crpg(crpf crpfVar, int i) {
        super(crpfVar.a(i));
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String t() {
        try {
            return ejwk.b(f().getSmscAddress());
        } catch (SecurityException e) {
            ekrd ekrdVarK = a.k();
            ekrdVarK.V(1, TimeUnit.MINUTES);
            ((ekrd) ((ekrd) ekrdVarK.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfR", "getSmsc", 44, "TelephonySubscriptionInfoAsOfR.java")).q("TelephonySubscriptionInfoAsOfR: Failed to get smscAddress, is Messages the default SMS app?");
            return "";
        }
    }
}
