package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrf {
    public final djsq a;
    public final dlrg b;

    public dlrf(djsq djsqVar, dlrg dlrgVar) {
        dlrgVar.getClass();
        this.a = djsqVar;
        this.b = dlrgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlrf)) {
            return false;
        }
        dlrf dlrfVar = (dlrf) obj;
        return fdbq.f(this.a, dlrfVar.a) && this.b == dlrfVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AnimatedEmojiUiData(mddFile=" + this.a + ", position=" + this.b + ")";
    }
}
