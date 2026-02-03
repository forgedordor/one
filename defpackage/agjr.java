package defpackage;

import com.google.android.apps.messaging.notifications.settings.NotificationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agjr extends aiic {
    private boolean L = false;

    public agjr() {
        x(new agjq(this));
    }

    @Override // defpackage.aiih, defpackage.cukt, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.L) {
            return;
        }
        this.L = true;
        NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        notificationSettingsActivity.s = (cogw) ahknVar.cD.b();
        notificationSettingsActivity.t = (cukm) ahhkVar.f.b();
        notificationSettingsActivity.u = ahhkVar.h;
        notificationSettingsActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        notificationSettingsActivity.w = (cpch) ahnhVar.qj.b();
        notificationSettingsActivity.x = ahhkVar.i;
        notificationSettingsActivity.A = ahnhVar.Wy;
        notificationSettingsActivity.B = ahnhVar.wF;
        notificationSettingsActivity.C = ahknVar.da;
        notificationSettingsActivity.D = ahhkVar.k;
        notificationSettingsActivity.E = (eigp) ahknVar.aI.b();
        notificationSettingsActivity.F = ahhkVar.f;
        notificationSettingsActivity.G = ahknVar.b.mW;
        notificationSettingsActivity.I = ahhkVar.c.bu;
        notificationSettingsActivity.J = ahnhVar.adO;
        notificationSettingsActivity.K = (eg) ahhkVar.g.b();
        ((aiic) notificationSettingsActivity).n = ahnhVar.adE;
    }
}
