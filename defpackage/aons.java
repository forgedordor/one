package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aons implements aont {
    public final String a;

    public aons(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aons) && fdbq.f(this.a, ((aons) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostAppNotFound(hostPackage=" + this.a + ")";
    }
}
