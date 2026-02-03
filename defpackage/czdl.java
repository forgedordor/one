package defpackage;

import android.content.Context;
import android.location.LocationManager;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.picker.LocationAttachmentPickerActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czdl extends cyvb {
    private boolean K = false;

    public czdl() {
        x(new czdk(this));
    }

    @Override // defpackage.cyve, defpackage.cukr, defpackage.cukp
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        LocationAttachmentPickerActivity locationAttachmentPickerActivity = (LocationAttachmentPickerActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        eyik eyikVar = ahknVar.cD;
        locationAttachmentPickerActivity.s = (cogw) eyikVar.b();
        locationAttachmentPickerActivity.t = (cukm) ahhkVar.f.b();
        locationAttachmentPickerActivity.u = ahhkVar.h;
        locationAttachmentPickerActivity.v = (baci) ahknVar.dg.b();
        ahnh ahnhVar = ahknVar.a;
        locationAttachmentPickerActivity.w = (cpch) ahnhVar.qj.b();
        locationAttachmentPickerActivity.x = ahhkVar.i;
        locationAttachmentPickerActivity.A = ahnhVar.Wy;
        locationAttachmentPickerActivity.B = ahnhVar.wF;
        eyik eyikVar2 = ahknVar.da;
        locationAttachmentPickerActivity.C = eyikVar2;
        locationAttachmentPickerActivity.D = ahhkVar.k;
        locationAttachmentPickerActivity.E = (eigp) ahknVar.aI.b();
        locationAttachmentPickerActivity.F = ahhkVar.f;
        ahng ahngVar = ahknVar.b;
        locationAttachmentPickerActivity.G = ahngVar.mW;
        locationAttachmentPickerActivity.J = (cogw) eyikVar.b();
        locationAttachmentPickerActivity.P = (cpch) ahnhVar.qj.b();
        locationAttachmentPickerActivity.Q = (ains) ahnhVar.c.b();
        locationAttachmentPickerActivity.R = new czec((Context) ahknVar.t.b(), (LocationManager) ahngVar.hz.b(), (crma) eyikVar2.b(), (ains) ahnhVar.c.b(), new afhs(Optional.of((crpt) ahnhVar.Hg.b()), (eosc) ahknVar.p.b(), ahngVar.nL, ahknVar.kN));
        locationAttachmentPickerActivity.U = (bwdo) ahknVar.eG.b();
        locationAttachmentPickerActivity.S = (bvur) ahknVar.dL.b();
        locationAttachmentPickerActivity.T = ahngVar.nM;
    }
}
