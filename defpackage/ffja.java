package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffja {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;

    public ffja(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        if (i > bigInteger.bitLength() && !ffws.c("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.a = bigInteger2;
        this.b = bigInteger;
        this.c = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffja)) {
            return false;
        }
        ffja ffjaVar = (ffja) obj;
        BigInteger bigInteger = this.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(ffjaVar.c)) {
                return false;
            }
        } else if (ffjaVar.c != null) {
            return false;
        }
        return ffjaVar.b.equals(this.b) && ffjaVar.a.equals(this.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return iHashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
