package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpj extends dhph {
    public final int a;
    private final byte[] b;
    private final dhzv c;

    public dhpj() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhpj)) {
            return false;
        }
        dhpj dhpjVar = (dhpj) obj;
        return this.a == dhpjVar.a && fdbq.f(this.b, dhpjVar.b) && fdbq.f(this.c, dhpjVar.c);
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            i = 0;
        }
        byte[] bArr = this.b;
        int iHashCode = bArr == null ? 0 : Arrays.hashCode(bArr);
        int i2 = i * 31;
        dhzv dhzvVar = this.c;
        return ((i2 + iHashCode) * 31) + (dhzvVar != null ? dhzvVar.hashCode() : 0);
    }

    public dhpj(int i, byte[] bArr, dhzv dhzvVar) {
        this.a = i;
        this.b = bArr;
        this.c = dhzvVar;
    }

    public /* synthetic */ dhpj(int i, int i2) {
        this(1 == (i2 & 1) ? 0 : i, null, null);
    }
}
