package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evrq {
    private final Object a;
    private final int b;

    public evrq(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof evrq)) {
            return false;
        }
        evrq evrqVar = (evrq) obj;
        return this.a == evrqVar.a && this.b == evrqVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
