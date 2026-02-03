package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbr {
    public static final fffd a;
    public static final fffd b;
    public static final fffd c;
    public static final fffd d;
    public static final fffd e;
    public static final fffd f;
    public final fffd g;
    public final fffd h;
    public final int i;

    static {
        fffd fffdVar = fffd.a;
        a = fffc.b(":");
        b = fffc.b(":status");
        c = fffc.b(":method");
        d = fffc.b(":path");
        e = fffc.b(":scheme");
        f = fffc.b(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ffbr(String str, String str2) {
        this(fffc.b(str), fffc.b(str2));
        str2.getClass();
        fffd fffdVar = fffd.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffbr)) {
            return false;
        }
        ffbr ffbrVar = (ffbr) obj;
        return fdbq.f(this.g, ffbrVar.g) && fdbq.f(this.h, ffbrVar.h);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        fffd fffdVar = this.h;
        return this.g.e() + ": " + fffdVar.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ffbr(fffd fffdVar, String str) {
        this(fffdVar, fffc.b(str));
        fffdVar.getClass();
    }

    public ffbr(fffd fffdVar, fffd fffdVar2) {
        this.g = fffdVar;
        this.h = fffdVar2;
        this.i = fffdVar.b() + 32 + fffdVar2.b();
    }
}
