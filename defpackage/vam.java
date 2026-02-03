package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vam implements val {
    private final vao a;
    private final fcsu b;
    private int c;
    private int d;
    private int j;
    private int k;
    private CharSequence l;
    private boolean m;
    private ento n;
    private boolean r;
    private int s;
    private List e = new ArrayList();
    private List f = new ArrayList();
    private List g = new ArrayList();
    private List h = new ArrayList();
    private List i = new ArrayList();
    private List o = new ArrayList();
    private List p = new ArrayList();
    private boolean q = true;

    public vam(vao vaoVar, fcsu fcsuVar) {
        this.a = vaoVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.val
    public final ensy a() {
        ensy ensyVar = (ensy) enta.a.createBuilder();
        int i = this.c;
        ensyVar.copyOnWrite();
        enta entaVar = (enta) ensyVar.instance;
        entaVar.b |= 1;
        entaVar.c = i;
        int i2 = this.d;
        ensyVar.copyOnWrite();
        enta entaVar2 = (enta) ensyVar.instance;
        entaVar2.b |= 2;
        entaVar2.d = i2;
        List list = this.e;
        ensyVar.copyOnWrite();
        enta entaVar3 = (enta) ensyVar.instance;
        evsx evsxVar = entaVar3.j;
        if (!evsxVar.c()) {
            entaVar3.j = evsn.mutableCopy(evsxVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            entaVar3.j.h(((ento) it.next()).i);
        }
        List list2 = this.f;
        ensyVar.copyOnWrite();
        enta entaVar4 = (enta) ensyVar.instance;
        evsx evsxVar2 = entaVar4.i;
        if (!evsxVar2.c()) {
            entaVar4.i = evsn.mutableCopy(evsxVar2);
        }
        evpz.addAll(list2, entaVar4.i);
        List list3 = this.g;
        ensyVar.copyOnWrite();
        enta entaVar5 = (enta) ensyVar.instance;
        evsx evsxVar3 = entaVar5.k;
        if (!evsxVar3.c()) {
            entaVar5.k = evsn.mutableCopy(evsxVar3);
        }
        evpz.addAll(list3, entaVar5.k);
        List list4 = this.h;
        ensyVar.copyOnWrite();
        enta entaVar6 = (enta) ensyVar.instance;
        evsr evsrVar = entaVar6.l;
        if (!evsrVar.c()) {
            entaVar6.l = evsn.mutableCopy(evsrVar);
        }
        evpz.addAll(list4, entaVar6.l);
        List list5 = this.i;
        ensyVar.copyOnWrite();
        enta entaVar7 = (enta) ensyVar.instance;
        evsr evsrVar2 = entaVar7.m;
        if (!evsrVar2.c()) {
            entaVar7.m = evsn.mutableCopy(evsrVar2);
        }
        evpz.addAll(list5, entaVar7.m);
        int i3 = this.j;
        ensyVar.copyOnWrite();
        enta entaVar8 = (enta) ensyVar.instance;
        entaVar8.b |= 4;
        entaVar8.e = i3;
        int i4 = this.k;
        ensyVar.copyOnWrite();
        enta entaVar9 = (enta) ensyVar.instance;
        entaVar9.b |= 8;
        entaVar9.f = i4;
        boolean z = this.m;
        ensyVar.copyOnWrite();
        enta entaVar10 = (enta) ensyVar.instance;
        entaVar10.b |= 16;
        entaVar10.g = z;
        int i5 = this.s;
        if (i5 != 0) {
            ensyVar.copyOnWrite();
            enta entaVar11 = (enta) ensyVar.instance;
            entaVar11.o = i5 - 1;
            entaVar11.b |= 128;
        }
        ento entoVar = this.n;
        if (entoVar != null) {
            ensyVar.copyOnWrite();
            enta entaVar12 = (enta) ensyVar.instance;
            entaVar12.h = entoVar.i;
            entaVar12.b |= 32;
        }
        List list6 = this.o;
        ensyVar.copyOnWrite();
        enta entaVar13 = (enta) ensyVar.instance;
        evsx evsxVar4 = entaVar13.q;
        if (!evsxVar4.c()) {
            entaVar13.q = evsn.mutableCopy(evsxVar4);
        }
        Iterator it2 = list6.iterator();
        while (it2.hasNext()) {
            entaVar13.q.h(((ensv) it2.next()).m);
        }
        List list7 = this.p;
        ensyVar.copyOnWrite();
        enta entaVar14 = (enta) ensyVar.instance;
        evsx evsxVar5 = entaVar14.r;
        if (!evsxVar5.c()) {
            entaVar14.r = evsn.mutableCopy(evsxVar5);
        }
        evpz.addAll(list7, entaVar14.r);
        return ensyVar;
    }

    @Override // defpackage.val
    public final void b(Throwable th) {
        th.getClass();
        if (this.r) {
            List list = this.o;
            list.add(vaf.a(th));
            this.p.add(Integer.valueOf(this.c + this.d));
        }
    }

    @Override // defpackage.val
    public final void c() {
        if (!this.r || this.i.isEmpty()) {
            return;
        }
        this.i.set(r0.size() - 1, true);
    }

    @Override // defpackage.val
    public final void d(epiv epivVar, int i) {
        if (this.r) {
            this.e.add(this.a.b.get(epivVar));
            if (this.d == 0 || !this.q) {
                i = 0;
            }
            this.g.add(Integer.valueOf(i));
            this.q = true;
            this.i.add(false);
        }
    }

    @Override // defpackage.val
    public final void e() {
        if (!this.r || this.h.isEmpty()) {
            return;
        }
        this.h.set(r0.size() - 1, true);
    }

    @Override // defpackage.val
    public final void f(int i) {
        if (this.r) {
            if (this.c == 0 || !this.q) {
                i = 0;
            }
            this.f.add(Integer.valueOf(i));
            this.q = true;
            this.h.add(false);
        }
    }

    @Override // defpackage.val
    public final void g() {
        if (this.r) {
            this.d++;
            this.q = true;
            this.s = 0;
        }
    }

    @Override // defpackage.val
    public final void h(epiv epivVar, CharSequence charSequence) {
        if (this.r) {
            this.k++;
            this.n = (ento) this.a.b.get(epivVar);
            this.l = charSequence;
            this.m = false;
        }
    }

    @Override // defpackage.val
    public final void i() {
        this.c = 0;
        this.d = 0;
        this.s = 0;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = 0;
        this.k = 0;
        this.m = false;
        this.l = null;
        this.n = null;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
    }

    @Override // defpackage.val
    public final void j(boolean z) {
        this.r = z;
    }

    @Override // defpackage.val
    public final void k() {
        if (this.r) {
            this.q = false;
        }
    }

    @Override // defpackage.val
    public final void l() {
        if (this.r) {
            this.c++;
            this.n = null;
        }
    }

    @Override // defpackage.val
    public final void m(CharSequence charSequence) {
        charSequence.getClass();
        if (this.r) {
            this.j++;
            this.l = charSequence;
            this.m = false;
        }
    }

    @Override // defpackage.val
    public final void n(CharSequence charSequence) {
        if (this.r) {
            if (charSequence.length() == 0) {
                i();
                return;
            }
            CharSequence charSequence2 = this.l;
            boolean z = false;
            if (charSequence2 != null && !TextUtils.equals(charSequence, charSequence2)) {
                z = true;
            }
            this.m = z;
        }
    }

    @Override // defpackage.val
    public final boolean o() {
        return this.r;
    }

    @Override // defpackage.val
    public final void p(int i) {
        if (this.r) {
            this.s = i;
        }
    }
}
