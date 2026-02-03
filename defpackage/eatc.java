package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eatc {
    public abstract void A(eatb eatbVar);

    public abstract void B(eatb eatbVar);

    public abstract void C(eatb eatbVar);

    public abstract void D(eatb eatbVar);

    @Deprecated
    public abstract void E(List list);

    @Deprecated
    public abstract void F(eatb eatbVar);

    public final eatj G() {
        eaoy eaoyVar = (eaoy) a();
        List list = eaoyVar.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ejwl.b(!TextUtils.isEmpty((String) it.next()), "Attributions must not contain null or empty values.");
            }
        }
        Integer num = eaoyVar.G;
        if (num != null) {
            ejwl.j(eknz.c(0, 4).a(num), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, num);
        }
        Double d = eaoyVar.L;
        if (d != null) {
            Double dValueOf = Double.valueOf(1.0d);
            Double dValueOf2 = Double.valueOf(5.0d);
            ejwl.j(eknz.c(dValueOf, dValueOf2).a(d), "Rating must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, d);
        }
        Integer num2 = eaoyVar.Y;
        if (num2 != null) {
            eknz eknzVar = eknz.a;
            ejwl.f(new eknz(new ekdw(0), ekdt.a).a(num2), "User Ratings Total must not be < 0, but was: %s.", num2);
        }
        if (list != null) {
            c(ekgb.n(list));
        }
        List list2 = eaoyVar.C;
        if (list2 != null) {
            m(ekgb.n(list2));
        }
        List list3 = eaoyVar.E;
        if (list3 != null) {
            n(ekgb.n(list3));
        }
        List list4 = eaoyVar.X;
        if (list4 != null) {
            E(ekgb.n(list4));
        }
        List list5 = eaoyVar.N;
        if (list5 != null) {
            s(ekgb.n(list5));
        }
        List list6 = eaoyVar.D;
        if (list6 != null) {
            r(ekgb.n(list6));
        }
        return a();
    }

    public abstract eatj a();

    public abstract void b(eatb eatbVar);

    public abstract void c(List list);

    public abstract void d(eatb eatbVar);

    public abstract void e(eatb eatbVar);

    public abstract void f(eatb eatbVar);

    public abstract void g(eatb eatbVar);

    public abstract void h(eatb eatbVar);

    public abstract void i(eatb eatbVar);

    public abstract void j(eatb eatbVar);

    public abstract void k(eatb eatbVar);

    public abstract void l(eatb eatbVar);

    public abstract void m(List list);

    public abstract void n(List list);

    public abstract void o(eatb eatbVar);

    public abstract void p(eatb eatbVar);

    public abstract void q(eatb eatbVar);

    public abstract void r(List list);

    public abstract void s(List list);

    public abstract void t(eatb eatbVar);

    public abstract void u(eatb eatbVar);

    public abstract void v(eatb eatbVar);

    public abstract void w(eatb eatbVar);

    public abstract void x(eatb eatbVar);

    public abstract void y(eatb eatbVar);

    public abstract void z(eatb eatbVar);
}
