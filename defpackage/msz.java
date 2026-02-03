package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msz {
    public final msy d;
    public final mtu g;
    public final mew h;
    public boolean i;
    public min j;
    private final mwx l;
    public ngf k = new ngf();
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();
    public final HashMap e = new HashMap();
    public final Set f = new HashSet();

    public msz(msy msyVar, mtu mtuVar, mew mewVar, mwx mwxVar) {
        this.l = mwxVar;
        this.d = msyVar;
        this.g = mtuVar;
        this.h = mewVar;
    }

    private final void h(int i, int i2) {
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((msx) list.get(i)).d += i2;
            i++;
        }
    }

    private final void i(msx msxVar) {
        msw mswVar = (msw) this.e.get(msxVar);
        if (mswVar != null) {
            mswVar.a.f(mswVar.b);
        }
    }

    private final void j(msx msxVar) {
        if (msxVar.e && msxVar.c.isEmpty()) {
            msw mswVar = (msw) this.e.remove(msxVar);
            mee.f(mswVar);
            nep nepVar = mswVar.a;
            nepVar.m(mswVar.b);
            msv msvVar = mswVar.c;
            nepVar.p(msvVar);
            nepVar.o(msvVar);
            this.f.remove(msxVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final mcl b() {
        List list = this.a;
        if (list.isEmpty()) {
            return mcl.a;
        }
        int iC = 0;
        for (int i = 0; i < list.size(); i++) {
            msx msxVar = (msx) list.get(i);
            msxVar.d = iC;
            iC += msxVar.a.d.c();
        }
        return new mtg(list, this.k);
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            msx msxVar = (msx) it.next();
            if (msxVar.c.isEmpty()) {
                i(msxVar);
                it.remove();
            }
        }
    }

    public final void d(msx msxVar) {
        nei neiVar = msxVar.a;
        neo neoVar = new neo() { // from class: msk
            @Override // defpackage.neo
            public final void a(nep nepVar, mcl mclVar) {
                mew mewVar = ((mry) this.a.d).e;
                mewVar.a(2);
                mewVar.j(22);
            }
        };
        msv msvVar = new msv(this, msxVar);
        this.e.put(msxVar, new msw(neiVar, neoVar, msvVar));
        neiVar.e(mgb.F(), msvVar);
        neiVar.d(mgb.F(), msvVar);
        neiVar.j(neoVar, this.j, this.l);
    }

    public final void e(nel nelVar) {
        IdentityHashMap identityHashMap = this.b;
        msx msxVar = (msx) identityHashMap.remove(nelVar);
        mee.f(msxVar);
        msxVar.a.v(nelVar);
        msxVar.c.remove(((nef) nelVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        j(msxVar);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            msx msxVar = (msx) this.a.remove(i2);
            this.c.remove(msxVar.b);
            h(i2, -msxVar.a.d.c());
            msxVar.e = true;
            if (this.i) {
                j(msxVar);
            }
        }
    }

    public final mcl g(int i, List list, ngf ngfVar) {
        if (!list.isEmpty()) {
            this.k = ngfVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                msx msxVar = (msx) list.get(i2 - i);
                if (i2 > 0) {
                    msx msxVar2 = (msx) this.a.get(i2 - 1);
                    msxVar.c(msxVar2.d + msxVar2.a.d.c());
                } else {
                    msxVar.c(0);
                }
                h(i2, msxVar.a.d.c());
                this.a.add(i2, msxVar);
                this.c.put(msxVar.b, msxVar);
                if (this.i) {
                    d(msxVar);
                    if (this.b.isEmpty()) {
                        this.f.add(msxVar);
                    } else {
                        i(msxVar);
                    }
                }
            }
        }
        return b();
    }
}
