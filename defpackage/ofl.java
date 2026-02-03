package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofl implements View.OnClickListener, mce, ohp {
    final /* synthetic */ ofn a;

    public ofl(ofn ofnVar) {
        this.a = ofnVar;
    }

    @Override // defpackage.mce
    public final void D(mcd mcdVar) {
        if (mcdVar.b(4, 5)) {
            this.a.h();
        }
        if (mcdVar.b(4, 5, 7)) {
            this.a.i();
        }
        if (mcdVar.a(8)) {
            this.a.j();
        }
        if (mcdVar.a(9)) {
            this.a.k();
        }
        if (mcdVar.b(8, 9, 11, 0, 13)) {
            this.a.g();
        }
        if (mcdVar.b(11, 0)) {
            this.a.l();
        }
    }

    @Override // defpackage.ohp
    public final void E(long j) {
        ofn ofnVar = this.a;
        TextView textView = ofnVar.k;
        if (textView != null) {
            textView.setText(mgb.L(ofnVar.l, ofnVar.m, j));
        }
    }

    @Override // defpackage.ohp
    public final void F(long j) {
        ofn ofnVar = this.a;
        ofnVar.p = true;
        TextView textView = ofnVar.k;
        if (textView != null) {
            textView.setText(mgb.L(ofnVar.l, ofnVar.m, j));
        }
    }

    @Override // defpackage.ohp
    public final void G(long j, boolean z) {
        mcg mcgVar;
        ofn ofnVar = this.a;
        ofnVar.p = false;
        if (z || (mcgVar = ofnVar.o) == null) {
            return;
        }
        mcgVar.H();
        ((mae) ((maw) mcgVar).a).r(mcgVar.aE(), j, false);
        ofnVar.i();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ofn ofnVar = this.a;
        mcg mcgVar = ofnVar.o;
        if (mcgVar == null) {
            return;
        }
        if (ofnVar.d == view) {
            mcgVar.i();
            return;
        }
        if (ofnVar.c == view) {
            mcgVar.j();
            return;
        }
        if (ofnVar.g == view) {
            if (mcgVar.t() != 4) {
                mcgVar.g();
                return;
            }
            return;
        }
        if (ofnVar.h == view) {
            mcgVar.f();
            return;
        }
        if (ofnVar.e == view) {
            mgb.aq(mcgVar);
            return;
        }
        if (ofnVar.f == view) {
            mgb.ap(mcgVar);
            return;
        }
        if (ofnVar.i == view) {
            ((maw) mcgVar).a.R(mfs.a(mcgVar.v(), ofnVar.r));
        } else if (ofnVar.j == view) {
            ((maw) mcgVar).a.S(!mcgVar.X());
        }
    }

    @Override // defpackage.mce
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void A(mcq mcqVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void B(mcs mcsVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void C(mde mdeVar) {
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
    public final /* synthetic */ void d(mdw mdwVar) {
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
    public final /* synthetic */ void n(int i) {
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
    public final /* synthetic */ void l(boolean z, int i) {
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

    @Override // defpackage.mce
    public final /* synthetic */ void t(mcf mcfVar, mcf mcfVar2, int i) {
    }
}
