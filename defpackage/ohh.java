package defpackage;

import android.view.View;
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohh implements View.OnClickListener, mce, ogg {
    final /* synthetic */ ohi a;
    private final mcj b = new mcj();
    private Object c;

    public ohh(ohi ohiVar) {
        this.a = ohiVar;
    }

    @Override // defpackage.mce
    public final void B(mcs mcsVar) {
        ohi ohiVar = this.a;
        mcg mcgVar = ohiVar.l;
        mee.f(mcgVar);
        mcl mclVarH = mcgVar.m(17) ? mcgVar.H() : mcl.a;
        if (mclVarH.q()) {
            this.c = null;
        } else if (!mcgVar.m(30) || mcgVar.J().a()) {
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
            this.c = mclVarH.d(mcgVar.aF(), this.b, true).b;
        }
        ohiVar.m(false);
    }

    @Override // defpackage.mce
    public final void C(mde mdeVar) {
        ohi ohiVar;
        mcg mcgVar;
        if (mdeVar.equals(mde.a) || (mcgVar = (ohiVar = this.a).l) == null || mcgVar.t() == 1) {
            return;
        }
        ohiVar.h();
    }

    @Override // defpackage.ogg
    public final void E() {
        this.a.j();
    }

    @Override // defpackage.mce
    public final void d(mdw mdwVar) {
        SubtitleView subtitleView = this.a.f;
        if (subtitleView != null) {
            subtitleView.a(mdwVar.b);
        }
    }

    @Override // defpackage.mce
    public final void l(boolean z, int i) {
        ohi ohiVar = this.a;
        ohiVar.i();
        ohiVar.k();
    }

    @Override // defpackage.mce
    public final void n(int i) {
        ohi ohiVar = this.a;
        ohiVar.i();
        ohiVar.l();
        ohiVar.k();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g();
    }

    @Override // defpackage.mce
    public final void t(mcf mcfVar, mcf mcfVar2, int i) {
        ohi ohiVar = this.a;
        if (ohiVar.q() && ohiVar.n) {
            ohiVar.c();
        }
    }

    @Override // defpackage.mce
    public final void u() {
        ohi ohiVar = this.a;
        View view = ohiVar.c;
        if (view != null) {
            view.setVisibility(4);
            if (ohiVar.o()) {
                ohiVar.d();
            } else {
                ohiVar.b();
            }
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
    public final void y(int i, int i2) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void z(mcl mclVar, int i) {
    }
}
