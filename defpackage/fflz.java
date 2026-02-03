package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflz implements fflv {
    protected final BigInteger a;

    public fflz(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.fflv
    public final int a() {
        return 1;
    }

    @Override // defpackage.fflv
    public final BigInteger b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fflz) {
            return this.a.equals(((fflz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
