package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzr {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public cvzr(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvzr)) {
            return false;
        }
        cvzr cvzrVar = (cvzr) obj;
        return this.a == cvzrVar.a && this.b == cvzrVar.b && this.c == cvzrVar.c && this.d == cvzrVar.d;
    }

    public final int hashCode() {
        int iA = cvzq.a(this.a);
        boolean z = this.d;
        return (((((iA * 31) + cvzq.a(this.b)) * 31) + cvzq.a(this.c)) * 31) + cvzq.a(z);
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ", enableCoolRanchPhase3=" + this.b + ", enableGroupIconOnUpdate=" + this.c + ", showGroupIconUpdateLoadingIndicator=" + this.d + ")";
    }

    public cvzr() {
        this(true, false, false, false);
    }
}
