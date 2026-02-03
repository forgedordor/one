package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchz {
    private final Object a;
    private final String b;

    public dchz(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dchz)) {
            return false;
        }
        dchz dchzVar = (dchz) obj;
        return this.a == dchzVar.a && this.b.equals(dchzVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
