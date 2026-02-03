package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctyd {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ctyd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctyd)) {
            return false;
        }
        ctyd ctydVar = (ctyd) obj;
        return this.a == ctydVar.a && this.b == ctydVar.b && this.c == ctydVar.c;
    }

    public final int hashCode() {
        return (((ctyc.a(this.a) * 31) + ctyc.a(this.b)) * 31) + ctyc.a(this.c);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableStartChatCoolRanchPhase3=" + this.b + ", enableEmergencyRow=" + this.c + ")";
    }

    public ctyd(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ ctyd(byte[] bArr) {
        this(false, false, false);
    }
}
