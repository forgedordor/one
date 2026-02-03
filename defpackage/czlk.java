package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czlk extends cukc {
    private boolean n = false;

    public czlk() {
        x(new czlj(this));
    }

    @Override // defpackage.cukp
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MediaViewerActivity mediaViewerActivity = (MediaViewerActivity) this;
        ahhk ahhkVar = (ahhk) bb();
        ahkn ahknVar = ahhkVar.b;
        mediaViewerActivity.s = (cogw) ahknVar.cD.b();
        mediaViewerActivity.t = (cukm) ahhkVar.f.b();
        mediaViewerActivity.u = ahhkVar.h;
        mediaViewerActivity.v = (baci) ahknVar.dg.b();
        mediaViewerActivity.w = (cpch) ahknVar.a.qj.b();
        mediaViewerActivity.x = ahhkVar.i;
    }
}
