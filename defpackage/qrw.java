package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class qrw implements qrz {
    public final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof qrw) && fdbq.f(this.a, ((qrw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JsonString(jsonString=" + this.a + ")";
    }
}
