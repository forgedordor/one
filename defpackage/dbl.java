package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbl {
    public final Object a;
    public final dcf b;
    public cyn c;
    public cyn d;
    public boolean e;
    public final iac f;
    public final fdap g;
    public final fdae h;
    private final hox i;
    private final hox j;
    private final hox k;
    private final hox l;
    private int m;

    public dbl(Object obj, dcf dcfVar) {
        this.a = obj;
        this.b = dcfVar;
        hsi hsiVar = hsi.a;
        this.i = new hpl(false, hsiVar);
        this.j = new hpl(null, hsiVar);
        this.k = new hpl(null, hsiVar);
        this.l = new hpl(0, hsiVar);
        this.f = new iac();
        this.g = new dbk(this);
        this.h = new dbj(this);
    }

    private final int m() {
        return ((Number) this.l.a()).intValue();
    }

    private final void n(cyn cynVar) {
        if (!fdbq.f(this.d, cynVar)) {
            this.c = this.d;
        }
        this.d = cynVar;
    }

    public final ddj a() {
        if (j()) {
            return (ddj) this.j.a();
        }
        return null;
    }

    public final ihu b() {
        return (ihu) this.k.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [cyn, jbf] */
    public final ihu c() {
        if (this.c == null) {
            return null;
        }
        iac iacVar = this.f;
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
            if (fdbq.f(((dbm) iacVar.get(i)).j, this.c)) {
                ?? r0 = this.c;
                if (r0 == 0 || !((icr) r0).C) {
                    return null;
                }
                dbg dbgVar = (dbg) r0;
                if (dbgVar.a) {
                    return ihv.a(dbgVar.n().i(jbg.b(r0), 0L, (6 & 4) != 0), kjh.d(jbg.b(r0).g()));
                }
                return null;
            }
        }
        return null;
    }

    public final void d() {
        Object next;
        iaq iaqVar = new iaq(this.f, 0);
        while (true) {
            if (!iaqVar.hasNext()) {
                next = null;
                break;
            } else {
                next = iaqVar.next();
                if (((dbm) next).l()) {
                    break;
                }
            }
        }
        dbm dbmVar = (dbm) next;
        if (dbmVar == null && this.d == null) {
            return;
        }
        if (fdbq.f(dbmVar != null ? dbmVar.j : null, this.d)) {
            return;
        }
        this.l.b(Integer.valueOf(this.m + 1));
    }

    public final void e(ihu ihuVar) {
        this.k.b(ihuVar);
    }

    public final void f(boolean z) {
        this.i.b(Boolean.valueOf(z));
    }

    public final void g(ddj ddjVar) {
        this.j.b(ddjVar);
    }

    public final void h() {
        boolean zK = k();
        iac iacVar = this.f;
        if (iacVar.a() > 1 && zK) {
            f(true);
        } else if (!this.b.a() || !zK) {
            f(false);
        }
        if (!iacVar.isEmpty()) {
            this.b.g(this, this.g, this.h);
        }
        d();
    }

    public final void i() {
        Object obj;
        if (m() != this.m) {
            iac iacVar = this.f;
            int iA = iacVar.a();
            int i = 0;
            while (true) {
                if (i >= iA) {
                    obj = null;
                    break;
                }
                obj = iacVar.get(i);
                if (((dbm) obj).l()) {
                    break;
                } else {
                    i++;
                }
            }
            dbm dbmVar = (dbm) obj;
            if (dbmVar == null) {
                dbmVar = (dbm) fcva.P(iacVar);
            }
            cyn cynVar = dbmVar != null ? dbmVar.j : null;
            if (!fdbq.f(cynVar, this.d)) {
                this.c = this.d;
                n(cynVar);
                this.e = true;
            }
            if (cynVar == null) {
                n(null);
            }
            this.m = m();
        }
    }

    public final boolean j() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        iac iacVar = this.f;
        int iA = iacVar.a();
        for (int i = 0; i < iA; i++) {
            if (((dbm) iacVar.get(i)).c().e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        iac iacVar = this.f;
        int iA = iacVar.a();
        int i = 0;
        while (true) {
            if (i >= iA) {
                break;
            }
            dhk dhkVar = ((dbm) iacVar.get(i)).c().b;
            while (true) {
                dhk dhkVar2 = dhkVar.a;
                if (dhkVar2 == null) {
                    break;
                }
                dhkVar = dhkVar2;
            }
            if (fdbq.f(dhkVar.e(), dhkVar.f())) {
                i++;
            } else if (j()) {
                return true;
            }
        }
        return false;
    }
}
