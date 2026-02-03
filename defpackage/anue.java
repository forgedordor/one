package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anue {
    public final String a;

    public anue(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anue) {
            return this.a.equals(((anue) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
