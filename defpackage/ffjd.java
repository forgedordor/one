package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffjd {
    public final byte[] a;
    public final int b;

    public ffjd(byte[] bArr, int i) {
        this.a = ffwk.c(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffjd)) {
            return false;
        }
        ffjd ffjdVar = (ffjd) obj;
        if (ffjdVar.b == this.b) {
            return Arrays.equals(this.a, ffjdVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ffwk.a(this.a);
    }
}
