package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajx extends daka {
    public final Object a;

    public dajx(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dajx) && fdbq.f(this.a, ((dajx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.a + ")";
    }
}
