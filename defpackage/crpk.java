package defpackage;

import android.content.Context;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crpk extends crnh {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT");
    private final SubscriptionManager b;
    private final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public crpk(crpj crpjVar, Context context, int i) {
        crph crphVar = (crph) crpjVar.a.b();
        crphVar.getClass();
        ((crny) crpjVar.b.b()).getClass();
        crot crotVar = (crot) crpjVar.c.b();
        crotVar.getClass();
        super(new crpi(crphVar, crotVar, i));
        this.c = i;
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        this.b = subscriptionManager == null ? (SubscriptionManager) context.getSystemService(SubscriptionManager.class) : subscriptionManager;
    }

    @Override // defpackage.crnh, defpackage.crou
    public final Optional h() {
        try {
            SubscriptionManager subscriptionManager = this.b;
            int i = this.c;
            String phoneNumber = subscriptionManager.getPhoneNumber(i);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.w, Integer.valueOf(i));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT", "getRawSelfNumber", 50, "TelephonySubscriptionInfoAsOfT.java")).t("getRawTelephonyPhoneNumber %s", cqcv.b(phoneNumber));
            if (!TextUtils.isEmpty(phoneNumber)) {
                return Optional.of(phoneNumber);
            }
        } catch (IllegalStateException | SecurityException e) {
            ekrg ekrgVar = a;
            ekrw ekrwVarJ = ekrgVar.j();
            ekrz ekrzVar = eksq.a;
            ekrwVarJ.X(ekrzVar, "Bugle");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
            ekrdVar2.V(1, TimeUnit.MINUTES);
            ekrd ekrdVar3 = (ekrd) ekrdVar2.g(e);
            ekrdVar3.X(cqnc.w, Integer.valueOf(this.c));
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT", "getRawSelfNumber", 60, "TelephonySubscriptionInfoAsOfT.java")).q("TelephonySubscriptionInfoAsOfT: getRawSelfNumber failed");
            if (e instanceof SecurityException) {
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfT", "getRawSelfNumber", 64, "TelephonySubscriptionInfoAsOfT.java")).q("TelephonySubscriptionInfoAsOfT: getRawSelfNumber fallback to super");
                return super.h();
            }
        }
        return Optional.empty();
    }
}
