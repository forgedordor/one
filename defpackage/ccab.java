package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccab extends ccad {
    public final ccar a;

    public ccab(ccar ccarVar) {
        this.a = ccarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccab) && fdbq.f(this.a, ((ccab) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OutgoingMessage(outgoingMlsRcsMessage=" + this.a + ")";
    }
}
