package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dseg implements dsea {
    private final Context a;
    private final dsbr b;

    public dseg(Context context, dsbr dsbrVar) {
        this.a = context;
        this.b = dsbrVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.BATTERY;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ejwi ejwiVarJ;
        dsec dsecVar = (dsec) obj2;
        int i = ((etom) obj).d;
        if (i < 0 || i > 100) {
            this.b.d(dsecVar.a(), "Min battery percentage is not between 0 and 100", new Object[0]);
            return false;
        }
        if (i == 0) {
            return true;
        }
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            ejwiVarJ = ejud.a;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            ejwiVarJ = (intExtra < 0 || intExtra2 < 0) ? ejud.a : ejwi.j(Integer.valueOf((int) ((intExtra * 100.0d) / intExtra2)));
        }
        if (!ejwiVarJ.g()) {
            this.b.c(dsecVar.a(), "Unable to retrieve current battery percentage", new Object[0]);
            return false;
        }
        if (((Integer) ejwiVarJ.c()).intValue() >= i) {
            return true;
        }
        this.b.c(dsecVar.a(), "Battery percentage below minimum.", new Object[0]);
        return false;
    }
}
