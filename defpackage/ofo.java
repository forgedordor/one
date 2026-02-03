package defpackage;

import android.view.View;
import androidx.media3.ui.LegacyPlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofo implements View.OnClickListener, mce, ofm {
    final /* synthetic */ LegacyPlayerView a;
    private final mcj b = new mcj();
    private Object c;

    public ofo(LegacyPlayerView legacyPlayerView) {
        this.a = legacyPlayerView;
    }

    @Override // defpackage.mce
    public final void B(mcs mcsVar) {
        LegacyPlayerView legacyPlayerView = this.a;
        mcg mcgVar = legacyPlayerView.g;
        mee.f(mcgVar);
        mcl mclVarH = mcgVar.H();
        if (mclVarH.q()) {
            this.c = null;
        } else if (mcgVar.J().a()) {
            Object obj = this.c;
            if (obj != null) {
                int iA = mclVarH.a(obj);
                if (iA != -1) {
                    if (mcgVar.aE() == mclVarH.n(iA, this.b).c) {
                        return;
                    }
                }
                this.c = null;
            }
        } else {
            mcg mcgVar2 = ((maw) mcgVar).a;
            this.c = mclVarH.d(mcgVar2.aF(), this.b, true).b;
        }
        legacyPlayerView.j(false);
    }

    @Override // defpackage.mce
    public final void C(mde mdeVar) {
        this.a.e();
    }

    @Override // defpackage.ofm
    public final void E(int i) {
        this.a.g();
    }

    @Override // defpackage.mce
    public final void d(mdw mdwVar) {
        SubtitleView subtitleView = this.a.e;
        if (subtitleView != null) {
            subtitleView.a(mdwVar.b);
        }
    }

    @Override // defpackage.mce
    public final void l(boolean z, int i) {
        LegacyPlayerView legacyPlayerView = this.a;
        legacyPlayerView.f();
        legacyPlayerView.h();
    }

    @Override // defpackage.mce
    public final void n(int i) {
        LegacyPlayerView legacyPlayerView = this.a;
        legacyPlayerView.f();
        legacyPlayerView.i();
        legacyPlayerView.h();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d();
    }

    @Override // defpackage.mce
    public final void t(mcf mcfVar, mcf mcfVar2, int i) {
        LegacyPlayerView legacyPlayerView = this.a;
        if (legacyPlayerView.k() && legacyPlayerView.j) {
            legacyPlayerView.a();
        }
    }

    @Override // defpackage.mce
    public final void u() {
        View view = this.a.c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // defpackage.mce
    public final /* synthetic */ void A(mcq mcqVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void D(mcd mcdVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void a(mac macVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void c(mcc mccVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void j(mbr mbrVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void k(mbt mbtVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void m(mca mcaVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void p(mbz mbzVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void q(mbz mbzVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void i(mbo mboVar, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void z(mcl mclVar, int i) {
    }
}
