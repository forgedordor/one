package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzx extends djzz {
    public final String a;

    public djzx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djzx) && fdbq.f(this.a, ((djzx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ")";
    }
}
