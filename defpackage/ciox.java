package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciox extends cioy {
    private final int a;

    public ciox(int i) {
        super(1);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ciox) && this.a == ((ciox) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Success(numUpgraded=" + this.a + ")";
    }
}
