package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxc {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public xxc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxc)) {
            return false;
        }
        xxc xxcVar = (xxc) obj;
        return this.a == xxcVar.a && this.b == xxcVar.b && this.c == xxcVar.c;
    }

    public final int hashCode() {
        return (((xxb.a(this.a) * 31) + xxb.a(this.b)) * 31) + xxb.a(this.c);
    }

    public final String toString() {
        return "Flags(useComposeRowUiData=" + this.a + ", useDynamicComposeRowBackground=" + this.b + ", increaseMaxComposeRowHeight=" + this.c + ")";
    }
}
