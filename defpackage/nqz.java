package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqz extends nrg {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final nrg[] g;

    public nqz(String str, int i, int i2, long j, long j2, nrg[] nrgVarArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = nrgVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nqz nqzVar = (nqz) obj;
            if (this.b == nqzVar.b && this.c == nqzVar.c && this.d == nqzVar.d && this.e == nqzVar.e && Objects.equals(this.a, nqzVar.a) && Arrays.equals(this.g, nqzVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b + 527;
        String str = this.a;
        long j = this.e;
        return (((((((i * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
