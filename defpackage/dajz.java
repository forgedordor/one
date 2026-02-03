package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajz extends daka {
    public final Object a;

    public dajz(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dajz) && fdbq.f(this.a, ((dajz) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Ready(data=" + this.a + ")";
    }
}
