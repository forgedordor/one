package defpackage;

import android.telephony.ims.RcsUceAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgay implements RcsUceAdapter.OnPublishStateChangedListener {
    private final dgbn a;

    public dgay(dgbn dgbnVar) {
        this.a = dgbnVar;
    }

    public final void onPublishStateChange(int i) {
        switch (i) {
            case 1:
                dgbn dgbnVar = this.a;
                dhja.l(dgbnVar.i, "Received 200 OK PUBLISH response", new Object[0]);
                dgbnVar.q(9);
                break;
            case 2:
                dhja.l(this.a.i, "Has not received any PUBLISH response yet.", new Object[0]);
                break;
            case 3:
                dhja.r(this.a.i, "The device has tried to publish its capabilities (VoLTE), which resulted in an error.", new Object[0]);
                break;
            case 4:
            case 6:
                dgbn dgbnVar2 = this.a;
                dhja.r(dgbnVar2.i, "The device has tried to publish its capabilities (RCS), which resulted in  error code:[%d]", Integer.valueOf(i));
                dgbnVar2.q(10);
                break;
            case 5:
                dgbn dgbnVar3 = this.a;
                dhja.r(dgbnVar3.i, "The last publish resulted in 408 Request Timeout response.", new Object[0]);
                dgbnVar3.q(10);
                break;
            default:
                dhja.r(this.a.i, "Unknown publish state change, code:[%d]", Integer.valueOf(i));
                break;
        }
    }
}
