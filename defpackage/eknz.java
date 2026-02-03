package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknz extends ekoa implements Serializable, ejwm {
    public static final eknz a = new eknz(ekdv.a, ekdt.a);
    private static final long serialVersionUID = 0;
    public final ekdx b;
    public final ekdx c;

    public eknz(ekdx ekdxVar, ekdx ekdxVar2) {
        this.b = ekdxVar;
        this.c = ekdxVar2;
        if (ekdxVar.compareTo(ekdxVar2) > 0 || ekdxVar == ekdt.a || ekdxVar2 == ekdv.a) {
            throw new IllegalArgumentException("Invalid range: ".concat(l(ekdxVar, ekdxVar2)));
        }
    }

    static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static eknz c(Comparable comparable, Comparable comparable2) {
        return new eknz(new ekdw(comparable), new ekdu(comparable2));
    }

    public static eknz d(Comparable comparable, Comparable comparable2) {
        return new eknz(new ekdw(comparable), new ekdw(comparable2));
    }

    private static String l(ekdx ekdxVar, ekdx ekdxVar2) {
        StringBuilder sb = new StringBuilder(16);
        ekdxVar.c(sb);
        sb.append("..");
        ekdxVar2.d(sb);
        return sb.toString();
    }

    public final eknz e(eknz eknzVar) {
        ekdx ekdxVar = this.b;
        ekdx ekdxVar2 = eknzVar.b;
        int iA = ekdxVar.compareTo(ekdxVar2);
        ekdx ekdxVar3 = this.c;
        ekdx ekdxVar4 = eknzVar.c;
        int iA2 = ekdxVar3.compareTo(ekdxVar4);
        if (iA >= 0 && iA2 <= 0) {
            return this;
        }
        if (iA <= 0 && iA2 >= 0) {
            return eknzVar;
        }
        if (iA < 0) {
            ekdxVar = ekdxVar2;
        }
        if (iA2 > 0) {
            ekdxVar3 = ekdxVar4;
        }
        ejwl.i(ekdxVar.compareTo(ekdxVar3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, eknzVar);
        return new eknz(ekdxVar, ekdxVar3);
    }

    @Override // defpackage.ejwm
    public final boolean equals(Object obj) {
        if (obj instanceof eknz) {
            eknz eknzVar = (eknz) obj;
            if (this.b.equals(eknzVar.b) && this.c.equals(eknzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final Comparable f() {
        return this.b.b();
    }

    public final Comparable g() {
        return this.c.b();
    }

    @Override // defpackage.ejwm
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.b.e(comparable) && !this.c.e(comparable);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final boolean i(eknz eknzVar) {
        return this.b.compareTo(eknzVar.b) <= 0 && this.c.compareTo(eknzVar.c) >= 0;
    }

    public final boolean j(eknz eknzVar) {
        return this.b.compareTo(eknzVar.c) <= 0 && eknzVar.b.compareTo(this.c) <= 0;
    }

    public final boolean k() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        eknz eknzVar = a;
        return equals(eknzVar) ? eknzVar : this;
    }

    public final String toString() {
        return l(this.b, this.c);
    }
}
