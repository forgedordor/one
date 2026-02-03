package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqr {
    public static final fffd a;
    public static final fffd b;
    public static final fffd c;
    public static final fffd d;
    public static final fffd e;
    public final fffd f;
    public final fffd g;
    final int h;

    static {
        fffd fffdVar = fffd.a;
        a = fffc.b(":status");
        b = fffc.b(":method");
        c = fffc.b(":path");
        d = fffc.b(":scheme");
        e = fffc.b(":authority");
        fffc.b(":host");
        fffc.b(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fcqr(String str, String str2) {
        this(fffc.b(str), fffc.b(str2));
        fffd fffdVar = fffd.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fcqr) {
            fcqr fcqrVar = (fcqr) obj;
            if (this.f.equals(fcqrVar.f) && this.g.equals(fcqrVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.e(), this.g.e());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fcqr(fffd fffdVar, String str) {
        this(fffdVar, fffc.b(str));
        fffd fffdVar2 = fffd.a;
    }

    public fcqr(fffd fffdVar, fffd fffdVar2) {
        this.f = fffdVar;
        this.g = fffdVar2;
        this.h = fffdVar.b() + 32 + fffdVar2.b();
    }
}
