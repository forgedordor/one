package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofu implements View.OnClickListener, PopupWindow.OnDismissListener, mce, ohp {
    final /* synthetic */ ogh a;

    public ofu(ogh oghVar) {
        this.a = oghVar;
    }

    private final boolean H(mcg mcgVar) {
        Class cls;
        return (mcgVar == null || (cls = this.a.b) == null || !cls.isAssignableFrom(mcgVar.getClass())) ? false : true;
    }

    @Override // defpackage.mce
    public final void D(mcd mcdVar) throws Resources.NotFoundException {
        if (mcdVar.b(4, 5, 13)) {
            this.a.h();
        }
        if (mcdVar.b(4, 5, 7, 13)) {
            this.a.j();
        }
        if (mcdVar.b(8, 13)) {
            this.a.k();
        }
        if (mcdVar.b(9, 13)) {
            this.a.m();
        }
        if (mcdVar.b(8, 9, 11, 0, 16, 17, 13)) {
            this.a.g();
        }
        if (mcdVar.b(11, 0, 13)) {
            this.a.n();
        }
        if (mcdVar.b(12, 13)) {
            this.a.i();
        }
        if (mcdVar.b(2, 13)) {
            this.a.o();
        }
    }

    @Override // defpackage.ohp
    public final void E(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ogh oghVar = this.a;
        TextView textView = oghVar.y;
        if (textView != null) {
            textView.setText(mgb.L(oghVar.z, oghVar.A, j));
        }
        try {
            if (H(oghVar.F)) {
                Method method = oghVar.d;
                mee.f(method);
                Object objInvoke = method.invoke(oghVar.F, null);
                mee.f(objInvoke);
                if (((Boolean) objInvoke).booleanValue()) {
                    ogh oghVar2 = this.a;
                    mcg mcgVar = oghVar2.F;
                    mee.f(mcgVar);
                    oghVar2.c(mcgVar, j);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ohp
    public final void F(long j) {
        ogh oghVar = this.a;
        oghVar.I = true;
        TextView textView = oghVar.y;
        if (textView != null) {
            textView.setText(mgb.L(oghVar.z, oghVar.A, j));
        }
        oghVar.a.h();
    }

    @Override // defpackage.ohp
    public final void G(long j, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ogh oghVar = this.a;
        oghVar.I = false;
        mcg mcgVar = oghVar.F;
        if (mcgVar != null) {
            if (!z) {
                oghVar.c(mcgVar, j);
            }
            if (H(oghVar.F)) {
                try {
                    Method method = oghVar.c;
                    mee.f(method);
                    method.invoke(oghVar.F, false);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        this.a.a.i();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ogh oghVar = this.a;
        mcg mcgVar = oghVar.F;
        if (mcgVar == null) {
            return;
        }
        ohe oheVar = oghVar.a;
        oheVar.i();
        if (oghVar.m == view) {
            if (mcgVar.m(9)) {
                mcgVar.i();
                return;
            }
            return;
        }
        if (oghVar.l == view) {
            if (mcgVar.m(7)) {
                mcgVar.j();
                return;
            }
            return;
        }
        if (oghVar.o == view) {
            if (mcgVar.t() == 4 || !mcgVar.m(12)) {
                return;
            }
            mcgVar.g();
            return;
        }
        if (oghVar.p == view) {
            if (mcgVar.m(11)) {
                mcgVar.f();
                return;
            }
            return;
        }
        if (oghVar.n == view) {
            mgb.am(mcgVar, oghVar.H);
            return;
        }
        if (oghVar.q == view) {
            if (mcgVar.m(15)) {
                mcgVar.R(mfs.a(mcgVar.v(), 0));
                return;
            }
            return;
        }
        if (oghVar.r == view) {
            if (mcgVar.m(14)) {
                mcgVar.S(!mcgVar.X());
                return;
            }
            return;
        }
        View view2 = oghVar.v;
        if (view2 == view) {
            oheVar.h();
            oghVar.a(oghVar.f, view2);
            return;
        }
        View view3 = oghVar.w;
        if (view3 == view) {
            oheVar.h();
            oghVar.a(oghVar.g, view3);
            return;
        }
        View view4 = oghVar.x;
        if (view4 == view) {
            oheVar.h();
            oghVar.a(oghVar.i, view4);
            return;
        }
        ImageView imageView = oghVar.s;
        if (imageView == view) {
            oheVar.h();
            oghVar.a(oghVar.h, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ogh oghVar = this.a;
        if (oghVar.K) {
            oghVar.a.i();
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
