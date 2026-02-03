package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdb implements afzv {
    public final agdc a;

    public agdb(agdc agdcVar) {
        this.a = agdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agdb) && fdbq.f(this.a, ((agdb) obj).a);
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return "Home(arguments=" + this.a + ")";
    }
}
