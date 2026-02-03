package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhqv extends dhph {
    public final etqc a;
    public final byte[] b;
    public final evqs c;
    public final boolean d;
    public final String e;

    public dhqv(etqc etqcVar, byte[] bArr) {
        etqcVar.getClass();
        this.a = etqcVar;
        this.b = bArr;
        this.c = null;
        this.d = true;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhqv)) {
            return false;
        }
        dhqv dhqvVar = (dhqv) obj;
        if (!fdbq.f(this.a, dhqvVar.a) || !fdbq.f(this.b, dhqvVar.b)) {
            return false;
        }
        evqs evqsVar = dhqvVar.c;
        if (!fdbq.f(null, null)) {
            return false;
        }
        boolean z = dhqvVar.d;
        String str = dhqvVar.e;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        return (((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 961) + 1231) * 31;
    }
}
