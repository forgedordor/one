package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgom extends fgnp {
    private static final long serialVersionUID = -1079258847191166848L;

    private fgom(fgmq fgmqVar, fgmz fgmzVar) {
        super(fgmqVar, fgmzVar);
    }

    public static fgom N(fgmq fgmqVar, fgmz fgmzVar) {
        if (fgmqVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        fgmq fgmqVarA = fgmqVar.a();
        if (fgmqVarA == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (fgmzVar != null) {
            return new fgom(fgmqVarA, fgmzVar);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    static boolean O(fgna fgnaVar) {
        return fgnaVar != null && fgnaVar.c() < 43200000;
    }

    private final fgms P(fgms fgmsVar, HashMap map) {
        if (fgmsVar == null || !fgmsVar.u()) {
            return fgmsVar;
        }
        if (map.containsKey(fgmsVar)) {
            return (fgms) map.get(fgmsVar);
        }
        fgok fgokVar = new fgok(fgmsVar, (fgmz) this.b, Q(fgmsVar.q(), map), Q(fgmsVar.s(), map), Q(fgmsVar.r(), map));
        map.put(fgmsVar, fgokVar);
        return fgokVar;
    }

    private final fgna Q(fgna fgnaVar, HashMap map) {
        if (fgnaVar == null || !fgnaVar.f()) {
            return fgnaVar;
        }
        if (map.containsKey(fgnaVar)) {
            return (fgna) map.get(fgnaVar);
        }
        fgol fgolVar = new fgol(fgnaVar, (fgmz) this.b);
        map.put(fgnaVar, fgolVar);
        return fgolVar;
    }

    @Override // defpackage.fgnp
    protected final void M(fgno fgnoVar) {
        HashMap map = new HashMap();
        fgnoVar.l = Q(fgnoVar.l, map);
        fgnoVar.k = Q(fgnoVar.k, map);
        fgnoVar.j = Q(fgnoVar.j, map);
        fgnoVar.i = Q(fgnoVar.i, map);
        fgnoVar.h = Q(fgnoVar.h, map);
        fgnoVar.g = Q(fgnoVar.g, map);
        fgnoVar.f = Q(fgnoVar.f, map);
        fgnoVar.e = Q(fgnoVar.e, map);
        fgnoVar.d = Q(fgnoVar.d, map);
        fgnoVar.c = Q(fgnoVar.c, map);
        fgnoVar.b = Q(fgnoVar.b, map);
        fgnoVar.a = Q(fgnoVar.a, map);
        fgnoVar.E = P(fgnoVar.E, map);
        fgnoVar.F = P(fgnoVar.F, map);
        fgnoVar.G = P(fgnoVar.G, map);
        fgnoVar.H = P(fgnoVar.H, map);
        fgnoVar.I = P(fgnoVar.I, map);
        fgnoVar.x = P(fgnoVar.x, map);
        fgnoVar.y = P(fgnoVar.y, map);
        fgnoVar.z = P(fgnoVar.z, map);
        fgnoVar.D = P(fgnoVar.D, map);
        fgnoVar.A = P(fgnoVar.A, map);
        fgnoVar.B = P(fgnoVar.B, map);
        fgnoVar.C = P(fgnoVar.C, map);
        fgnoVar.m = P(fgnoVar.m, map);
        fgnoVar.n = P(fgnoVar.n, map);
        fgnoVar.o = P(fgnoVar.o, map);
        fgnoVar.p = P(fgnoVar.p, map);
        fgnoVar.q = P(fgnoVar.q, map);
        fgnoVar.r = P(fgnoVar.r, map);
        fgnoVar.s = P(fgnoVar.s, map);
        fgnoVar.u = P(fgnoVar.u, map);
        fgnoVar.t = P(fgnoVar.t, map);
        fgnoVar.v = P(fgnoVar.v, map);
        fgnoVar.w = P(fgnoVar.w, map);
    }

    @Override // defpackage.fgmq
    public final fgmq a() {
        return this.a;
    }

    @Override // defpackage.fgmq
    public final fgmq b(fgmz fgmzVar) {
        return fgmzVar == this.b ? this : fgmzVar == fgmz.a ? this.a : new fgom(this.a, fgmzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgom)) {
            return false;
        }
        fgom fgomVar = (fgom) obj;
        if (this.a.equals(fgomVar.a)) {
            if (((fgmz) this.b).equals(fgomVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((fgmz) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        return "ZonedChronology[" + String.valueOf(this.a) + ", " + ((fgmz) this.b).c + "]";
    }

    @Override // defpackage.fgnp, defpackage.fgmq
    public final fgmz z() {
        return (fgmz) this.b;
    }
}
