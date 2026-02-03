package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akke {
    public final alwk a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public akke() {
        this(alwk.UNKNOWN_DESTINATION_TYPE, 0, 0, false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akke)) {
            return false;
        }
        akke akkeVar = (akke) obj;
        return this.a == akkeVar.a && this.b == akkeVar.b && this.c == akkeVar.c && this.d == akkeVar.d && this.e == akkeVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        return ((((((iHashCode + this.b) * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "NonNormalizedParticipantDebugInfo(destinationType=" + this.a + ", localDestinationLength=" + this.b + ", internationalDestinationLength=" + this.c + ", targetCallingCodeMatchesSelfIdentity=" + this.d + ", selfTargetCallingCode=" + this.e + ")";
    }

    public akke(alwk alwkVar, int i, int i2, boolean z, int i3) {
        alwkVar.getClass();
        this.a = alwkVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }
}
