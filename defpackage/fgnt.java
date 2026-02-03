package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fgnt extends fgnp {
    public static final fgms A;
    public static final fgms B;
    public static final fgms C;
    public static final fgms D;
    public static final fgms E;
    public static final fgms F;
    public static final fgna o;
    public static final fgna p;
    public static final fgna q;
    public static final fgna r;
    public static final fgna s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final fgna t;
    public static final fgna u;
    public static final fgms v;
    public static final fgms w;
    public static final fgms x;
    public static final fgms y;
    public static final fgms z;
    public final int G;
    private final transient fgns[] H;

    static {
        fgna fgnaVar = fgow.a;
        o = fgnaVar;
        fgpa fgpaVar = new fgpa(fgnc.k, 1000L);
        p = fgpaVar;
        fgpa fgpaVar2 = new fgpa(fgnc.j, 60000L);
        q = fgpaVar2;
        fgpa fgpaVar3 = new fgpa(fgnc.i, 3600000L);
        r = fgpaVar3;
        fgpa fgpaVar4 = new fgpa(fgnc.h, 43200000L);
        s = fgpaVar4;
        fgpa fgpaVar5 = new fgpa(fgnc.g, 86400000L);
        t = fgpaVar5;
        u = new fgpa(fgnc.f, 604800000L);
        v = new fgoy(fgmu.x, fgnaVar, fgpaVar);
        w = new fgoy(fgmu.w, fgnaVar, fgpaVar5);
        x = new fgoy(fgmu.v, fgpaVar, fgpaVar2);
        y = new fgoy(fgmu.u, fgpaVar, fgpaVar5);
        z = new fgoy(fgmu.t, fgpaVar2, fgpaVar3);
        A = new fgoy(fgmu.s, fgpaVar2, fgpaVar5);
        fgoy fgoyVar = new fgoy(fgmu.r, fgpaVar3, fgpaVar5);
        B = fgoyVar;
        fgoy fgoyVar2 = new fgoy(fgmu.o, fgpaVar3, fgpaVar4);
        C = fgoyVar2;
        D = new fgpf(fgoyVar, fgmu.q);
        E = new fgpf(fgoyVar2, fgmu.p);
        F = new fgnr();
    }

    public fgnt(fgmq fgmqVar, int i) {
        super(fgmqVar, null);
        this.H = new fgns[1024];
        this.G = i;
    }

    @Override // defpackage.fgnp
    protected void M(fgno fgnoVar) {
        throw null;
    }

    final int N(long j, int i, int i2) {
        return ((int) ((j - (ac(i) + ab(i, i2))) / 86400000)) + 1;
    }

    final int O(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    final int P(long j, int i) {
        return ((int) ((j - ac(i)) / 86400000)) + 1;
    }

    final int Q(long j) {
        int iY = Y(j);
        return R(iY, T(j, iY));
    }

    public abstract int R(int i, int i2);

    final int S(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int T(long j, int i);

    final int U(long j) {
        return V(j, Y(j));
    }

    final int V(long j, int i) {
        long jAa = aa(i);
        if (j < jAa) {
            return W(i - 1);
        }
        if (j >= aa(i + 1)) {
            return 1;
        }
        return ((int) ((j - jAa) / 604800000)) + 1;
    }

    final int W(int i) {
        return (int) ((aa(i + 1) - aa(i)) / 604800000);
    }

    final int X(long j) {
        int iY = Y(j);
        int iV = V(j, iY);
        return iV == 1 ? Y(j + 604800000) : iV > 51 ? Y(j - 1209600000) : iY;
    }

    final int Y(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long jAc = ac(i);
        long j4 = j - jAc;
        if (j4 < 0) {
            return i - 1;
        }
        if (j4 >= 31536000000L) {
            return jAc + (true == ag(i) ? 31622400000L : 31536000000L) > j ? i : i + 1;
        }
        return i;
    }

    public abstract long Z(int i);

    final long aa(int i) {
        long jAc = ac(i);
        return O(jAc) > 8 - this.G ? jAc + ((8 - r8) * 86400000) : jAc - ((r8 - 1) * 86400000);
    }

    public abstract long ab(int i, int i2);

    final long ac(int i) {
        fgns[] fgnsVarArr = this.H;
        int i2 = i & 1023;
        fgns fgnsVar = fgnsVarArr[i2];
        if (fgnsVar == null || fgnsVar.a != i) {
            fgns fgnsVar2 = new fgns(i, Z(i));
            fgnsVarArr[i2] = fgnsVar2;
            fgnsVar = fgnsVar2;
        }
        return fgnsVar.b;
    }

    final long ad(int i, int i2, int i3) {
        return ac(i) + ab(i, i2) + ((i3 - 1) * 86400000);
    }

    public abstract long ae(long j, int i);

    public boolean af(long j) {
        throw null;
    }

    public abstract boolean ag(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgnt fgntVar = (fgnt) obj;
            if (this.G == fgntVar.G && z().equals(fgntVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        fgmz fgmzVarZ = z();
        if (fgmzVarZ != null) {
            sb.append(fgmzVarZ.c);
        }
        int i = this.G;
        if (i != 4) {
            sb.append(",mdfw=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.fgnp, defpackage.fgmq
    public final fgmz z() {
        fgmq fgmqVar = this.a;
        return fgmqVar != null ? fgmqVar.z() : fgmz.a;
    }
}
