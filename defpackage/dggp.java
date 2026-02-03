package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggp implements dggn {
    public final String a;

    public dggp(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dggp) && fdbq.f(this.a, ((dggp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimId(idValue=" + this.a + ")";
    }
}
