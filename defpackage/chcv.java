package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcv implements chda {
    private final eqdw a;

    public chcv(eqdw eqdwVar) {
        this.a = eqdwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chcv) && fdbq.f(this.a, ((chcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(inviteLink=" + this.a + ")";
    }
}
