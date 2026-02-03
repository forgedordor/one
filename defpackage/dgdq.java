package defpackage;

import android.os.Bundle;
import android.os.Message;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dgdq extends dfna {
    final /* synthetic */ dgfg a;

    public dgdq(dgfg dgfgVar) {
        this.a = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public void b() {
        dhja.l(this.a.m, "Enter %s", a());
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public void c() {
        Object[] objArr = {a()};
        dgfg dgfgVar = this.a;
        dhja.l(dgfgVar.m, "Exit %s", objArr);
        dgfgVar.p(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public boolean e(Message message) {
        int i = message.what;
        if (i == 5) {
            Bundle bundle = (Bundle) message.obj;
            Throwable th = (Throwable) bundle.getSerializable("transport_error_cause");
            dhja.r(this.a.m, "Unexpected transport error from transport %s. %s", bundle.getString("transport_id"), Objects.isNull(th) ? "" : th.getMessage());
            return false;
        }
        if (i == 7) {
            dgfg dgfgVar = this.a;
            dhja.d(dgfgVar.m, "Registration is already in progress.", new Object[0]);
            if (((Boolean) dgfg.i.a()).booleanValue()) {
                dgfgVar.N(dezf.UNKNOWN);
            }
        } else {
            if (i != 101) {
                dhja.d(this.a.m, "[%s] Unexpected event %d", a(), Integer.valueOf(message.what));
                return false;
            }
            if (message.obj instanceof Runnable) {
                ((Runnable) message.obj).run();
            }
        }
        return true;
    }

    public final int f() {
        dfyu dfyuVar = this.a.w;
        if (dfyuVar == null) {
            return 8;
        }
        return dfyuVar.c();
    }
}
