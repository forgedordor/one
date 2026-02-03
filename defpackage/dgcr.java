package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgcr implements dfyl {
    final /* synthetic */ dgcs a;

    public dgcr(dgcs dgcsVar) {
        this.a = dgcsVar;
    }

    @Override // defpackage.dfyl
    public final void onConnectivityChange(Context context, int i) {
        NetworkInfo networkInfoD;
        try {
            networkInfoD = dhkq.f(context).d();
        } catch (dhkf e) {
            dhja.s(e, "Can't get active network info. Missing permissions.", new Object[0]);
            networkInfoD = null;
        }
        dgcs dgcsVar = this.a;
        dhja.d(dgcsVar.a, "RegistrationEngine received connectivity change event. state=%d, NetworkInfo=%s", Integer.valueOf(i), networkInfoD);
        dgfg dgfgVar = dgcsVar.c;
        if (dgfgVar != null) {
            Message messageC = dgfgVar.c(4, i, -1, networkInfoD);
            dfnn dfnnVar = dgfgVar.b;
            if (dfnnVar == null) {
                return;
            }
            dfnnVar.sendMessage(messageC);
        }
    }

    @Override // defpackage.dfyl
    public final boolean shouldTriggerOnCapabilitiesChanged() {
        return true;
    }
}
