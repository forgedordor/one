package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csew {
    public final eykc a;

    public csew(eykc eykcVar) {
        eykcVar.getClass();
        this.a = eykcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csew) && this.a == ((csew) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerdictEnforcementResult(action=" + this.a + ")";
    }
}
