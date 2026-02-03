package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prs implements Comparable {
    public static final prs a;
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final fctc f = fctd.a(new fdae() { // from class: prr
        @Override // defpackage.fdae
        public final Object invoke() {
            prs prsVar = this.a;
            return BigInteger.valueOf(prsVar.b).shiftLeft(32).or(BigInteger.valueOf(prsVar.c)).shiftLeft(32).or(BigInteger.valueOf(prsVar.d));
        }
    });

    static {
        new prs(0, 0, 0, "");
        a = new prs(0, 1, 0, "");
        new prs(1, 0, 0, "");
    }

    public prs(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final BigInteger b() {
        Object objA = this.f.a();
        objA.getClass();
        return (BigInteger) objA;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(prs prsVar) {
        prsVar.getClass();
        return b().compareTo(prsVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof prs)) {
            return false;
        }
        prs prsVar = (prs) obj;
        return this.b == prsVar.b && this.c == prsVar.c && this.d == prsVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        String str2 = this.e;
        if (fdgn.H(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.b + '.' + this.c + '.' + this.d + str;
    }
}
