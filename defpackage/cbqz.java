package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqz {
    public static final cbqz a = new cbqz(0);
    public static final cbqz b = new cbqz(1);
    public static final cbqz c;
    public static final cbqz d;
    public static final List e;
    public final long f;

    static {
        cbqz cbqzVar = new cbqz(2L);
        c = cbqzVar;
        cbqz cbqzVar2 = new cbqz(3L);
        d = cbqzVar2;
        e = fcva.g(cbqzVar, cbqzVar2);
    }

    public cbqz(long j) {
        this.f = j;
        if (j < 0 || j >= 4) {
            throw new IllegalArgumentException(a.A(j, "EncryptionProtocol value ", " must be in [0, 3]"));
        }
    }

    public final cbqz a(cbqz cbqzVar) {
        cbqzVar.getClass();
        return new cbqz(this.f | cbqzVar.f);
    }

    public final cbqz b(cbqz cbqzVar) {
        long j = cbqzVar.f;
        return new cbqz((~j) & this.f);
    }

    public final boolean c(cbqz cbqzVar) {
        cbqzVar.getClass();
        long j = this.f;
        long j2 = cbqzVar.f;
        return (j & j2) == j2;
    }

    public final boolean d() {
        return c(c) || c(b);
    }

    public final boolean e() {
        return c(c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbqz) && this.f == ((cbqz) obj).f;
    }

    public final boolean f() {
        return c(b);
    }

    public final int hashCode() {
        long j = this.f;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "EncryptionProtocol(value=" + this.f + ")";
    }
}
