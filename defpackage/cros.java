package defpackage;

import android.telephony.TelephonyManager;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cros extends cub {
    final /* synthetic */ crot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cros(crot crotVar) {
        super(Alert.DURATION_SHOW_INDEFINITELY);
        this.c = crotVar;
    }

    @Override // defpackage.cub
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        crot crotVar = this.c;
        TelephonyManager telephonyManagerCreateForSubscriptionId = crotVar.b().createForSubscriptionId(iIntValue);
        if (telephonyManagerCreateForSubscriptionId != null) {
            cqbd cqbdVarC = crot.a.c();
            cqbdVarC.I("Returning per-subscription TelephonyManager (>= N)");
            cqbdVarC.m(num.intValue());
            cqbdVarC.r();
            return telephonyManagerCreateForSubscriptionId;
        }
        cqbd cqbdVarC2 = crot.a.c();
        cqbdVarC2.I("Returning default TelephonyManager (>= N)");
        cqbdVarC2.m(num.intValue());
        cqbdVarC2.r();
        return crotVar.b();
    }
}
