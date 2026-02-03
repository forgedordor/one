package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhzv {
    public final long a;
    public final byte[] b;

    public dhzv(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhzv)) {
            return false;
        }
        dhzv dhzvVar = (dhzv) obj;
        return this.a == dhzvVar.a && fdbq.f(this.b, dhzvVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "DEFAULT\n" + this.a + "\n" + eldz.e.j(this.b);
    }
}
