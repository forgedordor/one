package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orc {
    public final owd a;
    public final fdjq b;
    public final oqy c;
    public final ouk d;
    private final fdjx e;
    private final ouj f;
    private final fdjq g;
    private final AtomicBoolean h;
    private final our i;

    public orc(fdjx fdjxVar, ouj oujVar, owd owdVar, fdjq fdjqVar, fdjq fdjqVar2, oqy oqyVar, our ourVar) {
        owdVar.getClass();
        this.e = fdjxVar;
        this.f = oujVar;
        this.a = owdVar;
        this.b = fdjqVar;
        this.g = fdjqVar2;
        this.c = oqyVar;
        this.i = ourVar;
        this.h = new AtomicBoolean(false);
        this.d = new oqz(this);
    }

    private final void f(orr orrVar, ovx ovxVar) {
        fdil.d(this.e, this.g, null, new orb(this, ovxVar, orrVar, null), 2);
    }

    public final void a() {
        this.h.set(true);
    }

    public final void b(orr orrVar, owb owbVar) {
        if (e()) {
            return;
        }
        if (!this.c.k(orrVar, owbVar)) {
            this.d.b(orrVar, owbVar.b.isEmpty() ? oro.a : oro.b);
            return;
        }
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 1) {
            d();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            c();
        }
    }

    public final void c() {
        our ourVar = this.i;
        Object obj = (!ourVar.e || ourVar.c > 0) ? ((owb) fcva.S(ourVar.a)).d : null;
        if (obj == null) {
            orr orrVar = orr.c;
            owb owbVar = owb.a;
            b(orrVar, owa.a());
        } else {
            ouk oukVar = this.d;
            orr orrVar2 = orr.c;
            oukVar.b(orrVar2, orn.a);
            f(orrVar2, new ovu(obj, this.f.a, true));
        }
    }

    public final void d() {
        our ourVar = this.i;
        Object obj = (!ourVar.e || ourVar.b + ourVar.d > 0) ? ((owb) fcva.N(ourVar.a)).c : null;
        if (obj == null) {
            orr orrVar = orr.b;
            owb owbVar = owb.a;
            b(orrVar, owa.a());
        } else {
            ouk oukVar = this.d;
            orr orrVar2 = orr.b;
            oukVar.b(orrVar2, orn.a);
            f(orrVar2, new ovv(obj, this.f.a, true));
        }
    }

    public final boolean e() {
        return this.h.get();
    }
}
