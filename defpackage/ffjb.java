package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffjb {
    private final byte[] a;
    private final int b;

    public ffjb(byte[] bArr, int i) {
        this.a = ffwk.c(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffjb)) {
            return false;
        }
        ffjb ffjbVar = (ffjb) obj;
        if (ffjbVar.b == this.b) {
            return Arrays.equals(this.a, ffjbVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ffwk.a(this.a);
    }
}
