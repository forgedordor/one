package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctju {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ctju(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctju)) {
            return false;
        }
        ctju ctjuVar = (ctju) obj;
        return this.a == ctjuVar.a && this.b == ctjuVar.b && this.c == ctjuVar.c;
    }

    public final int hashCode() {
        return (((ctjt.a(this.a) * 31) + ctjt.a(this.b)) * 31) + ctjt.a(this.c);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableStartChatCoolRanchPhase3=" + this.b + ", hideKeyboardOnScroll=" + this.c + ")";
    }

    public ctju() {
        this(false, false, false);
    }
}
