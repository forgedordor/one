package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rew {
    public static final rev a = new reu();
    public final Object b;
    public final rev c;
    public final String d;
    public volatile byte[] e;

    public rew(String str, Object obj, rev revVar) {
        rvi.c(str);
        this.d = str;
        this.b = obj;
        rvi.f(revVar);
        this.c = revVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rew) {
            return this.d.equals(((rew) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
