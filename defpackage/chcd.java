package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcd implements chce {
    private final chbu a;

    public chcd(chbu chbuVar) {
        this.a = chbuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chcd) && fdbq.f(this.a, ((chcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(link=" + this.a + ")";
    }
}
