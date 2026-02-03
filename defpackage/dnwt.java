package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwt {
    public final String a;
    public fdap b;

    public dnwt(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnwt) && fdbq.f(this.a, ((dnwt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CustomStickerRecord(id=" + this.a + ")";
    }
}
