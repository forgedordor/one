package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whf implements whi {
    public final vvp a;
    public final String b;

    public whf(vvp vvpVar, String str) {
        this.a = vvpVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whf)) {
            return false;
        }
        whf whfVar = (whf) obj;
        return fdbq.f(this.a, whfVar.a) && fdbq.f(this.b, whfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Add(draftAttachment=" + this.a + ", textCaption=" + this.b + ")";
    }
}
