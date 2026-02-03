package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmlw implements dmlx {
    public final dojw a;

    public dmlw(dojw dojwVar) {
        dojwVar.getClass();
        this.a = dojwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmlw) && fdbq.f(this.a, ((dmlw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(media=" + this.a + ")";
    }
}
