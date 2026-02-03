package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffjc {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final ffjd d;

    public ffjc(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, ffjd ffjdVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = ffjdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffjc)) {
            return false;
        }
        ffjc ffjcVar = (ffjc) obj;
        return ffjcVar.c.equals(this.c) && ffjcVar.b.equals(this.b) && ffjcVar.a.equals(this.a);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ this.b.hashCode()) ^ this.a.hashCode();
    }
}
