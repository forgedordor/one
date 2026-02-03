package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class psz {
    public static final psz b = new psy(1.0f);
    public static final psz c = new psw();
    private final String a;

    public psz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof psz) {
            return fdbq.f(this.a, ((psz) obj).a);
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
