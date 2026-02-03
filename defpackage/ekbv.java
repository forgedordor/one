package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekbv implements ekoc {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekoc) {
            return d().equals(((ekoc) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
