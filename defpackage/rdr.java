package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rdr implements rua, rti {
    public final rdx a;
    public volatile rdz b;
    public final List c;
    private volatile rte d;
    private volatile Object e;
    private final fdos f;

    public rdr(fdos fdosVar, rdx rdxVar) {
        fdosVar.getClass();
        this.f = fdosVar;
        this.a = rdxVar;
        this.c = new ArrayList();
        if (rdxVar instanceof rdv) {
            this.b = ((rdv) rdxVar).a;
        } else {
            if (!(rdxVar instanceof rdp)) {
                throw new fctg();
            }
            fdil.d(fdosVar, null, null, new rdq(this, null), 3);
        }
    }

    @Override // defpackage.rua
    public final void a(Drawable drawable) {
        this.f.b(new rdw(rea.d, drawable));
    }

    @Override // defpackage.rti
    public final boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        return false;
    }

    @Override // defpackage.rua
    public final void d(rtz rtzVar) {
        rdz rdzVar = this.b;
        if (rdzVar != null) {
            rtzVar.g(rdzVar.a, rdzVar.b);
            return;
        }
        synchronized (this) {
            rdz rdzVar2 = this.b;
            if (rdzVar2 != null) {
                rtzVar.g(rdzVar2.a, rdzVar2.b);
            } else {
                this.c.add(rtzVar);
            }
        }
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
        this.e = null;
        this.f.b(new rdw(rea.a, drawable));
    }

    @Override // defpackage.rua
    public final rte eW() {
        return this.d;
    }

    @Override // defpackage.rua
    public final void f(Drawable drawable) {
        this.e = null;
        this.f.b(new rdw(rea.b, drawable));
    }

    @Override // defpackage.rua
    public final void g(rtz rtzVar) {
        synchronized (this) {
            this.c.remove(rtzVar);
        }
    }

    @Override // defpackage.rua
    public final void h(rte rteVar) {
        this.d = rteVar;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        Object obj2 = this.e;
        rte rteVar = this.d;
        if (obj2 == null || rteVar == null || rteVar.l() || rteVar.n()) {
            return false;
        }
        this.f.b(new rdy(rea.d, obj2));
        return false;
    }

    @Override // defpackage.rua
    public final void b(Object obj, ruk rukVar) {
        this.e = obj;
        rte rteVar = this.d;
        this.f.b(new rdy((rteVar == null || !rteVar.l()) ? rea.b : rea.c, obj));
    }

    @Override // defpackage.rrx
    public final void m() {
    }

    @Override // defpackage.rrx
    public final void n() {
    }

    @Override // defpackage.rrx
    public final void o() {
    }
}
