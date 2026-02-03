package defpackage;

import com.google.android.apps.messaging.sms.storage.SmsStorageLowWarningActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ctel extends cukc {
    private boolean n = false;

    public ctel() {
        x(new ctek(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        SmsStorageLowWarningActivity smsStorageLowWarningActivity = (SmsStorageLowWarningActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        smsStorageLowWarningActivity.s = (cogw) ahknVar.cD.b();
        smsStorageLowWarningActivity.t = (cukm) ahhkVar.f.b();
        smsStorageLowWarningActivity.u = ahhkVar.h;
        smsStorageLowWarningActivity.v = (baci) ahknVar.dg.b();
        smsStorageLowWarningActivity.w = (cpch) ahknVar.a.qj.b();
        smsStorageLowWarningActivity.x = ahhkVar.i;
    }
}
