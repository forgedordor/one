package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agv {
    public css a;
    public csq b;
    public csq c;
    public csq d;
    public csq e;
    public boolean f;
    public int g;
    private css h;
    private csq i;
    private boolean j;

    public agv() {
        this.a = new css();
        this.h = new css();
        this.i = new csq();
        this.b = new csq();
        this.c = new csq();
        this.d = new csq();
        this.e = new csq();
        this.f = false;
        this.g = 1;
        this.j = false;
    }

    public final agw a() {
        css cssVar = new css(this.h);
        cssVar.addAll(this.i.keySet());
        cssVar.addAll(this.b.keySet());
        cssVar.addAll(this.c.keySet());
        cssVar.addAll(this.d.keySet());
        csr csrVar = new csr(this.a);
        while (csrVar.hasNext()) {
            cssVar.remove(((afo) csrVar.next()).a);
        }
        if (!cssVar.isEmpty()) {
            throw new IllegalArgumentException(a.h(cssVar, "Schema types ", " referenced, but were not added."));
        }
        if (this.a.isEmpty() && this.g != 1) {
            throw new IllegalArgumentException("Cannot set version to the request if schema is empty.");
        }
        this.j = true;
        return new agw(this.a, this.h, this.i, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b() {
        if (this.j) {
            csq csqVar = new csq(this.i.d);
            for (Map.Entry entry : this.i.entrySet()) {
                csqVar.put((String) entry.getKey(), new css((Collection) entry.getValue()));
            }
            this.i = csqVar;
            this.c = new csq(this.c);
            this.b = agw.a(this.b);
            csq csqVar2 = new csq(this.d.d);
            for (Map.Entry entry2 : this.d.entrySet()) {
                csqVar2.put((String) entry2.getKey(), new css((Collection) entry2.getValue()));
            }
            this.d = csqVar2;
            this.a = new css(this.a);
            this.h = new css(this.h);
            this.e = new csq(this.e);
            this.j = false;
        }
    }

    public final void c(Collection collection) {
        lcg.i(collection);
        b();
        this.a.addAll(collection);
    }

    public final void d(String str) {
        b();
        this.h.add(str);
    }

    public final void e(String str, agd agdVar) {
        lcg.i(agdVar);
        b();
        Set cssVar = (Set) this.i.get(str);
        if (cssVar == null) {
            cssVar = new css();
        }
        cssVar.add(agdVar);
        this.i.put(str, cssVar);
    }

    public final void f(afo... afoVarArr) {
        b();
        c(Arrays.asList(afoVarArr));
    }

    public final void g(Class cls) {
        b();
        d(afr.b().a(cls).d());
    }

    public agv(agw agwVar) {
        this.a = new css();
        this.h = new css();
        this.i = new csq();
        this.b = new csq();
        this.c = new csq();
        this.d = new csq();
        this.e = new csq();
        this.f = false;
        this.g = 1;
        this.j = false;
        this.a.addAll(agwVar.a);
        this.h.addAll(agwVar.b);
        for (Map.Entry entry : agwVar.c.entrySet()) {
            this.i.put((String) entry.getKey(), new css((Collection) entry.getValue()));
        }
        this.b = agw.a(agwVar.d);
        this.c.putAll(agwVar.e);
        for (Map.Entry entry2 : agwVar.f.entrySet()) {
            this.d.put((String) entry2.getKey(), new css((Collection) entry2.getValue()));
        }
        this.e.putAll(agwVar.g);
        this.f = agwVar.h;
        this.g = agwVar.i;
    }
}
