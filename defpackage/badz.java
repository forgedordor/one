package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class badz {
    public final String a;
    public final long b;
    public final long c;
    public final Optional d;

    public badz(String str, long j, long j2, Optional optional) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof badz)) {
            return false;
        }
        badz badzVar = (badz) obj;
        return this.b == badzVar.b && this.c == badzVar.c && Objects.equals(this.a, badzVar.a) && Objects.equals(this.d, badzVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.c), this.d);
    }
}
