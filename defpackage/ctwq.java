package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwq {
    public final boolean a;
    public final boolean b;

    public ctwq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctwq)) {
            return false;
        }
        ctwq ctwqVar = (ctwq) obj;
        return this.a == ctwqVar.a && this.b == ctwqVar.b;
    }

    public final int hashCode() {
        return (ctwp.a(this.a) * 31) + ctwp.a(this.b);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableStartChatCoolRanchPhase3=" + this.b + ")";
    }

    public ctwq() {
        this(false, false);
    }
}
