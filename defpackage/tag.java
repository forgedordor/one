package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tag {
    public final boolean a;
    public final enoq b;
    public final tab c;

    public tag(boolean z, enoq enoqVar, tab tabVar) {
        this.a = z;
        this.b = enoqVar;
        this.c = tabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tag)) {
            return false;
        }
        tag tagVar = (tag) obj;
        return this.a == tagVar.a && this.b == tagVar.b && fdbq.f(this.c, tagVar.c);
    }

    public final int hashCode() {
        enoq enoqVar = this.b;
        return ((((true != this.a ? 1237 : 1231) * 31) + (enoqVar == null ? 0 : enoqVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HandshakeResult(isSuccess=" + this.a + ", failureReason=" + this.b + ", result=" + this.c + ")";
    }
}
