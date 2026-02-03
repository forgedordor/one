package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmt extends hnb {
    public final Set a = new LinkedHashSet();
    public final hox b = new hpl(hxi.d, hqr.a);
    final /* synthetic */ hmw c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private Set g;

    public hmt(hmw hmwVar, long j, boolean z, boolean z2) {
        this.c = hmwVar;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.hnb
    public final long a() {
        return this.d;
    }

    @Override // defpackage.hnb
    public final hna b() {
        return this.c.f;
    }

    @Override // defpackage.hnb
    public final hov c(how howVar) {
        return this.c.b.c(howVar);
    }

    @Override // defpackage.hnb
    public final fcyh d() {
        return this.c.b.d();
    }

    @Override // defpackage.hnb
    public final void e(hnq hnqVar, fdat fdatVar) {
        this.c.b.e(hnqVar, fdatVar);
    }

    @Override // defpackage.hnb
    public final void f(how howVar) {
        this.c.b.f(howVar);
    }

    public final void g() {
        Set<hmw> set = this.a;
        if (set.isEmpty()) {
            return;
        }
        Set set2 = this.g;
        if (set2 != null) {
            for (hmw hmwVar : set) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(hmwVar.c);
                }
            }
        }
        set.clear();
    }

    @Override // defpackage.hnb
    public final void h() {
        hmw hmwVar = this.c;
        hmwVar.p--;
    }

    @Override // defpackage.hnb
    public final void i(hnq hnqVar) {
        hmw hmwVar = this.c;
        hnb hnbVar = hmwVar.b;
        hnbVar.i(hmwVar.f);
        hnbVar.i(hnqVar);
    }

    @Override // defpackage.hnb
    public final void j(how howVar, hov hovVar, hlw hlwVar) {
        this.c.b.j(howVar, hovVar, hlwVar);
    }

    @Override // defpackage.hnb
    public final void k(Set set) {
        Set hashSet = this.g;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.g = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.hnb
    public final void l(hml hmlVar) {
        this.a.add(hmlVar);
    }

    @Override // defpackage.hnb
    public final void m(hnq hnqVar) {
        this.c.b.m(hnqVar);
    }

    @Override // defpackage.hnb
    public final void n() {
        this.c.p++;
    }

    @Override // defpackage.hnb
    public final void o(hml hmlVar) {
        Set set = this.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((hmw) hmlVar).c);
            }
        }
        Set set2 = this.a;
        fdcm.f(set2);
        set2.remove(hmlVar);
    }

    @Override // defpackage.hnb
    public final void p(hnq hnqVar) {
        this.c.b.p(hnqVar);
    }

    @Override // defpackage.hnb
    public final boolean q() {
        return this.c.b.q();
    }

    @Override // defpackage.hnb
    public final boolean r() {
        return this.e;
    }

    @Override // defpackage.hnb
    public final boolean s() {
        return this.f;
    }

    @Override // defpackage.hnb
    public final hxi t() {
        return (hxi) this.b.a();
    }
}
