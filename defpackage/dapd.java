package defpackage;

import com.google.android.apps.messaging.wearable.WearableSetDefaultSmsAppActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dapd extends cukc {
    private boolean n = false;

    public dapd() {
        x(new dapc(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        WearableSetDefaultSmsAppActivity wearableSetDefaultSmsAppActivity = (WearableSetDefaultSmsAppActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        wearableSetDefaultSmsAppActivity.s = (cogw) ahknVar.cD.b();
        wearableSetDefaultSmsAppActivity.t = (cukm) ahhkVar.f.b();
        wearableSetDefaultSmsAppActivity.u = ahhkVar.h;
        wearableSetDefaultSmsAppActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        wearableSetDefaultSmsAppActivity.w = (cpch) ahnhVar.qj.b();
        wearableSetDefaultSmsAppActivity.x = ahhkVar.i;
        wearableSetDefaultSmsAppActivity.n = eyie.a(ahnhVar.yw);
        wearableSetDefaultSmsAppActivity.o = ahnhVar.Uk;
        wearableSetDefaultSmsAppActivity.p = ahnhVar.Jm;
        wearableSetDefaultSmsAppActivity.q = ahknVar.t;
        wearableSetDefaultSmsAppActivity.r = ahknVar.cI;
    }
}
