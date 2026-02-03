package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whh implements whi {
    public final vvp a;
    public final String b;

    public whh(vvp vvpVar, String str) {
        this.a = vvpVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whh)) {
            return false;
        }
        whh whhVar = (whh) obj;
        return fdbq.f(this.a, whhVar.a) && fdbq.f(this.b, whhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Send(draftAttachment=" + this.a + ", textCaption=" + this.b + ")";
    }
}
