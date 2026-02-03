package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvfg {
    public final boolean a;
    public final boolean b;

    public cvfg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvfg)) {
            return false;
        }
        cvfg cvfgVar = (cvfg) obj;
        return this.a == cvfgVar.a && this.b == cvfgVar.b;
    }

    public final int hashCode() {
        return (cvff.a(this.a) * 31) + cvff.a(this.b);
    }

    public final String toString() {
        return "AapmSpamState(isAapmEnabled=" + this.a + ", isSpamEnabled=" + this.b + ")";
    }
}
