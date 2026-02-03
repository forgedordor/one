package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnv {
    public final String a;
    public final String b;

    public dhnv(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        String str = this.b;
        if (fdbq.f(str, "")) {
            return this.a;
        }
        return this.a + ":" + str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhnv)) {
            return false;
        }
        dhnv dhnvVar = (dhnv) obj;
        return fdbq.f(this.a, dhnvVar.a) && fdbq.f(this.b, dhnvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return a();
    }
}
