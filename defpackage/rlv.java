package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rlv implements rfg, rff {
    private final List a;
    private final lcd b;
    private int c;
    private rbh d;
    private rff e;
    private List f;
    private boolean g;

    public rlv(List list, lcd lcdVar) {
        this.b = lcdVar;
        rvi.d(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            g(this.d, this.e);
        } else {
            rvi.f(this.f);
            this.e.f(new rhs("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.rfg
    public final Class a() {
        return ((rfg) this.a.get(0)).a();
    }

    @Override // defpackage.rff
    public final void c(Object obj) {
        if (obj != null) {
            this.e.c(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.rfg
    public final void d() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rfg) it.next()).d();
        }
    }

    @Override // defpackage.rfg
    public final void e() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rfg) it.next()).e();
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return ((rfg) this.a.get(0)).eX();
    }

    @Override // defpackage.rff
    public final void f(Exception exc) {
        List list = this.f;
        rvi.f(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        this.d = rbhVar;
        this.e = rffVar;
        this.f = (List) this.b.a();
        ((rfg) this.a.get(this.c)).g(rbhVar, this);
        if (this.g) {
            d();
        }
    }
}
