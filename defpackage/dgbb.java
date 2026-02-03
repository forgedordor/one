package defpackage;

import android.os.Message;
import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dgbb extends dfna {
    final /* synthetic */ dgbn a;

    public dgbb(dgbn dgbnVar) {
        this.a = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public void b() {
        dhja.l(this.a.i, "Enter %s", a());
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public void c() {
        Object[] objArr = {a()};
        dgbn dgbnVar = this.a;
        dhja.l(dgbnVar.i, "Exit %s", objArr);
        dgbnVar.p(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public boolean e(Message message) {
        if (message.what == 101) {
            if (message.obj instanceof Runnable) {
                ((Runnable) message.obj).run();
            }
            return true;
        }
        dhja.d(this.a.i, "[%s] Unexpected event %d", a(), Integer.valueOf(message.what));
        return false;
    }
}
