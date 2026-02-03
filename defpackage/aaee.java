package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaee {
    public final fdae a;
    public final fdae b;
    public final boolean c;

    public aaee(fdae fdaeVar, fdae fdaeVar2, boolean z) {
        this.a = fdaeVar;
        this.b = fdaeVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaee)) {
            return false;
        }
        aaee aaeeVar = (aaee) obj;
        return fdbq.f(this.a, aaeeVar.a) && fdbq.f(this.b, aaeeVar.b) && this.c == aaeeVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SpeedBumpScreenArgs(onBack=" + this.a + ", onContinue=" + this.b + ", isGroupConversation=" + this.c + ")";
    }
}
