package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.telephony.CarrierConfigManager;
import android.telephony.TelephonyManager;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crpa extends crnh {
    private static final cqce a = cqce.g("Bugle", "TelephonySubscriptionInfoAsOfM");
    private final CarrierConfigManager b;
    private final TelephonyManager c;
    private final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public crpa(croy croyVar, crot crotVar, Context context, int i) {
        crow crowVar = (crow) croyVar.a.b();
        crowVar.getClass();
        croe croeVar = (croe) croyVar.b.b();
        croeVar.getClass();
        crny crnyVar = (crny) croyVar.c.b();
        crnyVar.getClass();
        crot crotVar2 = (crot) croyVar.d.b();
        crotVar2.getClass();
        Context context2 = (Context) croyVar.e.b();
        context2.getClass();
        super(new crox(crowVar, croeVar, crnyVar, crotVar2, context2, i));
        this.c = crotVar.a(i);
        CarrierConfigManager carrierConfigManager = (CarrierConfigManager) context.getSystemService(CarrierConfigManager.class);
        carrierConfigManager.getClass();
        this.b = carrierConfigManager;
        this.d = i;
    }

    @Override // defpackage.crnh, defpackage.crou
    public final Optional g() {
        return Optional.ofNullable(this.b.getConfigForSubId(this.d)).map(new Function() { // from class: croz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Bundle((PersistableBundle) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String q() {
        return this.c.getSimOperatorName();
    }

    @Override // defpackage.crnh, defpackage.crou
    public final String u(Context context) {
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            ekrd ekrdVarK = a.k();
            ekrdVarK.V(1, TimeUnit.MINUTES);
            ekrdVarK.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarK.g(eiip.c())).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfM", "getSubscriberId", 64, "TelephonySubscriptionInfoAsOfM.java")).q("TelephonySubscriptionInfoAsOfM: Missing permissions, returning empty subscriber id");
            return "";
        }
        try {
            return ejwk.b(this.c.getSubscriberId());
        } catch (SecurityException e) {
            ekrd ekrdVarK2 = a.k();
            ekrdVarK2.V(1, TimeUnit.MINUTES);
            ekrdVarK2.X(cqnc.w, Integer.valueOf(this.d));
            ((ekrd) ((ekrd) ekrdVarK2.g(e)).h("com/google/android/apps/messaging/shared/util/phone/TelephonySubscriptionInfoAsOfM", "getSubscriberId", 77, "TelephonySubscriptionInfoAsOfM.java")).q("TelephonySubscriptionInfoAsOfM: failed to get subscriberId, is Messages the default SMS app?");
            return "";
        }
    }
}
