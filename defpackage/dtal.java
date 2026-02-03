package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtal implements dsxa {
    private final dsvd a;
    private final dsxb b;
    private dsvd c;
    private List d;
    private boolean e = false;
    private int f = 1;

    public dtal(dsvd dsvdVar) {
        this.a = dsvdVar;
        this.b = dsvdVar.e;
    }

    private final void a(dsvd dsvdVar) {
        dsxa dsxaVar = dsvdVar.f;
        if (this.e) {
            ejwl.a(dsxaVar.o());
            dsxaVar.i();
        }
        dsxaVar.f();
    }

    @Override // defpackage.dsxa
    public final /* synthetic */ Object d() {
        return this.c;
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        dsxa dsxaVar = ((dsvd) obj).f;
        dsxaVar.k(this.a);
        ejwl.a(this.d.add(obj));
        if (this.e) {
            dsxaVar.h();
        }
    }

    @Override // defpackage.dsxa
    public final void f() {
        ejwl.p(this.c != null, "No parent override to unset: %s", this.a);
        this.c = null;
    }

    @Override // defpackage.dsxa
    public final void g() {
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((dsvd) it.next());
            }
            this.d.clear();
            this.d = null;
        }
        dsvd dsvdVar = this.c;
        if (dsvdVar != null) {
            dsvdVar.f.j(this.a);
        }
    }

    @Override // defpackage.dsxa
    public final void h() {
        ejwl.l(!this.e);
        this.e = true;
        this.b.b(this.a);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dsvd) it.next()).f.h();
            }
        }
    }

    @Override // defpackage.dsxa
    public final void i() {
        ejwl.l(this.e);
        this.e = false;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dsvd) it.next()).f.i();
            }
        }
        this.b.c(this.a);
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        ejwl.a(this.d.remove(obj));
        a((dsvd) obj);
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        obj.getClass();
        ejwl.p(this.c == null, "Already has a parent override: %s", this.a);
        this.c = (dsvd) obj;
    }

    @Override // defpackage.dsxa
    public final void l() {
        int iB = emmy.b(this.a.a().e);
        if (iB == 0) {
            iB = 1;
        }
        this.f = iB;
    }

    @Override // defpackage.dsxa
    public final void n(dswz dswzVar) {
        List list = this.d;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                dswzVar.b((dsvd) this.d.get(size));
            }
        }
    }

    @Override // defpackage.dsxa
    public final boolean o() {
        return this.e;
    }

    @Override // defpackage.dsxa
    public final boolean p() {
        return this.c == null;
    }

    @Override // defpackage.dsxa
    public final int t() {
        return this.f;
    }

    @Override // defpackage.dsxa
    public final void u(int i) {
        int i2 = this.f;
        this.f = i;
        if (!this.e || i2 == i) {
            return;
        }
        this.b.f(this.a, i2, i);
    }
}
