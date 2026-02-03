package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pba {
    final int a;
    final int b;
    final long c;
    final long d;

    public pba(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pba)) {
            pba pbaVar = (pba) obj;
            if (this.b == pbaVar.b && this.c == pbaVar.c && this.a == pbaVar.a && this.d == pbaVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.a), Long.valueOf(this.d));
    }
}
