package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmma {
    public final boolean a;

    public dmma(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmma) && this.a == ((dmma) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableSimultaneousUseCases=" + this.a + ")";
    }

    public dmma() {
        this(false);
    }
}
